package melodias;

import sintese.Melodia;
import sintese.Nota;

/**
 * Responsavel por armazenar os metodos Java criados
 * a partir de arquivos midi
 * @author	Helio Santana
 * @author	Rodrigo Guimaraes
 * @version	1.0
 * @since	14/06/2016
 */
public class BaseadoMidi{
	static Melodia 	 melodiaPrincipal;
	static Nota 	 nota;

	public BaseadoMidi (){
		melodiaPrincipal = new Melodia();
		melodiaPrincipal.setSeminima (1);
		melodiaPrincipal.setAndamento (0.62f);
	}

	public static Melodia mvioloncelo1 (){
		new BaseadoMidi();

		nota = new Nota (1.2, 233.05911, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.85599995, 130.8, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.3440001, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.51399994, 123.45876, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.342, 164.79768, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.3440001, 219.9785, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.5140002, 164.79768, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.342, 219.9785, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.34399986, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.17000008, 233.05911, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.34399986, 233.05911, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.342, 207.63206, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.34400034, 146.81804, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1699996, 138.57777, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.34400034, 184.97914, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.342, 184.97914, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.17199993, 293.63608, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.17199993, 311.0966, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.17000008, 130.8, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.34399986, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.34200048, 130.8, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.17199993, 155.5483, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.17199993, 587.27216, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.17000008, 184.97914, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.34399986, 123.45876, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.17000008, 174.59706, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.17199993, 155.5483, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.17199993, 155.5483, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.17199993, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.17000008, 138.57777, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.17199993, 155.5483, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.17199993, 233.05911, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.17000008, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.17199993, 123.45876, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.17199993, 164.79768, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.17199993, 207.63206, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.17000008, 146.81804, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.17199993, 146.81804, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.17199993, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.17000008, 233.05911, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.17199993, 164.79768, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.17199993, 155.5483, 3.2125983);
		melodiaPrincipal.addNota (nota);


		return melodiaPrincipal;
	}

	public static Melodia gerenciador (String nome){
		if (nome.equals("mvioloncelo1"))
			return mvioloncelo1();
		else return null;
	}
}