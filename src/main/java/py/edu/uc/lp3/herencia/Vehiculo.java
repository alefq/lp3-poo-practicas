package py.edu.uc.lp3.herencia;

import java.io.Serializable;

public class Vehiculo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 654138957788255568L;
	/* Definimos las propiedades para nuestra clase */
	private int anho;
	private String marca;
	private String modelo;
	private int velocidad;
	private int chapa;

	public Vehiculo() {
		/*
		 * Los constructores se utilizan para brindar distintas formas de crear
		 * instancias de una clase e inicializar sus valores
		 */
		setMarca("Sin marca");
		setVelocidad(0);
		setModelo("Sin modelo");
	}

	public Vehiculo(int i) {
		setChapa(i);
	}

	/*
	 * Definimos un método. Los métodos se recomienda que expresen una acción,
	 * con el infinitivo o por ejemplo getAlgo setAlgo
	 */
	/**
	 * Se arranca el motor del auto y se coloca la velocidad a 0
	 * */
	public void arrancar() {
		System.out.println("Arrancando");
	}

	void acelerar() {
		velocidad++;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getAnho() {
		return anho;
	}

	public void setAnho(int anho) {
		this.anho = anho;
	}

	public int getChapa() {
		return chapa;
	}

	public void setChapa(int chapa) {
		this.chapa = chapa;
	}

	public void imprimirInfo() {
		System.out.println("Auto con chapa nro: " + getChapa());
	}
	
	@Override
	public String toString() {
		return "Auto con chapa nro: " + getChapa();
	}
}
