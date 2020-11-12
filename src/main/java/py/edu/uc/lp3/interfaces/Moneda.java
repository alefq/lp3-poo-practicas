package py.edu.uc.lp3.interfaces;

public class Moneda {
	public static final Double COTIZACION_DEFAULT_DOLAR = 7000.0;
	private String isoCode;
	private Double cotizacionEnGuaranies;
	
	public String getIsoCode() {
		return isoCode;
	}
	public void setIsoCode(String isoCode) {
		this.isoCode = isoCode;
	}
	public Double getCotizacionEnGuaranies() {
		return cotizacionEnGuaranies;
	}
	public void setCotizacionEnGuaranies(Double cotizacionEnGuaranies) {
		this.cotizacionEnGuaranies = cotizacionEnGuaranies;
	}
	
	

}
