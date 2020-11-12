package py.edu.uc.lp3.claseabstracta;

public class MusicaApp {

	public static void tune(Instrument instrumento) {
		/*
		 * El método tune recibe una clase que se comportará como un Instrument,
		 * es decir utilizo la Interface Instrument para definir el tipo de dato
		 * que recibiré
		 */
		instrumento.play(Note.MIDDLE_C);
	}

	public static void main(String[] args) {
		Wind flute = new Wind();
		tune(flute); /*
					 * Al llamar al método static "tune" estoy haciendo un
					 * Upcasting, "conviertiendo" la clase Wind a una de las
					 * interfaces que implemneta.
					 */
	}
}