package py.edu.uc.lp3.referencia;

public class PerroApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Perro pastor = new Perro();
		Yorkshire york = new Yorkshire();
		pastor.ladrar();
		york.ladrar();
		Perro.rodar();
	}

}
