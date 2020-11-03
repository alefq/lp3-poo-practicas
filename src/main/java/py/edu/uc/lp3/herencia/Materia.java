package py.edu.uc.lp3.herencia;

public class Materia {
    /*
     * Definimos una clase nueva, la convención determina que la primera letra
	 * debe ser mayúscula y el resto ya es a elección, mezcla de letras y
	 * números. Debe definirse dentro del archivo, por lo menos la clase con el
	 * mismo nombre del archivo que la contiene.
	 */

    /**
     * @param args
     */
	/*
	 * Para la clase01 declaramos con el modificador static para poder
	 * utilizarlo dentro del método main
	 */
    static Auto transporte;

    /*
     * El método main con esta firma convierte a esta clase Java en una
     * aplicación Java, es decir puede ejecutarse directamente
     */
    public static void main(String[] args) {
		/*
		 * La clase System es parte del JRE y contiene un campo de tipo
		 * PrintStream para imprimir en la consola. Al utilizar directamente un
		 * string entre comillas, por detrás se instancia un objeto de tipo
		 * String
		 */
        System.out.println(new String("Hello World!"));
		/* Creamos una nueva instancia de la clase Auto */
        transporte = new Auto();
		/* Enviamos el mensaje de arrancar a la clase recientemente creada */
        transporte.arrancar();
    }

}
