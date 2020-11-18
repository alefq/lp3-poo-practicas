package py.edu.uc.lp3.exceptions;

import java.io.IOException;

import py.edu.uc.lp3.herencia.Alumno;
import py.edu.uc.lp3.herencia.Persona;
import py.edu.uc.lp3.herencia.Profesor;
import py.edu.uc.lp3.inicializacion.Materia;
import py.edu.uc.lp3.interfaces.identidad.Identificable;

public class InscripcionApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/* Instanciamos una Materia */
		Materia poojava = new Materia();

		/* Instanciamos el profesor que dictará la materia */
		Profesor profesor = new Profesor();
		profesor.setNombre("Ale");
		profesor.setApellido("Feltes");

		/*
		 * Creamos dos alumnas que vamos a agregar a la lista de alumnos de la
		 * materia. Aquí hacemos uso de los constructores que ya reciben los
		 * datos principales de Alumno
		 */
		Alumno alumno = new Alumno("Rachel", "Green", 42);
		Alumno alumno2 = new Alumno("Monica", "Geller", 17);

		alumno2.setNumeroMatricula(1235);
		alumno2.setCodigoPais(Identificable.CODIGO_ISO_PARAGUAY);
		
		alumno.setCodigoPais(Identificable.CODIGO_ISO_BRASIL);

		/* Asignamos el profesor */
		poojava.setProfesor(profesor);
		/* Asignamos el nombre de la materia */
		poojava.setDescripcion("Java1");

		/*
		 * Agregamos los alumnos a la lista por medio del metodo "add" de la
		 * clase ArrayList
		 */
		poojava.getAlumnos().add(alumno);
		poojava.getAlumnos().add(alumno2);

		/* Encapsulamos la forma de inscribir alumnos */

		InscripcionApp.inscribirAlumnos(poojava, alumno, alumno2);

		/*
		 * Invocamos el método toString de la materia, para imprimir en consola
		 * la representación en forma de una cadena de caracteres de la Materia
		 */
		System.out.println(poojava.toString());

	}

	public static void inscribirAlumnos(Materia poojava, Alumno alumno,
			Alumno alumno2) {
		try {
			/* Esta línea inscribirá normalmente un alumno */
			poojava.inscribirPersona(alumno);
			/*
			 * Esta línea arrojará una excepción porque el alumno2 no tiene la
			 * nacionalidad permitida
			 */
			poojava.inscribirPersona(alumno2);
		} catch (NacionalidadException e) {
			/*
			 * Se puede tratar la excepción en un handler dentro del bloque
			 * catch
			 */
			System.out
					.println("Al inscribir un alumno ocurrio el siguiente problema:"
							+ e.getMessage());
			e.printStackTrace();
			/*
			 * Para casos generalizables se puede crear una utilidad para tratar
			 * las excepciones
			 */
			Persona.tratarNacionalidadException(e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EdadInsuficienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
