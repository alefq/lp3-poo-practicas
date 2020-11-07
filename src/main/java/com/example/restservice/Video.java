package com.example.restservice;

public class Video {
	
	int resolution[];
	double framesPerSecond;
	String category; 
	String subtitles[]; 
	String audios[];
	String devices[];
	double compatibilityPercentage;
	
	
	public String[] getAudios() {
		return audios;
	}
	public void setAudios(String[] audios) {
		this.audios = audios;
	}
	public String[] getDevices() {
		return devices;
	}
	public void setDevices(String[] devices) {
		this.devices = devices;
	}
	public double getCompatibilityPercentage() {
		return compatibilityPercentage;
	}
	public void setCompatibilityPercentage(double compatibilityPercentage) {
		this.compatibilityPercentage = compatibilityPercentage;
	}
	public int[] getResolution() {
		return resolution;
	}
	public void setResolution(int[] resolution) {
		this.resolution = resolution;
	}
	public double getFramesPerSecond() {
		return framesPerSecond;
	}
	public void setFramesPerSecond(double framesPerSecond) {
		this.framesPerSecond = framesPerSecond;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String[] getSubtitles() {
		return subtitles;
	}
	public void setSubtitles(String[] subtitles) {
		this.subtitles = subtitles;
	}
	
	public long totalLength( ) {
		long length = 0l;
		return length;
	}

}

// Comentario taller git
