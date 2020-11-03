package py.edu.uc.lp3.herencia;

public class Arbol {
	/*
	 * La clase Arbol tiene varios constructores, se invocan según el número
	 * de parámetros que tenga la invocación, son distintas formas de
	 * construir/instanciar esta clase
	 */
	public Arbol() {
		System.out.println("Un árbol genérico");
	}

	public Arbol(String tipo) {
		System.out.println("Un árbol tipo " + tipo);
	}

	public Arbol(int altura) {
		System.out.println("Un árbol de " + altura + " metros");
	}

	public Arbol(int altura, String tipo) {
		/*
		 * "CTRL-/" ó "CTRL-7" (en teclados Latinoamericanos o Españoles) sirve para
		 * comentar o descomentar un bloque seleccionado o la línea en que se encuentra
		 * el cursor
		 */
		System.out.println("Un " + tipo + " de " + altura + " metros");
	}

	public static void main(String args[]) {
		/*
		 * Según los parámetros que utilizemos se construirán Arbol de
		 * distintas maneras, acorde al constructor que coincida con los tipos y
		 * nros. de parámetros
		 */
		Arbol arbol1 = new Arbol(4);
		Arbol arbol2 = new Arbol("Roble");
		Arbol arbol3 = new Arbol();
		Arbol arbol4 = new Arbol(5, "Pino");
	}
}
