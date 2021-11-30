package py.edu.uc.lp3.utilidades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import py.edu.uc.lp3.herencia.Alumno;
import py.edu.uc.lp3.herencia.Persona;
import py.edu.uc.lp3.inicializacion.Materia;

public class ColeccionesUtil {

	/*
	 * Imprimimos específicamente un mapa de Materias, que usa la Alumno como clave
	 */
	public static void imprimirMapa(HashMap<Alumno, ArrayList<Materia>> alumnosMaterias) {
		/*
		 * Como las claves del mapa sabemos contiene Alumnos, y el keySet devuelve un
		 * tipo de dato List, sabemos que podemos pedirle su iterador, para recorrer la
		 * lista
		 */
		Iterator<Alumno> alumnos = alumnosMaterias.keySet().iterator();
		while (alumnos.hasNext()) {
			/* Iteramos sobre las Alumnos */
			Alumno alumno = alumnos.next();
			/*
			 * Por medio de los Generics podemos saber que los valores almacenados serán de
			 * tipo ArrayList de Alumnos
			 */
			ArrayList<Materia> materias = alumnosMaterias.get(alumno);
			for (Materia mat : materias) {

			}
			System.out.println("Alumno: " + alumno.getNombre());
			System.out.println("Materias :" + materias);
			System.err.println("---");
		}
	}

	/*
	 * Imprimimos cualquier mapa. Utilizamos el caracter comodín "?" para indicar
	 * que aceptamos cualquier tipo de dato
	 */
	public static void imprimirMapaToString(Map<?, ?> mapa) {
		Iterator<?> claves = mapa.keySet().iterator();
		while (claves.hasNext()) {
			/*
			 * Sabemos que java.lang.Object es al clase ancestra de todos, entonces para
			 * utilizar sólo el ḿetodo toString de la clase, iteramos sobre sus claves, e
			 * imprimimos la representación de String de la clave y del valor
			 */
			Object clave = claves.next();
			Object valor = mapa.get(clave);
			System.out.println("clave    : " + clave.toString());
			System.out.println("   valor :" + valor.toString());
			System.err.println("---");
		}
	}

	public static void imprimirMapa(Map<Object, Iterable<Object>> mapa) {
		Iterator<?> claves = mapa.keySet().iterator();
		while (claves.hasNext()) {
			/*
			 * Sabemos que java.lang.Object es al clase ancestra de todos, entonces para
			 * utilizar sólo el ḿetodo toString de la clase, iteramos sobre sus claves, e
			 * imprimimos la representación de String de la clave y del valor
			 */
			Object clave = claves.next();

			// Otras formas de recorrer un Collection
			for (Object mat : mapa.keySet()) {
				// Recorre el conjunto de keys del Map
			}

			for (Object mat : mapa.entrySet()) {
				// Recorre los valores cargados en el Map
			}

			Iterable<Object> valor = mapa.get(clave);
			System.out.println("clave    : " + clave.toString());
			Iterator<Object> iterador = valor.iterator();
			while (iterador.hasNext()) {
				System.out.println("   valor :" + iterador.next());
			}

			System.err.println("---");
		}
	}

	public static void auditar(Persona persona) {
		// TODO Auto-generated method stub

	}

}
