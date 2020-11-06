package com.example.restservice;

public class Greeting {

	private long id;
	private String content;
	private String name;
	private String lastName;
	private int age;
	private String mensaje;
	private int codigoHttp;

	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public Greeting(String name, String lastName, int age, long id) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.age = age;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setContent(String content) {
		this.content = content;
	}

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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getName()+ " " + getLastName() + " " + getAge();
	}	
	
}
