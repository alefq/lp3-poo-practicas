package py.edu.uc.lp3.interfaces.instrumento;

public class Note {

	private Double frecuencia;
	/**
	 * Definimos un tipo de Nota musical como una constante
	 */
	public static final Note MIDDLE_C = new Note();

	public void setFrecuencia(Double frecuencia) {
		this.frecuencia = frecuencia;
	}

	public Double getFrecuencia() {
		if (frecuencia == null)
			frecuencia = 0d;
		
		return frecuencia;
	}

	@Override
	public String toString() {
		return "Note con frecuencia: " + getFrecuencia();
	}
}
