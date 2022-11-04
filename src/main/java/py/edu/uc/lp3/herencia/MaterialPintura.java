package py.edu.uc.lp3.herencia;

public class MaterialPintura extends Producto {

	public String getUnidadMedida() {
		return unidadMedida;
	}
	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}
	public Double getCantidadMaterial() {
		return cantidadMaterial;
	}
	public void setCantidadMaterial(Double cantidadMaterial) {
		this.cantidadMaterial = cantidadMaterial;
	}
	String unidadMedida;
	Double cantidadMaterial;
	
}
