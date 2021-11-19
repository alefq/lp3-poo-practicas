package py.edu.uc.lp3.interfaces;

import py.edu.uc.lp3.herencia.Persona;

public class MapaJuego {

	public static void refrescarMapa(VideoJuegoPosicionable posicionable) {

		Avatar avatar = posicionable.getAvatar();
		Posicion posicion = posicionable.getUbicacion();

		System.out.println("Pintando a: " + avatar.getNickname() );
		System.out.println("en posicion x: " + posicion.getX() );

	}
	
	public static void fijarDuenhoMapa(Persona posicionable) {

	}
}
