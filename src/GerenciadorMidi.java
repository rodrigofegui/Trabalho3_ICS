import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.LinkedList;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiMessage;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Track;

/**
 * Responsavel por gerenciar a manipulacao sobre o arquivo .mid,
 * tanto lendo como escrevendo na classe Java BaseadoMidi
 * @see BaseadoMidi
 * @author	Helio Santana
 * @author	Rodrigo Guimaraes
 * @version	1.0
 * @since	14/06/2016
 */
public class GerenciadorMidi {
	/**
	 * Arquivo midi, em si
	 * Sequencia associada ao arquivo
	 * Nome bruto do arquivo
	 * Nome tratado, utilizado como o nome de metodo
	 * Notas escritas no arquivo
	 * Arquivo virgem ou nao
	 */
	static File arqMidi = null;
	static Sequence sequenciaMidi = null;
	static String nomeArqMidi = "";
	static String nomeArqMidiTratado = "";
	static LinkedList<NotasMidi> notasLidas = new LinkedList<NotasMidi>();
	static boolean arqNovo = false;
	/**
	 * Maior amplitude possivel num arquivo midi
	 * Maior amplitude possivel apos normalizacao 
	 */
	static final int amplitudeMaxMidi = 127;
	static final float amplitudeMaxNormalizada = 5.10f;
	
	/**
	 * Construcao do gerenciador,
	 * conhecendo-se o nome do arquivo
	 * @param nomeArqMidi Nome do arquivo midi a ser gerenciado
	 */
	public GerenciadorMidi (String nomeArqMidi){
		GerenciadorMidi.nomeArqMidi = nomeArqMidi;
		
		try {
			GerenciadorMidi.arqMidi = new File(GerenciadorMidi.nomeArqMidi);
			GerenciadorMidi.sequenciaMidi = MidiSystem.getSequence(GerenciadorMidi.arqMidi);
			
			tratarNomeArqMidi();
			
		}catch (InvalidMidiDataException e) {
			System.out.println (e + " : Erro nos dados midi.");
		}catch (IOException e1) {
			System.out.println (e1);
		}
	}

	/**
	 * Leitura do arquivo midi
	 * @param nomeArqMidi Nome do arquivo midi a ser lido
	 */
	public static void lerArquivo (String nomeArqMidi){
		new GerenciadorMidi (nomeArqMidi);
		
		if (CriadorArquivo.verificarMelodia()){
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
	 */
	public static void escreverArquivo (){
		if (!notasLidas.isEmpty()){
			try {
				File arq = new File("src/BaseadoMidi.java");
				
				if (!arq.exists())
					arqNovo = true;
				
				RandomAccessFile gravarArq = new RandomAccessFile(arq, "rw");	
				
				if (arqNovo){
					System.out.println("Criando arquivo das melodias\n");
					escreverCabecalho (gravarArq);
				
				}else{
					System.out.println("Arquivo das melodias já existe\n");
					gravarArq.seek(arq.length() - 1);
					gravarArq.writeBytes("\n\n");
				}
				
			    escreverMelodia (gravarArq);
			  
			    gravarArq.close();
			    
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * Analisa a mensagem contida no arquivo midi
	 * @param mensagem Mensagem atual do arquivo
	 * @param instante Momento em que ocorre a mensagem
	 */
	private static void tratarMensagem (MidiMessage mensagem, float instante){
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
	private static int localizarNota (LinkedList<NotasMidi> lista, NotasMidi notaAlvo){
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
	private static void preencherInicio (LinkedList<NotasMidi> lista){
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
	 */
	private static void escreverCabecalho (RandomAccessFile arquivo){
		try {
			arquivo.writeBytes("import sintese.Melodia;\n");
			arquivo.writeBytes("import sintese.Melodia;\n");
			arquivo.writeBytes("import sintese.Nota;");
			arquivo.writeBytes("\n\n");
			
			arquivo.writeBytes("public class BaseadoMidi {");
			arquivo.writeBytes("\n\n");
			
			arquivo.writeBytes("\tstatic Melodia 	 melodiaPrincipal;\n");
			arquivo.writeBytes("\tstatic Nota 	 nota;");
			arquivo.writeBytes("\n\n");
			
			arquivo.writeBytes("\tpublic BaseadoMidi (){\n");
			arquivo.writeBytes("\t\tmelodiaPrincipal = new Melodia();\n");
			arquivo.writeBytes("\t\tmelodiaPrincipal.setSeminima (1);\n");
			arquivo.writeBytes("\t\tmelodiaPrincipal.setAndamento (0.62f);\n");
			arquivo.writeBytes("\t}");
			arquivo.writeBytes("\n\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Escrita da melodia extraida do arquivo midi, em si
	 * @param arquivo Arquivo que contera as informacoes escritas
	 */
	private static void escreverMelodia (RandomAccessFile arquivo){
		try {
			arquivo.writeBytes("\tpublic static Melodia ");
			arquivo.writeBytes(nomeArqMidiTratado);
			arquivo.writeBytes(" (){\n");
			arquivo.writeBytes("\t\tnew BaseadoMidi();");
			arquivo.writeBytes("\n\n");
			
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
			arquivo.writeBytes("}");
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Tratamento do nome arquivo midi, nome a ser utilizado como identificador
	 * do metodo para a melodia correspondente
	 */
	private static void tratarNomeArqMidi (){
		int indInicio = nomeArqMidi.lastIndexOf("/");
		int indFinal = nomeArqMidi.lastIndexOf(".");
		int indFinal1 = nomeArqMidi.lastIndexOf("-");
		
		if (indFinal1 > indInicio)
			indFinal = indFinal1;
		
		nomeArqMidiTratado = nomeArqMidi.substring (indInicio + 1, indFinal);
		
		nomeArqMidiTratado = nomeArqMidiTratado.replace ("_", " ");
		nomeArqMidiTratado = nomeArqMidiTratado.replace (".", " ");
		
		StringBuilder intermedio = new StringBuilder(nomeArqMidiTratado); 
		
		for (int i = 0; i < nomeArqMidiTratado.length(); i++){
			if ((nomeArqMidiTratado.charAt(i) == 32) & (i + 1 < nomeArqMidiTratado.length())){
				intermedio.setCharAt(i + 1, Character.toUpperCase(nomeArqMidiTratado.charAt(i + 1)));
			}
		}
		
		nomeArqMidiTratado = intermedio.toString();
		
		nomeArqMidiTratado = nomeArqMidiTratado.replace (" ", "");
		nomeArqMidiTratado = Character.toLowerCase(nomeArqMidiTratado.charAt(0)) + nomeArqMidiTratado.substring (1, nomeArqMidiTratado.length());
	}
}