package com.example.restservice;

public class BaseResponse {
	protected String mensaje;
	protected  int codigoHttp;
	protected  boolean exito;
	
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public int getCodigoHttp() {
		return codigoHttp;
	}
	public void setCodigoHttp(int codigoHttp) {
		this.codigoHttp = codigoHttp;
	}
	public boolean isExito() {
		return exito;
	}
	public void setExito(boolean exito) {
		this.exito = exito;
	} 
	
	

}
