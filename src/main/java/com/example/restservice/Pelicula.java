package com.example.restservice;

public class Pelicula extends Video {
	String age_rating;

	public String getAge_rating() {
		return age_rating;
	}

	public void setAge_rating(String age_rating) {
		this.age_rating = age_rating;
	}

	@Override
	public long totalLength() {
		// se recorren las peliculas de la saga y se suma su duracion
		long length = 360l;
		return length;
	}
}
