package py.edu.uc.lp3.inicializacion;

import py.edu.uc.lp3.herencia.Alumno;
import py.edu.uc.lp3.herencia.Auto;
import py.edu.uc.lp3.herencia.Profesor;

public class Materia {
	/*
	 * Definimos una clase nueva, la convención determina que la primera letra debe
	 * ser mayúscula y el resto ya es a elección, mezcla de letras y números. Debe
	 * definirse dentro del archivo, por lo menos la clase con el mismo nombre del
	 * archivo que la contiene.
	 */

	private Auto transporte;

	private Alumno alumno;
	private Profesor profesor;
	private String codigo;

	public Materia() {
		// TODO Auto-generated constructor stub
	}

	public Materia(String codigo) {
		setCodigo(codigo);
		inicializarMateria();
	}

	/*
	 * El método main con esta firma convierte a esta clase Java en una aplicación
	 * Java, es decir puede ejecutarse directamente
	 */
	public static void main(String[] args) {
		/*
		 * La clase System es parte del JRE y contiene un campo de tipo PrintStream para
		 * imprimir en la consola. Al utilizar directamente un string entre comillas,
		 * por detrás se instancia un objeto de tipo String
		 */
		System.out.println(new String("Hello World!"));
		Materia lp3 = new Materia();
		lp3.inicializarMateria();

		System.out.println("Alumno: " + lp3.getAlumno().getNombre());
		System.out.println("Profesor: " + lp3.getProfesor().getNombre());
	}

	public void inicializarMateria() {
		Auto auxilio = new Auto();
		/* Creamos una nueva instancia de la clase Auto */
		setTransporte(new Auto());
		/* Enviamos el mensaje de arrancar a la clase recientemente creada */
		getTransporte().arrancar();

		setAlumno(new Alumno());
		setProfesor(new Profesor());

		getAlumno().setNombre("Bart");
		getProfesor().setNombre("Xavier");
		getAlumno().setNumeroMatricula(1);
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public static void describirMateria() {

	}

	/**
	 * @param args
	 */
	public Auto getTransporte() {
		return transporte;
	}

	public void setTransporte(Auto pTransporte) {
		transporte = pTransporte;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno pAlumno) {
		alumno = pAlumno;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor pProfesor) {
		profesor = pProfesor;
	}

	public static void inicializarDefaults() {
		//Aquí inicializaríamos los valores default para poder cargar información
		//por ejemplo en ciertas constantes
	}

}
