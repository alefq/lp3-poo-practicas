package py.edu.uc.lp3.interfaces;

import py.edu.uc.lp3.herencia.Persona;

public class Superman extends Persona implements Volador, Peleador, Cotizable {
	/*
	 * Hacemos que la calse Superman herede de Persona, y además que implemente
	 * las capacidades/protocolos/comportamientos de Volador y Peleador
	 */
	/**
	 * 
	 */
	private static final long serialVersionUID = -1702204164231353048L;	

	public static void main(String[] args) {
		Superman chila = new Superman();
		Volador volador = chila;
		
		Peleador peleador =  chila; //Upcasting
		peleador.pelear();
		//
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


}
