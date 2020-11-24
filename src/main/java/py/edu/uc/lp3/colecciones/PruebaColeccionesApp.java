package py.edu.uc.lp3.colecciones;

import java.util.ArrayList;
import java.util.HashMap;

import py.edu.uc.lp3.herencia.Alumno;
import py.edu.uc.lp3.inicializacion.Materia;
import py.edu.uc.lp3.utilidades.ColeccionesUtil;

public class PruebaColeccionesApp {
	/*
	 * Definimos un HashMap con clave de tipo Alumno y valores de tipo ArrayList
	 * de Materias. HashMap es una clase que implementa la interfaz
	 * java.util.Map
	 */
	private HashMap<Alumno, ArrayList<Materia>> alumnosMaterias;

	/*
	 * Este es un mapa "simple" que guarda un String y utiliza el tipo de dato
	 * Long para la clave. En General, se puede usar cualquier tipo de dato para
	 * la clave y cualquier tipo de dato para los valores a almacenar
	 */
	private HashMap<Long, String> codigoNombre;

	public static void main(String[] args) {
		PruebaColeccionesApp app = new PruebaColeccionesApp();
		/* Creamos dos Alumnos que seran las Claves para el mapa */
		Alumno alumno1 = new Alumno("Ale", "F", 1);
		Alumno alumno2 = new Alumno("Awi", "F", 1);
		/* Creamos una lista de materias */
		ArrayList<Materia> listaMaterias1 = new ArrayList<Materia>();
		listaMaterias1.add(new Materia("POO"));
		listaMaterias1.add(new Materia("LP1"));
		
		ArrayList<Materia> listaMaterias2 = new ArrayList<Materia>();
		listaMaterias2.add(new Materia("POO"));
		listaMaterias2.add(new Materia("LP1"));
		listaMaterias2.add(new Materia("JAVA1"));
		/*
		 * Guardamos en el mapa de nuestra aplicación de pruebas, para ambas
		 * Alumnos, la misma lista de materias
		 */
		app.getAlumnosMaterias().put(alumno1, listaMaterias1);
		app.getAlumnosMaterias().put(alumno2, listaMaterias2);
		/* Aquí guardamos un valor en el mapa "simple" */
		app.getCodigoNombre().put(10l, "Curso POO y Java");
		/* Imprimimos la lista de materias por alumno */
		ColeccionesUtil.imprimirMapa(app.getAlumnosMaterias());
		/* Utilizamos la impresión genérica de cualquier tipo de Mapa */
		ColeccionesUtil.imprimirMapaToString(app.getAlumnosMaterias());
	}

	public PruebaColeccionesApp() {
		alumnosMaterias = new HashMap<Alumno, ArrayList<Materia>>();
		codigoNombre = new HashMap<Long, String>();
	}

	public void setCodigoNombre(HashMap<Long, String> codigoNombre) {
		this.codigoNombre = codigoNombre;
	}

	public HashMap<Long, String> getCodigoNombre() {
		return codigoNombre;
	}

	public void setAlumnosMaterias(
			HashMap<Alumno, ArrayList<Materia>> alumnosMaterias) {
		this.alumnosMaterias = alumnosMaterias;
	}

	public HashMap<Alumno, ArrayList<Materia>> getAlumnosMaterias() {
		return alumnosMaterias;
	}
}
