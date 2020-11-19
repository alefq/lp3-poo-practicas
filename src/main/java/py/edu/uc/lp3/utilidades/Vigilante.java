package py.edu.uc.lp3.utilidades;

import py.edu.uc.lp3.interfaces.Notificable;

public class Vigilante {
	
	public static void notificarExcepcion(Notificable noti ) {
		System.out.println("Notificando excepcion código: " + noti.getCodigo());
		System.out.println("Notificando excepcion: " + noti.getAsunto());
		System.out.println("al correo: " + noti.getEmail());
	}

}
