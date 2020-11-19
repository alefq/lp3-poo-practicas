package py.edu.uc.lp3.herencia;

import javax.swing.ImageIcon;

public class Auto implements GPSTraceable {
	/* Definimos las propiedades para nuestra clase */
	int anyo;
	String marca;
	String modelo;
	int velocidad;
	long numeroChapa;

	public Auto() {
		setMarca("Sin marca");
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

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anho) {
		this.anyo = anho;
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

	public long getNumeroChapa() {
		return numeroChapa;
	}

	public void setNumeroChapa(long numeroChapa) {
		this.numeroChapa = numeroChapa;
	}

	@Override
	public GpsPosition getPosicion() {	 
		GpsPosition posicion = new GpsPosition();
		posicion.setLatitud(33d);
		posicion.setLatitud(55d);
		return posicion ;
	}
	
	
	@Override
	public ImageIcon getIcon() {
		return new ImageIcon("");
	}

}
