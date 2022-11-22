package py.edu.uc.lp3.utilidades;

import py.edu.uc.lp3.herencia.Profesor;
import py.edu.uc.lp3.interfaces.Avatar;
import py.edu.uc.lp3.interfaces.Superman;

public class RastreoApp {

	public static void main(String[] args) {
		Profesor luca = new Profesor();
		Avatar ale = new Avatar();
		Superman clark = new Superman();
		clark.setNombre("Clark");
		clark.setApellido("Kent");
		// TODO Auto-generated method stub
		Tracker.rastrear(clark);
//		Tracker.rastrear(ale);
		Vigilante.notificarExcepcion(luca);

	}

}
