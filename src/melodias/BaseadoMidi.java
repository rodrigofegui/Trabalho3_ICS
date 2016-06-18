package melodias;

import sintese.Melodia;
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


	public static Melodia superMarioBros (){
		new BaseadoMidi();

		nota = new Nota (0.14864865, 369.95828, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864865, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864865, 369.95828, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864865, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864865, 369.95828, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864865, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864868, 369.95828, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864868, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864868, 369.95828, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864868, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864862, 391.95715, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864862, 493.83505, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864862, 783.9143, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864862, 391.95715, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864874, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864874, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486485, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486485, 391.95715, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486485, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486485, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486485, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486485, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864874, 293.63608, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864874, 493.83505, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 277.15555, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 466.11823, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864874, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864874, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.19829512, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.19829512, 391.95715, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.19800472, 391.95715, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.19800472, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.19829464, 493.83505, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.19829464, 783.9143, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864874, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864874, 879.914, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864874, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864874, 698.38824, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 493.83505, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 783.9143, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864874, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864874, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864874, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864874, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864874, 349.19412, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864874, 587.27216, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 293.63608, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 493.83505, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864874, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864874, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864874, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864874, 391.95715, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 293.63608, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 493.83505, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 277.15555, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 466.11823, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.19829464, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.19829464, 391.95715, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.19800472, 391.95715, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.19800472, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 493.83505, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 783.9143, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 879.914, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 698.38824, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 493.83505, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 783.9143, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 349.19412, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 587.27216, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 293.63608, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 493.83505, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 783.9143, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 622.1932, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 739.91656, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 587.27216, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 698.38824, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 493.83505, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 622.1932, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 415.26413, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 349.19412, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 391.95715, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 349.19412, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 587.27216, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 783.9143, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 622.1932, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 739.91656, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 587.27216, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 698.38824, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 493.83505, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 622.1932, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 698.38824, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 783.9143, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 1046.4, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 698.38824, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 783.9143, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 1046.4, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 698.38824, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 783.9143, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 1046.4, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 783.9143, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 622.1932, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 739.91656, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 587.27216, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 698.38824, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 493.83505, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 622.1932, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 415.26413, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 349.19412, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 391.95715, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 349.19412, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 587.27216, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 415.26413, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 622.1932, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 349.19412, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 587.27216, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 783.9143, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 622.1932, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 739.91656, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 587.27216, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 698.38824, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 493.83505, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 622.1932, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 415.26413, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 349.19412, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 391.95715, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 349.19412, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 587.27216, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 783.9143, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 622.1932, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 739.91656, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 587.27216, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 698.38824, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 493.83505, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 622.1932, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 698.38824, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 783.9143, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 1046.4, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 698.38824, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 783.9143, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 1046.4, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 698.38824, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 783.9143, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 1046.4, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 783.9143, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 622.1932, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 739.91656, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 587.27216, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 698.38824, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 493.83505, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 622.1932, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 415.26413, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 349.19412, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 391.95715, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 349.19412, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 587.27216, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 415.26413, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 622.1932, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 349.19412, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 587.27216, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 415.26413, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 415.26413, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 415.26413, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 415.26413, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 466.11823, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 587.27216, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 391.95715, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 391.95715, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 415.26413, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 415.26413, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 415.26413, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 415.26413, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 466.11823, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 587.27216, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 391.95715, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 415.26413, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 415.26413, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 415.26413, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 415.26413, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 466.11823, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 587.27216, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 391.95715, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 391.95715, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 369.95828, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 369.95828, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 369.95828, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 369.95828, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 369.95828, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 391.95715, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 493.83505, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 783.9143, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 391.95715, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 391.95715, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 293.63608, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 493.83505, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 277.15555, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 466.11823, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 391.95715, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.19800568, 391.95715, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.19800568, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 493.83505, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 783.9143, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 879.914, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 698.38824, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 493.83505, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 783.9143, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 349.19412, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 587.27216, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 293.63608, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 493.83505, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 391.95715, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 293.63608, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 493.83505, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 277.15555, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 466.11823, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 391.95715, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.19800568, 391.95715, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.19800568, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 493.83505, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 783.9143, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 879.914, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 698.38824, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 493.83505, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 783.9143, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 349.19412, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 587.27216, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 293.63608, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 493.83505, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 391.95715, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 415.26413, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 349.19412, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 698.38824, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 698.38824, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 349.19412, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 391.95715, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 493.83505, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.19800186, 698.38824, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.19800186, 879.914, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 698.38824, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 879.914, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 698.38824, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 879.914, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.19800568, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.19800568, 783.9143, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 587.27216, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 698.38824, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 349.19412, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 391.95715, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 391.95715, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 415.26413, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 349.19412, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 698.38824, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 698.38824, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 349.19412, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 391.95715, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 493.83505, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 587.27216, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 698.38824, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 587.27216, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 698.38824, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 587.27216, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 698.38824, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.19800568, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.19800568, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 493.83505, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 587.27216, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 391.95715, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 391.95715, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 415.26413, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 349.19412, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 698.38824, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 698.38824, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 349.19412, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 391.95715, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 493.83505, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.19800568, 698.38824, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.19800568, 879.914, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 698.38824, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 879.914, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.19829178, 698.38824, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.19829178, 879.914, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.19800568, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.19800568, 783.9143, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 587.27216, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 698.38824, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 349.19412, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 391.95715, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 391.95715, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 415.26413, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 349.19412, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 698.38824, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 698.38824, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 349.19412, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 391.95715, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 493.83505, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 587.27216, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 698.38824, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 587.27216, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 698.38824, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 587.27216, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 698.38824, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.19800568, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.19800568, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 493.83505, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 587.27216, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 391.95715, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 415.26413, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 415.26413, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 415.26413, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 415.26413, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 466.11823, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 587.27216, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 391.95715, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 391.95715, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 415.26413, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 415.26413, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 415.26413, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 415.26413, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 466.11823, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 587.27216, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 391.95715, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 415.26413, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 415.26413, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 415.26413, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 415.26413, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 466.11823, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 587.27216, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 391.95715, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 391.95715, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 369.95828, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 369.95828, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 369.95828, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 369.95828, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 369.95828, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 391.95715, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 493.83505, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 783.9143, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 391.95715, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 391.95715, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 415.26413, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 349.19412, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 698.38824, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 698.38824, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 349.19412, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 391.95715, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 493.83505, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.19799805, 698.38824, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.19799805, 879.914, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 698.38824, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 879.914, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 698.38824, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 879.914, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.19800568, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.19800568, 783.9143, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 587.27216, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 698.38824, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 349.19412, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 391.95715, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 391.95715, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 415.26413, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 349.19412, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 698.38824, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 698.38824, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 349.19412, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 439.957, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 391.95715, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 493.83505, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 587.27216, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 698.38824, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 587.27216, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 698.38824, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 587.27216, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 698.38824, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.19800568, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.19800568, 659.19073, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 493.83505, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 587.27216, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 391.95715, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 523.2, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 261.6, 2.5700786);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864865, 146.81804, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864865, 146.81804, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864865, 146.81804, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864868, 146.81804, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864868, 146.81804, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864862, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864874, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486485, 164.79768, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486485, 130.8, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486485, 174.59706, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864874, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 184.97914, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864874, 174.59706, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.19829512, 164.79768, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.19800472, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.19829464, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864874, 349.19412, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864874, 293.63608, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864874, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864874, 219.9785, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864874, 246.91753, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864874, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864874, 164.79768, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 130.8, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 174.59706, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 184.97914, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 174.59706, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.19829464, 164.79768, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.19800472, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 349.19412, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 293.63608, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 219.9785, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 246.91753, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 130.8, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 174.59706, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 174.59706, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 130.8, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 164.79768, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864826, 261.6, 2.5700786);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 130.8, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 174.59706, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 174.59706, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 130.8, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 207.63206, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 233.05911, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 261.6, 2.5700786);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 130.8, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 130.8, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 174.59706, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 174.59706, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 130.8, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 164.79768, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 261.6, 2.5700786);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 130.8, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 174.59706, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 174.59706, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 130.8, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 207.63206, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 233.05911, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 261.6, 2.5700786);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 130.8, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 103.81603, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 155.5483, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864922, 207.63206, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 130.8, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 97.98929, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 103.81603, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 155.5483, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 207.63206, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 130.8, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 97.98929, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 103.81603, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 155.5483, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 207.63206, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 130.8, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 97.98929, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 146.81804, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 146.81804, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 146.81804, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 146.81804, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 146.81804, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 164.79768, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 130.8, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 174.59706, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 184.97914, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 174.59706, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 164.79768, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.19800568, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 349.19412, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 293.63608, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 219.9785, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 246.91753, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 164.79768, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 130.8, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 174.59706, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 184.97914, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 174.59706, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 164.79768, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.19800568, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 349.19412, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 293.63608, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 329.59537, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 219.9785, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 246.91753, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 130.8, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 184.97914, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 174.59706, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 174.59706, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 174.59706, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 146.81804, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 174.59706, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 246.91753, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 130.8, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 184.97914, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 174.59706, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 174.59706, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 174.59706, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.19800568, 219.9785, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 246.91753, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 130.8, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 130.8, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 184.97914, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 174.59706, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 174.59706, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 174.59706, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 146.81804, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 174.59706, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 246.91753, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14864731, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 130.8, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 184.97914, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 174.59706, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 174.59706, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 174.59706, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.19800568, 219.9785, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 246.91753, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 130.8, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 103.81603, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 155.5483, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 207.63206, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 130.8, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 97.98929, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 103.81603, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 155.5483, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 207.63206, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 130.8, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 97.98929, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 103.81603, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 155.5483, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 207.63206, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 130.8, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 97.98929, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 146.81804, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 146.81804, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 146.81804, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 146.81804, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 146.81804, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 130.8, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 184.97914, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 174.59706, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 174.59706, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 174.59706, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 146.81804, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 174.59706, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 246.91753, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 130.8, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 184.97914, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 174.59706, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 174.59706, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 261.6, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 174.59706, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.19800568, 219.9785, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1982956, 246.91753, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 261.6, 2.5700786);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.1486435, 195.97858, 3.2125983);
		melodiaPrincipal.addNota (nota);

		nota = new Nota (0.14865112, 130.8, 2.5700786);
		melodiaPrincipal.addNota (nota);


		return melodiaPrincipal;
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

	public static Melodia padrao (String nome){
		if (nome.equals("superMarioBros"))
			return superMarioBros();
		else if (nome.equals("mvioloncelo1"))
			return mvioloncelo1();
		else return null;
	}
}