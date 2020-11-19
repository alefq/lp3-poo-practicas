package py.edu.uc.lp3.utilidades;

import py.edu.uc.lp3.herencia.GPSTraceable;

public class Tracker {

	public static void rastrear(GPSTraceable rastreable) {
		//Acá informamos de la ubicación
		//Y se podría pintar en un mapa
		System.out.println("Ubicación: " + rastreable.getPosicion());		
		System.out.println("Mi ícono es: " + rastreable.getIcon());
		
	}

}
