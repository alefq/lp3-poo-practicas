package com.example.restservice;

public class Serie extends Video {

	int chapters;
	int season;
	public int getChapters() {
		return chapters;
	}
	public void setChapters(int chapters) {
		this.chapters = chapters;
	}
	public int getSeason() {
		return season;
	}
	public void setSeason(int season) {
		this.season = season;
	}
	
	@Override
	public long totalLength() {
		// se recorren las temporadas y los capitulos de c/ temporada
		long length = 420l;
		return length;
	}
	
}
