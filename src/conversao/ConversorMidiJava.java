package conversao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.LinkedList;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiMessage;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Track;

/**
 * Responsavel por gerenciar o processo de conversao do arquivo midi
 * em classe Java, default para BaseadoMidi
 * @author	Helio Santana
 * @author	Rodrigo Guimaraes
 * @version	1.0
 * @since	14/06/2016
 */
public class ConversorMidiJava {
	/**
	 * Arquivo midi, em si
	 * Sequencia associada ao arquivo
	 * Nome bruto do arquivo
	 * Nome tratado, utilizado como o nome de metodo
	 * Notas escritas no arquivo
	 * Nome padrao para o arquivo das melodias ja registradas
	 * Melodias que ja foram registradas
	 * Arquivo virgem ou nao
	 */
	static File arqMidi = null;
	static Sequence sequenciaMidi = null;
	static String nomeArqMidi = "";
	static String nomeArqMidiTratado = "";
	static LinkedList<NotasMidi> notasLidas = new LinkedList<NotasMidi>();
	static String arqPadrao = "melodiasRegistradas.txt";
	static LinkedList<String> melodiasRegistradas = null;
	static boolean arqNovo = false;
	/**
	 * Maior amplitude possivel num arquivo midi
	 * Maior amplitude possivel apos normalizacao 
	 */
	static final int amplitudeMaxMidi = 127;
	static final float amplitudeMaxNormalizada = 5.10f;
	static final String nomeClasseCriada = "src/melodias/BaseadoMidi.java";

	/**
	 * Construcao do conversor de maneira default
	 */
	public ConversorMidiJava (){
		melodiasRegistradas = new LinkedList<String>();
		
		carregarMelodias ();
	}
	
	/**
	 * Construcao do conversor, conhecendo-se
	 * o nome do arquivo midi
	 * @param nome Nome do arquivo midi
	 */
	public ConversorMidiJava (String nome){
		new ConversorMidiJava();
		
		nomeArqMidi = nome;
		
		try {
			arqMidi = new File(nomeArqMidi);

			sequenciaMidi = MidiSystem.getSequence(arqMidi);

			nomeArqMidiTratado = tratarNomeArqMidi (nomeArqMidi, false);

		}catch (InvalidMidiDataException e) {
			System.out.println (e + " : Erro nos dados midi.");

		}catch (IOException e1) {
			System.out.println (e1);

		}
	}
	
	/**
	 * Conversao do arquivo midi para uma classe Java
	 * @param nome Nome do arquivo midi
	 */
	public static void converterArquivo (String nome){
		new ConversorMidiJava(nome);

		lerArquivo (nome);

		escreverArquivo (nomeClasseCriada);	

		compilarMelodias ();
	}
	
	/**
	 * Leitura do arquivo midi
	 * @param nomeArqMidi Nome do arquivo midi a ser lido
	 */
	public static void lerArquivo (String nomeArqMidi){
		System.out.println("\nLendo arquivo\n");
		
		new ConversorMidiJava (nomeArqMidi);
		
		if (verificarMelodia(melodiasRegistradas, nomeArqMidiTratado)){
			long duracao     = sequenciaMidi.getMicrosecondLength() / 1000000;
			long totaltiques = sequenciaMidi.getTickLength();
			float durtique = (float)duracao/totaltiques;
	
			Track[] trilhasDetectadas = sequenciaMidi.getTracks();
	
			for (int indTrilha = 0; indTrilha < trilhasDetectadas.length; indTrilha++){
				Track trilhaAtual = trilhasDetectadas[indTrilha];
	
				for (int indEvento = 0; indEvento < trilhaAtual.size(); indEvento++){
					MidiEvent evento = trilhaAtual.get(indEvento);
					MidiMessage mensagem = evento.getMessage();
					long tique = evento.getTick();
	
					tratarMensagem (mensagem, (tique * durtique));
				}
			}
	
			preencherInicio (notasLidas);
		}
	}

	/**
	 * Escrita da melodia extraida do arquivo midi numa
	 * classe Java
	 * @param nomeClasse Nome da classe Java
	 */
	public static void escreverArquivo (String nomeClasse){
		if (!notasLidas.isEmpty()){
			System.out.println("Escrevendo arquivo\n");

			try {
				File arq = new File (nomeClasse);

				if (!arq.exists())
					arqNovo = true;

				RandomAccessFile gravarArq = new RandomAccessFile(arq, "rw");	

				if (arqNovo){
					System.out.println("Criando arquivo das melodias\n");
					escreverCabecalho (gravarArq, nomeClasse);

				}else{
					System.out.println("Arquivo das melodias já existe\n");
					int desloca = posicionarSeek(arq, "	public static Melodia padrao (String nome){");
					if (desloca == -1)	desloca = 0;
					gravarArq.seek (desloca);
					gravarArq.writeBytes("\n");
				}
				
				escreverMelodia (gravarArq, nomeArqMidiTratado);
			  
			    gravarArq.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			System.out.println("Acabou de escrever\n");
		
		}else{
			System.out.println("Não há notas a converter\n");
		}
	}
	
	/**
	 * Compilar o arquivo Java modificado com a melodia midi,
	 * disponibilizando-a para uso
	 */
	public static void compilarMelodias() {
		String[] comandos = {"make", "compilarMelodias"};
	    Process p;
	    
		try {
			p = Runtime.getRuntime().exec(comandos);
			InputStream respostaBruta = p.getInputStream();
		    String resposta = convertStreamToString (respostaBruta);
		    System.out.println(resposta);
		    
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Analisa a mensagem contida no arquivo midi
	 * @param mensagem Mensagem atual do arquivo
	 * @param instante Momento em que ocorre a mensagem
	 */
	public static void tratarMensagem (MidiMessage mensagem, float instante){
		int IdOperacao = mensagem.getStatus();
		
		/*	Sendo "noteOn" ou "noteOff" */
		if ((128 <= IdOperacao) & (IdOperacao <= 159)){
			byte[] dados = mensagem.getMessage();
			NotasMidi notaAux = new NotasMidi();
			boolean noteOn;
			
			if (IdOperacao < 144)
				noteOn = false;
			else
				noteOn = true;
		
			if (noteOn & (dados[2] > 0)){
				notaAux.setFrequencia (dados[1]);
				notaAux.setAmplitude (dados[2]);
				notaAux.setInstanteInical (instante);
				
				notasLidas.add(notaAux);
			
			}else if (((noteOn & (dados[2] == 0))
					  || !noteOn) & !notasLidas.isEmpty()){
				notaAux.setFrequencia (dados[1]);
				
				int indice = localizarNota (notasLidas, notaAux);
				
				if (indice > -1){
					notasLidas.get(indice).setInstanteFinal (instante);
					notasLidas.get(indice).setDuracao();
				}
			}
		}
	}

	/**
	 * Busca da nota dentre as notas ja registradas
	 * @param lista Lista com as notas registradas
	 * @param notaAlvo Nota que se deseja encontrar
	 * @return Indice da nota encontrada ou -1, caso nao encontre
	 */
	public static int localizarNota (LinkedList<NotasMidi> lista, NotasMidi notaAlvo){
		for (int ind = 0; ind < lista.size(); ind++){
			NotasMidi notaAtual = lista.get(ind);
			
			if ((notaAtual.getFrequencia() == notaAlvo.getFrequencia())
				& (notaAtual.getDuracao() == 0f)){
				return ind;
			}
		}
		
		return -1;
	}

	/**
	 * Preenchimento do inicio da musica com vazio
	 * @param lista Lista com as notas registradas
	 */
	public static void preencherInicio (LinkedList<NotasMidi> lista){
		if (lista.getFirst().getInstanteInicial() != 0f){
			NotasMidi notaVazia = new NotasMidi();
			
			notaVazia.setInstanteFinal(lista.getFirst().getInstanteInicial());
			notaVazia.setDuracao();
			
			lista.addFirst(notaVazia);
		}
	}

	/**
	 * Escrita das informacoes inerentes a melodia, essencial para a
	 * correta interpretacao em Java
	 * @param arquivo Arquivo que contera as informacoes escritas
	 * @param nomeClasse Nome da classe a ser criada
	 */
	public static void escreverCabecalho (RandomAccessFile arquivo, String nomeClasse){
		try {
			nomeClasse = tratarNomeArqMidi (nomeClasse, true);
			arquivo.writeBytes ("package melodias;");
			arquivo.writeBytes ("\n\n");
			
			arquivo.writeBytes ("import sintese.Melodia;\n");
			arquivo.writeBytes ("import sintese.Melodia;\n");
			arquivo.writeBytes ("import sintese.Nota;");
			arquivo.writeBytes ("\n\n");
			
			arquivo.writeBytes ("/**\n");
			arquivo.writeBytes (" * Responsavel por armazenar os metodos Java criados\n");
			arquivo.writeBytes (" * a partir de arquivos midi\n");
			arquivo.writeBytes (" * @author	Helio Santana\n");
			arquivo.writeBytes (" * @author	Rodrigo Guimaraes\n");
			arquivo.writeBytes (" * @version	1.0\n");
			arquivo.writeBytes (" * @since	14/06/2016\n");
			arquivo.writeBytes (" */\n");

			arquivo.writeBytes ("public class ");
			arquivo.writeBytes (nomeClasse);
			arquivo.writeBytes ("{");
			arquivo.writeBytes ("\n");

			arquivo.writeBytes ("\tstatic Melodia 	 melodiaPrincipal;\n");
			arquivo.writeBytes ("\tstatic Nota 	 nota;");
			arquivo.writeBytes ("\n\n");

			arquivo.writeBytes ("\tpublic ");
			arquivo.writeBytes (nomeClasse); 
			arquivo.writeBytes (" (){\n");
			arquivo.writeBytes ("\t\tmelodiaPrincipal = new Melodia();\n");
			arquivo.writeBytes ("\t\tmelodiaPrincipal.setSeminima (1);\n");
			arquivo.writeBytes ("\t\tmelodiaPrincipal.setAndamento (0.62f);\n");
			arquivo.writeBytes ("\t}");
			arquivo.writeBytes ("\n\n");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Escrita da melodia extraida do arquivo midi, em si
	 * @param arquivo Arquivo que contera as informacoes escritas
	 * @param nomeMetodo Nome do metodo a inserido no arquivo
	 */
	public static void escreverMelodia (RandomAccessFile arquivo, String nomeMetodo){
		try {
			arquivo.writeBytes ("\n\tpublic static Melodia ");
			arquivo.writeBytes (nomeMetodo);
			arquivo.writeBytes (" (){\n");
			arquivo.writeBytes ("\t\tnew BaseadoMidi();");
			arquivo.writeBytes ("\n\n");
			
			for (int indNota = 0; indNota < notasLidas.size(); indNota++){
				NotasMidi notaAtual = notasLidas.get(indNota);
				float amplitude = ((amplitudeMaxNormalizada * notaAtual.getAmplitude()) / amplitudeMaxMidi);
				
				arquivo.writeBytes("\t\tnota = new Nota (");
				arquivo.writeBytes(notaAtual.getDuracao() + ", ");
				arquivo.writeBytes(notaAtual.getFrequencia() + ", ");
				arquivo.writeBytes(amplitude + ");\n");
				arquivo.writeBytes("\t\tmelodiaPrincipal.addNota (nota);");
				arquivo.writeBytes("\n\n");
			}
			
			arquivo.writeBytes("\n");
			arquivo.writeBytes("\t\treturn melodiaPrincipal;\n");
			arquivo.writeBytes("\t}\n");
			arquivo.writeBytes("} ");
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Verificacao sobre o status de uma melodia,
	 * se ja foi convertida para classe Java
	 * @param lista Lista das melodias registradas
	 * @param alvo Melodia a ser analisada
	 * @return Permissao (true) ou nao (false) para continuar o processo
	 */
	public static boolean verificarMelodia (LinkedList<String> lista, String alvo){
		if (lista.indexOf(alvo) == -1){
			System.out.println("\nMúsica não existe\n");
			
			lista.add(alvo);
			
			return true;
		}
		
		System.out.println("\nMúsica já existe\n");
		return false;
	}
	
	/**
	 * Extrai as melodias registradas do arquivo padrao,
	 * para tal tarefa
	 */
	public static void carregarMelodias (){
		try {
		      FileReader arq = new FileReader(arqPadrao);
		      
		      if (arq != null){
			      BufferedReader lerArq = new BufferedReader(arq);
			 
			      String linha = ""; 
			      
			      do{
			    	  linha = lerArq.readLine();
			    	  
			    	  if (linha != null)	melodiasRegistradas.add(linha);
			    	  else 					break;
			    	  
			      }while (true);
			 
			      arq.close();
		      }
		      
	    } catch (IOException e) {
	        System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
	    }
	}
		
	/**
	 * Registro das melodias ja analisadas no arquivo padrao
	 * e na funcao gerenciadora
	 */
	public static void registrarMelodias (){
		if (melodiasRegistradas != null){
			registrarMelodiasNoTxt();
			
			registrarMelodiasNaClasse ();
		}
	}

	/**
	 * Registro das melodias ja analisadas no arquivo padrao
	 */
	private static void registrarMelodiasNoTxt() {
		if (!melodiasRegistradas.isEmpty()){
			try {
				File arq = new File(arqPadrao);
				
				RandomAccessFile gravarArq = new RandomAccessFile(arq, "rw");	
				
				for (int indMelodia = 0; indMelodia < melodiasRegistradas.size(); indMelodia++){
					gravarArq.writeBytes (melodiasRegistradas.get(indMelodia) + "\n");
				}
			  
			    gravarArq.close();
			    
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Registro das melodias ja analisadas na classe Java criada
	 */
	private static void registrarMelodiasNaClasse (){
		try {
			File arq = new File (nomeClasseCriada);

			if (arq.exists()){
				RandomAccessFile gravarArq = new RandomAccessFile(arq, "rw");	
	
				gravarArq.seek(posicionarSeek(arq, "	public static Melodia padrao (String nome){") - 3);
				//gravarArq.writeBytes("\t//");
				
			    escreverFuncaoPadrao (gravarArq);
			  
			    gravarArq.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Construcao do metodo criada dinamicamente sobre o controle
	 * melodias criadas e armazenadas
	 * @param arquivo Arquivo onde sera escrito o metodo
	 */
	public static void escreverFuncaoPadrao (RandomAccessFile arquivo){
		try {
			arquivo.writeBytes ("\n\tpublic static Melodia padrao (String nome){\n");
			
			for (int indMelodia = 0; indMelodia < melodiasRegistradas.size(); indMelodia++){
				if (indMelodia == 0)
					arquivo.writeBytes ("\t\t");
				else
					arquivo.writeBytes ("\n\t\telse ");
				
				arquivo.writeBytes ("if (nome.equals(\"" + melodiasRegistradas.get(indMelodia) + "\"))\n");
				arquivo.writeBytes ("\t\t\treturn " + melodiasRegistradas.get(indMelodia) + "();");
			}
			
			arquivo.writeBytes ("\n\t\telse return null;");
			
			arquivo.writeBytes ("\n\t}\n");
			arquivo.writeBytes ("}");
		
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Tratamento do nome arquivo midi, nome a ser utilizado como identificador
	 * do metodo para a melodia correspondente
	 * @param bruta Nome base para o tratamento
	 * @param classe Sinalizar se sera o nome de uma classe ou metodo
	 * @return Nome tratado, seguindo o parametro classe
	 */
	public static String tratarNomeArqMidi (String bruta, boolean classe){
		int indInicio = bruta.lastIndexOf("/");
		int indFinal = bruta.lastIndexOf(".");
		int indFinal1 = bruta.lastIndexOf("-");
		
		if (indFinal1 > indInicio)
			indFinal = indFinal1;
		
		String tratada = bruta.substring (indInicio + 1, indFinal);
		
		tratada = tratada.replace ("_", " ");
		tratada = tratada.replace (".", " ");
		
		StringBuilder intermedio = new StringBuilder(tratada); 
		
		for (int i = 0; i < tratada.length(); i++){
			if ((tratada.charAt(i) == 32) & (i + 1 < tratada.length())){
				intermedio.setCharAt(i + 1, Character.toUpperCase(tratada.charAt(i + 1)));
			}
		}
		
		tratada = intermedio.toString();
		
		tratada = tratada.replace (" ", "");
		
		if (!classe)
			tratada = Character.toLowerCase(tratada.charAt(0)) + tratada.substring (1, tratada.length());
		else
			tratada = Character.toUpperCase(tratada.charAt(0)) + tratada.substring (1, tratada.length());
		
		return tratada;
	}

	/**
	 * Posicionar o ponteiro do arquivo em relacao a busca
	 * @param arqAlvo Arquivo base para a operacao
	 * @param alvo Ponto de parada da busca
	 * @return	Deslocamento referencial ao inicio
	 */
	public static int posicionarSeek (File arqAlvo, String alvo){
		try {
		      FileReader arq = new FileReader(arqAlvo);
		      int deslocamento = 0;
		      
		      if (arq != null){
			      BufferedReader lerArq = new BufferedReader(arq);
			      String linha = ""; 
			      
			      do{
			    	  linha = lerArq.readLine();
			    	  
			    	  if (linha != null){
			    		  /*
				    	  System.out.println("L: (" + linha.length() + ") " + linha);
				    	  System.out.println("A: (" + alvo.length() + ") " + alvo + "\n");
				    	  //retardo (500);
				    	  //*/
			    		  //deslocamento += linha.getBytes("UTF-8").length;
			    		  deslocamento += (linha.length() + 1);
			    		  
			    		  if (linha.equals(alvo)){
			    			  deslocamento -= (linha.length() + 3);
				    		  //System.out.println("Deslocamento de " + deslocamento + " bytes.\n");
				    		  break;
				    	  }
			    	  }else break;

			      }while (deslocamento < arqAlvo.length());
			 
			      arq.close();
		      }
		      
		      //System.out.println("Saindo com deslocamento de " + deslocamento);
		      return deslocamento;
		      
	    } catch (IOException e) {
	        System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
	    }
		return 0;
	}
	
	/**
	 * Conversao da stream do resultado do comando em terminal para
	 * String legivel pelo Java
	 * @param respostaBruta Resposta no formato Stream
	 * @return Resposta convertida em String
	 * @throws IOException Caso não exista a respostaBruta
	 */
	public static String convertStreamToString (InputStream respostaBruta) throws IOException {
		if(respostaBruta != null) {
        	Writer escritor = new StringWriter();
        	char[] armazenado = new char[1024];
        
        	try {
        		Reader reader = new BufferedReader(new InputStreamReader(respostaBruta, "ISO-8859-1"));
        		int n;

        		while((n = reader.read(armazenado)) != -1) {
        			escritor.write(armazenado, 0, n);
        		}
        		
        	}finally {
        		respostaBruta.close();
        	}
        	
        	return escritor.toString();
        	
		}else {
			return "";
		}
	}
}
