package py.edu.uc.lp3.inicializacion;

import javax.swing.JWindow;

import py.edu.uc.lp3.utilidades.Vigilante;

public class MateriaApp {

	private Materia algoritmia;
	private Materia java1;

	public MateriaApp() {
		algoritmia = new Materia("DW00");
		java1 = new Materia("DW06");
//		this.algoritmia = null;
//    	Vigilante.notificarExcepcion(java1.getProfesor());
		/*
		 * El IDE Eclipse nos muestra esta línea como un warning ya que no se
		 * recomienda acceder a una variable estática de forma no estática, es
		 * decir no es recomendable hacerlo mediante al referencia a un objeto
		 */
		java1.getTransporte().setMarca("Hyundai");
		algoritmia.getTransporte().setMarca("Toyota");
		/*
		 * La forma recomendada de acceder a métodos y propiedades estáticas de una
		 * clase, es hacerlo con el nombre de la clase, como se muestra a
		 * continuación. Este valor es compartido por todas las instancias de la
		 * clase Materia
		 */
		Materia.inicializarDefaults();

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MateriaApp aplicacion = new MateriaApp();
		/*
		 * Esta forma de acceder a un campo estático no es la recomendada, se
		 * coloca como ejemplo para que el Eclipse muestre el warning
		 */
		System.out.println("Transporte Algoritmia: "
				+ aplicacion.getAlgoritmia().getTransporte().getMarca());
		System.out.println("Codigo: " + aplicacion.getAlgoritmia().getCodigo());
		/*
		 * Al ser una variable o método estático, pertenece a la Clase, es decir
		 * a todas sus instancias. Esta es la forma recomendada para acceder.
		 */
		System.out.println("Transporte Java1: "
				+ aplicacion.getJava1().getTransporte().getMarca());
		System.out.println("Codigo: " + aplicacion.getJava1().getCodigo());

	}

	public Materia getAlgoritmia() {
		return algoritmia;
	}

	public void setAlgoritmia(Materia algoritmia) {
		this.algoritmia = algoritmia;
	}

	public Materia getJava1() {
		return java1;
	}

	public void setJava1(Materia java1) {
		this.java1 = java1;
	}

}
