import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;

/** 
 * Constroi as condicoes basicas para a execucao do programa:<br>
 * que visa converter melodias de arquivos .mid em melodias executaveis por<br>
 * instrumentos construidos baseados no pacote
 * <a href="http://cic.unb.br/~lcmm/cic-icsonica-2016-1/ics/trabalhos/sintese/javadoc/index.html">sintese</a>.<br>
 * @author	Helio Santana
 * @author	Rodrigo Guimaraes
 * @version	1.0
 * @since	14/06/2016
 */
public class Principal {
	/**
	 * Garante a execucao do programa
	 * @param args Argumentos recebidos via linha de comando
	 */
	public static void main (String args[]){
		new CriadorArquivo();
		
		compilarMelodias();
		
		encerrarAtividades();
	}

	private static void encerrarAtividades() {
		CriadorArquivo.registrarMelodias();
		System.out.println("Acabou tudo\n");
		System.gc();
	}

	private static void compilarMelodias() {
		String[] comandos = {"make", "compilarMelodias"};
	    //String[] comandos = {"pwd", ""};
	    Process p;
	    
		try {
			p = Runtime.getRuntime().exec(comandos);
			InputStream is = p.getInputStream();
		    String resposta = convertStreamToString(is);
		    System.out.println(resposta);
		    
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static String convertStreamToString (InputStream is) throws IOException {
		if(is != null) {
        	Writer writer = new StringWriter();
        	char[] buffer = new char[1024];
        
        	try {
        		Reader reader = new BufferedReader(new InputStreamReader(is, "ISO-8859-1"));
        		int n;

        		while((n = reader.read(buffer)) != -1) {
        			writer.write(buffer, 0, n);
        		}
        	} finally {
        		is.close();
        	}
        		return writer.toString();
		} else {
			return "";
		}
	}
	
}
