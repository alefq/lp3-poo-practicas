package py.edu.uc.lp3.interfaces;


public class BatallaApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BatallaApp batalla = new BatallaApp();
		Superman superman = new Superman();
		AntiHeroe antiHeroe = new AntiHeroe();
		Ropa ropa = new Ropa();

		/*
		 * Como la biciVoladora, sabe como volar (implementa la interface
		 * Volador), podemos utilizarla en cualquier metodo que haga volar
		 */
		BiciVoladora biciVoladora = new BiciVoladora();

		batalla.hacerVolar(superman, biciVoladora);
		
		
		
		batalla.hacerVolar(superman, antiHeroe);
		batalla.hacerVolar(ropa, biciVoladora);
		
		
		batalla.hacerPelear(superman, antiHeroe);
		
		/*
		 * Esta llamada no es válida porque superman, no sabe mentir (no tiene
		 * el comportamiento de la interface Mentiroso)
		 */
		// batalla.hacerMentir(superman, antiHeroe);
	}

	public void hacerVolar(Volador v1, Volador v2) {
		/*
		 * El operador instanceof me retorna un boolean que indica si es o no
		 * una instancia de un tipo de Clase
		 */
		if (v1 instanceof Superman) {
			/* Hacemos un downcasting de v1 */
			Superman superM = (Superman) v1;
			String color = superM.getColorCapa();
			System.out.println(color);
		}
		if (v2 instanceof Superman) {
			Superman superM = (Superman) v1;
			String color = superM.getColorCapa();
			System.out.println(color);
		} else {
			System.out.println("No es de tipo Superman");
		}
		v1.volar();
		v2.volar();
	}

	public void hacerPelear(Peleador p1, Peleador p2) {
		p1.pelear();
		p2.pelear();
	}

	public void hacerMentir(Mentiroso m1, Mentiroso m2) {
		m1.mentir();
		m2.mentir();

	}

	public void mostrarCotizacion(Cotizable cotizable) {
		System.out.println(cotizable.getPrecio("SUPR"));
	}
}
