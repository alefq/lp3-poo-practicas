package py.edu.uc.lp3.herencia;

import java.awt.Point;

public class Lienzo extends MaterialPintura {

	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public Point getDimensiones() {
		return dimensiones;
	}
	public void setDimensiones(Point dimensiones) {
		this.dimensiones = dimensiones;
	}
	public String getForma() {
		return forma;
	}
	public void setForma(String forma) {
		this.forma = forma;
	}
	String material;
	Point dimensiones;
	String forma;
	
}
