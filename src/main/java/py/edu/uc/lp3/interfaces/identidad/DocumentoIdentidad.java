package py.edu.uc.lp3.interfaces.identidad;

/**
 * Definimos una clase base, para cualquier tipo de documento de identidad.
 * 
 * @author juca
 * 
 */
public abstract class DocumentoIdentidad {

	private Long identidad;

	public DocumentoIdentidad() {
		// TODO Auto-generated constructor stub
	}

	public DocumentoIdentidad(Long l) {
		setIdentidad(l);
	}

	public void setIdentidad(Long identidad) {
		this.identidad = identidad;
	}

	public Long getIdentidad() {
		return identidad;
	}

	/*
	 * Definimos un método abstracto que las subclases están obligados a
	 * implementar
	 */
	public abstract String getTipo();
}
