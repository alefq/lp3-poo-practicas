package py.edu.uc.lp3.exceptions;

public class NacionalidadException extends Exception {
	/*
	 * Creamos una excepción, con la que vamos identificar los problemas de
	 * inscripción que tengan que ver con la nacionalidad
	 */

	/**
	 * 
	 */
	private static final long serialVersionUID = 6131587669944460543L;

	public NacionalidadException() {
		// TODO Auto-generated constructor stub
	}

	public NacionalidadException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public NacionalidadException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public NacionalidadException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

}
