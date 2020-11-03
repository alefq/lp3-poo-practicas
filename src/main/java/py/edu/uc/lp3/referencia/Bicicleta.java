package py.edu.uc.lp3.referencia;

public class Bicicleta {

	/*
	 * Los campos y métodos con "private" sólo pueden ser accedidos en el scope de
	 * definición de la clase
	 */
	private String marca;
	private int velocidad;
	/*
	 * Los campos protected pueden aser accedidos o modificados desde el mismo
	 * paquete, la misma clase o las clases hijas
	 */
	protected Double radioRueda;
	/*
	 * El modificador "friendly" significa que no se colocó ningún modificador de
	 * acceso. Tiene los mismos niveles que "protected"
	 */
	Integer cambios;

	public static void main(String[] args) {
		Bicicleta bici = new Bicicleta();
		// Envío del mensaje de que cambie su velocidad a 10
		bici.setVelocidad(10);
		bici.velocidad = 0;
	}

	protected void acelerar() {
		setVelocidad(getVelocidad() + 1);
		System.out.println("Velocidad aumentada a: " + getVelocidad());
	}

	public void frenarGolpe() {
		setVelocidad(0);
	}

	public void frenar() {
		frenar(0);
	}

	// public int frenar()
	// {
	//
	// }

	public void frenar(int velocidadFinal) {
		frenar(0, null, null);
	}

	public void frenar(int velocidadFinal, Integer x, Integer y) {
		if (x != null && y != null) {
			/* si estoy en terreno resbaladizo */
		} else {

			while (velocidad > velocidadFinal)
				velocidad--;
		}
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMarca() {
		if (marca == null)
			inicializarMarca();
		return marca;
	}

	private void inicializarMarca() {
		setMarca("SIN MARCA");
	}

	public void cambiarVelocidad(int i) {
		// TODO Auto-generated method stub

	}

	public String getMarcaGrip() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setRadioRueda(Double radioRueda) {
		this.radioRueda = radioRueda;
	}

	public Double getRadioRueda() {
		return radioRueda;
	}

}