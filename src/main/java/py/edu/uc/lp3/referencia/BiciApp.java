package py.edu.uc.lp3.referencia;

public class BiciApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Bicicleta bici = new Bicicleta();
		bici.setVelocidad(2);
//		bici.velocidad = 0;
		bici.cambiarVelocidad(2);
//		bici.cambios
		String marcaGrip = bici.getMarcaGrip();

		for (int i = 0; i < 10; i++) {
			bici.acelerar();
			// bici.frenarGolpe();
		}
		bici.frenarGolpe();
		System.out.println("Velocidad final: " + bici.getVelocidad());

	}

}
