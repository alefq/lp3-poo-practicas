package py.edu.uc.lp3.colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import py.edu.uc.lp3.herencia.Alumno;
import py.edu.uc.lp3.herencia.Persona;
import py.edu.uc.lp3.herencia.Vehiculo;

public class PersonaApp {
	public static void main(String[] args) {
		/* En esta línea hacemos un upcasting a Persona */
		Persona person1 = new Alumno();
		System.out.println("Nombre= " + person1.getNombre());
		Persona person2 = new Alumno("Ale", "FQ", 41);
		System.out.println("persona2 = " + person2.getNombre());

		/*
		 * Creamos un ArrayList que es una implementación de la interface java.util.List
		 */
		ArrayList<Vehiculo> autosArray = new ArrayList<Vehiculo>();
		for (int i = 0; i < 70; i++)
			autosArray.add(new Vehiculo(i));
		/* === Generics === */
		/* No hay ningun problema en añadir una persona o añadir vehículos autos */
		ArrayList bolsa = new ArrayList();
		bolsa.add(new Vehiculo(1));
		bolsa.add(person2);

		Iterator<Vehiculo> itAutos = autosArray.iterator();
		System.out.println("USando iterador");
		while (itAutos.hasNext()) {
			Vehiculo vehiculo = itAutos.next();
			System.out.println(vehiculo);
		}
		System.err.println("Usando for compacto");
		for (Vehiculo autoIteracion : autosArray) {
			System.out.println(autoIteracion);
		}
		System.out.println("USando for con el size");
		for (int i = 0; i < autosArray.size(); i++) {
			Vehiculo autoFor = autosArray.get(i);
			autoFor.imprimirInfo();
		}
		// El Auto solamente es detectado en tiempo de ejecucion

		pruebaActores();
	}

	private static void pruebaActores() {
		int nroActores;
		Scanner in = new Scanner(System.in);

		/* Leemos un entero de la consola */
		nroActores = in.nextInt();
		ArrayList actors = new ArrayList();
		for (int i = 0; i < nroActores; ++i) {
			/* Obtenemos un número aleatorio */
			Double random = Math.random();
			actors.add("Actor #" + random);
		}

		ArrayList<Persona> personas = new ArrayList<Persona>();
		for (int i = 0; i < nroActores; ++i) {
			/* Obtenemos un número aleatorio */
			Double random = Math.random();
			/*
			 * Como el Math.random() nos devuelve un tipo de dato Double, hacemos uso del
			 * método intValue para obtener su valor Integer
			 */
			personas.add(new Persona(random.intValue(), "Persona #" + random));
		}

		/*
		 * Hay dos formas de personalizar la forma en como se ordena una clase que
		 * nosotros definimos. Una es definiendo una implemnetación de Comparator y
		 * colocar dentro la lógica para las comparaciones
		 */
		Comparator<Persona> comparadorPorEdad = new Comparator<Persona>() {
			/*
			 * La interfaz java.util.Comparator define un único método que debe devolver un
			 * entero
			 */
			public int compare(Persona persona1, Persona persona2) {
				int retorno = 0;
				if (persona1.getEdad() > persona2.getEdad()) {
					/*
					 * Si el primer parámetro, persona1 tiene mayor edad que el segundo, retornamos
					 * un valor positivo.
					 */
					retorno = 1;
					/*
					 * Otra posible implementación es devolver la diferencia entre edades.
					 */
					// retorno = persona1.getEdad() - persona2.getEdad();
				} else if (persona1.getEdad() < persona2.getEdad()) {
					/*
					 * En caso de que la persona2 sea mayor, se debe retornar un valor negativo
					 */
					retorno = -1;
					/* Otra posible implementación es retornar la diferencia */
					// retorno = persona1.getEdad() - persona2.getEdad();
				}
				/*
				 * Para este caso en particular, podríamos haber retornado directamente la
				 * diferencia, ya que cumpliría con nuestro contrato, de retornar valores (+),
				 * (-), o 0 en caso d que sea la edad mayor, menor o igual
				 */
				return retorno;
			}
		};
		Collections.sort(personas, comparadorPorEdad);

		/* Otra implementación que ordenará personas por nro. de cédula */
		Comparator<Persona> comparadorPorNroCedula = new Comparator<Persona>() {
			public int compare(Persona persona1, Persona persona2) {
				int retorno = 0;
				if (persona1.getNumeroCedula() > persona2.getNumeroCedula()) {
					retorno = 1;
				} else if (persona1.getNumeroCedula() > persona2.getNumeroCedula()) {
					retorno = -1;
				} else {
					retorno = 0;
				}
				return retorno;
			}
		};
		Collections.sort(personas, comparadorPorNroCedula);

		Collections.sort(actors);
		System.out.println("\n\nA sorted list of actors");
		System.out.println(actors);

		Collections.reverse(actors);
		System.out.println("\n\nA Sorted list of actors in reverse order");
		System.out.println(actors);

		Collections.shuffle(actors);
		System.out.println("\n\nA shuffled list of actors");
		System.out.println(actors);

		Collections.sort(actors);
		System.out.println("\n\nAgain a sorted list of actors");
		System.out.println(actors);

		Collections.shuffle(actors);
		System.out.println("\n\nAgain another shuffling of the actors");
		System.out.println(actors);
	}

	private static void pruebaActores2() {
		int nroActores;
		Scanner in = new Scanner(System.in);
		System.out.print("Ingrese el numero de Actores: ");
		/* Leemos un entero de la consola */
		nroActores = in.nextInt();
		List<Alumno> actors = new ArrayList<Alumno>();
		List<ArrayList<Alumno>> matrizActors = new ArrayList<ArrayList<Alumno>>();

		for (int i = 0; i < nroActores; ++i) {
			Integer edad = new Integer(0);
			Double random = Math.random() * 100;
			edad = random.intValue();
			actors.add(new Alumno("Actor #" + i, "", edad, edad));
		}

		/*
		 * Este es el ejemplo para definir un Comparator y utilizarlo al momento de
		 * llamar al método Collections.sort
		 */
		// Comparator<Persona> comparador = new Comparator<Persona>() {
		// @Override
		// public int compare(Persona persona1, Persona persona2) {
		// int retorno = 0;
		// if (persona1.getEdad() > persona2.getEdad())
		// retorno = 1;
		// else if (persona1.getEdad() < persona2.getEdad())
		// retorno = -1;
		//
		// return retorno;
		// }
		// };
		// Collections.sort(actors, comparador);
		/*
		 * Si no utilizamos un Comparator, entonces el ordenamiento se realiza en primer
		 * lugar, según el criterio de la Clase, si esta implementa Comparable, y sino,
		 * se utiliza el "orden natural" que sería el orden alfanumérico
		 */
//		Collections.sort(actors);

		System.out.println("\n\nA sorted list of actors");
		System.out.println(actors);

		Collections.reverse(actors);
		System.out.println("\n\nA Sorted list of actors in reverse order");
		System.out.println(actors);

		Collections.shuffle(actors);
		System.out.println("\n\nA shuffled list of actors");
		System.out.println(actors);

		// Collections.sort(actors, comparador);
//		Collections.sort(actors);
		System.out.println("\n\nAgain a sorted list of actors");
		System.out.println(actors);

		Collections.shuffle(actors);
		System.out.println("\n\nAgain another shuffling of the actors");
		System.out.println(actors);
	}

}
