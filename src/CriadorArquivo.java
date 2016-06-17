import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.LinkedList;

/**
 * Responsavel pelo controle da insercao ou nao de uma melodia
 * midi na classe Java, considerando sua preexistencia
 * @author Helio Santana
 * @author Rodrigo Guimaraes
 * @version	1.0
 * @since	14/06/2016
 */
public class CriadorArquivo {
	/**
	 * Nome padrao para o arquivo das melodias ja registradas
	 * Melodias que ja foram registradas
	 */
	static String arqPadrao = "melodiasRegistradas.txt";
	static LinkedList<String> melodiasRegistradas = null;
	
	/**
	 * Construcao do criado de maneira default 
	 */
	public CriadorArquivo(){
		melodiasRegistradas = new LinkedList<String>();
		
		carregarMelodias ();
		
		System.out.println("\nLendo arquivo\n");
		
		//GerenciadorMidi.lerArquivo ("musicas/Let It Go.mid");
		//GerenciadorMidi.lerArquivo ("musicas/mvioloncelo1.mid");
		//GerenciadorMidi.lerArquivo ("musicas/The Rains of Castamere.mid");
		//GerenciadorMidi.lerArquivo ("musicas/Ainda bem - Mariza Monte.mid");
		GerenciadorMidi.lerArquivo ("musicas/Super_Mario_Bros_-_Overworld_Theme_by_BlueSCD.mid");
		
		System.out.println("Escrevendo arquivo\n");
		
		GerenciadorMidi.escreverArquivo();
		
		System.out.println("Acabou de escrever\n");
	}
	
	/**
	 * Verificacao sobre o status de uma melodia,
	 * se ja foi convertida para classe Java
	 * @return Permissao (true) ou nao (false) para continuar o processo
	 */
	public static boolean verificarMelodia (){
		if (melodiasRegistradas.indexOf(GerenciadorMidi.nomeArqMidiTratado) == -1){
			System.out.println("\nMúsica não existe\n");
			
			melodiasRegistradas.add(GerenciadorMidi.nomeArqMidiTratado);
			
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
			      
			      while (linha != null) {
			    	  linha = lerArq.readLine();
			    	  
			    	  melodiasRegistradas.add(linha);
			      }
			 
			      arq.close();
		      }
		      
	    } catch (IOException e) {
	        System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
	    }
	}
		
	/**
	 * Registro das melodias ja analisadas no arquivo padrao 
	 */
	public static void registrarMelodias (){
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
}
