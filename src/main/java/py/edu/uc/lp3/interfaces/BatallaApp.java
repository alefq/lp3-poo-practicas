package py.edu.uc.lp3.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

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
		 * Como la biciVoladora, sabe como volar (implementa la interface Volador),
		 * podemos utilizarla en cualquier metodo que haga volar
		 */
		BiciVoladora biciVoladora = new BiciVoladora();

//		batalla.hacerVolar(superman, );

		ArrayList<String> lista = new ArrayList<>();
		Vector<Integer> lista2 = new Vector<>();
		Collections.sort(lista);
		Collections.sort(lista2);

		batalla.hacerVolar(superman, antiHeroe);
		batalla.hacerVolar(ropa, biciVoladora);

		batalla.hacerPelear(superman, antiHeroe);

		/*
		 * Esta llamada no es válida porque superman, no sabe mentir (no tiene el
		 * comportamiento de la interface Mentiroso)
		 */
		// batalla.hacerMentir(superman, antiHeroe);
	}

	public void hacerVolar(Volador v1, Volador v2) {

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
