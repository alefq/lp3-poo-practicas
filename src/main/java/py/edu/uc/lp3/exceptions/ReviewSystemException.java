package py.edu.uc.lp3.exceptions;

import py.edu.uc.lp3.interfaces.Notificable;

public class ReviewSystemException extends Exception implements Notificable {

	private long code;
	
	public ReviewSystemException() {
		// TODO Auto-generated constructor stub
	}

	public ReviewSystemException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ReviewSystemException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public ReviewSystemException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ReviewSystemException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public long getCode() {
		return code;
	}

	public void setCode(long code) {
		this.code = code;
	}

	@Override
	public String getEmail() {	
		return "soporte@reviewsystem.com";
	}

	@Override
	public String getAsunto() {		
		return "Ocurrió un problema del tipo: " + getCode();
	}

	@Override
	public long getCodigo() {	
		return getCode();
	}
	
	

}
