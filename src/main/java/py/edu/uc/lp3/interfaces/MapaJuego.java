package py.edu.uc.lp3.interfaces;

import org.apache.commons.lang3.StringUtils;

import py.edu.uc.lp3.exceptions.MapaException;
import py.edu.uc.lp3.herencia.Persona;

public class MapaJuego {

	public static void refrescarMapa(VideoJuegoPosicionable posicionable) throws MapaException {

		Avatar avatar = posicionable.getAvatar();
		Posicion posicion = posicionable.getUbicacion();

		if(StringUtils.isBlank(avatar.getNickname())) {
			throw new MapaException("Se requiere un nickaname para poder pintar el avatar");
		}
		System.out.println("Pintando a: " + avatar.getNickname() );
		System.out.println("en posicion x: " + posicion.getX() );

	}
	
	public static void fijarDuenhoMapa(Persona posicionable) {

	}
}
