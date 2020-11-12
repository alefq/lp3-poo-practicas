package py.edu.uc.lp3.interfaces;



/*BiciVoladora puede implementar también el método volar*/
public class BiciVoladora extends Bicicleta implements Volador {

	public void volar() {
		System.out.println("Bici volando");
	}

}
