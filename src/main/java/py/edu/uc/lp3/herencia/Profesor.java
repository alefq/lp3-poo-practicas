package py.edu.uc.lp3.herencia;

import java.io.Serializable;

import py.edu.uc.lp3.interfaces.Notificable;

public class Profesor extends Persona implements Serializable, Notificable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1557616437829724017L;
	/*
	 * Especializamos la clase Persona, agregando un atributo exclusivo de esta
	 * clase por ser una clase hija de Persona, Profesor obtiene todas las
	 * propiedades y comportamientos de la clase Persona
	 */
	private int antiguedad;
	private int nroInscripcion;

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public int getNroInscripcion() {
		return nroInscripcion;
	}

	public void setNroInscripcion(int nroInscripcion) {
		this.nroInscripcion = nroInscripcion;
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return "profe@uc.edu.py";
	}

	@Override
	public String getAsunto() {
		// TODO Auto-generated method stub
		return "Ocurrió un problema con el cable del proyector";
	}

	@Override
	public long getCodigo() {
		// TODO Auto-generated method stub
		return 999;
	}
}
