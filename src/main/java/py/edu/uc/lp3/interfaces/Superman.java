package py.edu.uc.lp3.interfaces;

import javax.swing.ImageIcon;

import py.edu.uc.lp3.herencia.GpsPosition;
import py.edu.uc.lp3.herencia.Persona;

public class Superman extends Persona implements Volador, Peleador, Cotizable, VideoJuegoPosicionable {
	/*
	 * Hacemos que la calse Superman herede de Persona, y además que implemente
	 * las capacidades/protocolos/comportamientos de Volador y Peleador
	 */
	/**
	 * 
	 */
	private static final long serialVersionUID = -1702204164231353048L;	

	public static void main(String[] args) {
		Superman clark = new Superman();
		Volador volador = clark;
		
		Peleador peleador =  clark; //Upcasting
		peleador.pelear();
		//
	   //Mentiroso mentiroso =new Superman();
		
		
		// peleador.pelear();
		// Peleador peleador=new Superman();
		// peleador.pelear();
	}

	public Superman() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Superman(String nombre, String apellido, int edad) {
		super(nombre, apellido, edad);
		// TODO Auto-generated constructor stub
	}

	public void volar() {
		System.out.println("Volando Superman");

	}

	public void pelear() {
		System.out.println("Peleando Superman");

	}

	public Long getPrecio(String identificador) {
		return 1000l;
	}

	public String getColorCapa() {
		return "roja";
	}

	@Override
	public Double getPrecioUSD(String identificador) {
		// TODO Auto-generated method stub
		return getPrecio(identificador)*Moneda.COTIZACION_DEFAULT_DOLAR;
	}


	@Override
	public GpsPosition getPosicion() {	 
		GpsPosition posicion = new GpsPosition();
		posicion.setLatitud(33d);
		posicion.setLatitud(55d);
		return posicion ;
	}
	
	
	@Override
	public ImageIcon getIcon() {
		return new ImageIcon("");
	}
	
	
	@Override
	public Avatar getAvatar() {
		Avatar avatar = new Avatar();
		avatar.setNickname("Clark");
		return avatar ;
	}

	@Override
	public Posicion getUbicacion() {
		Posicion ubicacion = new Posicion();
		ubicacion.setX(0.3);
		ubicacion.setY(1.0);
		ubicacion.setZ(3.3);
		return ubicacion ;
	}


}
