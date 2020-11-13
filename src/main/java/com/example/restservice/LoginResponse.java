package com.example.restservice;

import py.edu.uc.lp3.herencia.Persona;

public class LoginResponse extends BaseResponse {
	private Persona persona;

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	

}
