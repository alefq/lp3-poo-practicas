package py.edu.uc.lp3.exceptions;

public class EdadInsuficienteException extends Exception {
	/*
	 * Creamos nuestra propia excepcion para indicar que hubo algún problema con
	 * la inscripción de un alumno
	 */

	/**
	 * 
	 */
	private static final long serialVersionUID = -8928788050548174403L;

	public EdadInsuficienteException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EdadInsuficienteException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public EdadInsuficienteException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public EdadInsuficienteException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
