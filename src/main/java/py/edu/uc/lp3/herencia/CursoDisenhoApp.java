package py.edu.uc.lp3.herencia;

public class CursoDisenhoApp {
	
	String modalidad;
	Double duracionHoras;
	Double costo;
	Brush brocha;
	Lienzo tipoLienzo;

	
	
	public CursoDisenhoApp(String modalidad, Double duracionHoras, Double costo, Brush brocha, Lienzo tipoLienzo) {
		super();
		this.modalidad = modalidad;
		this.duracionHoras = duracionHoras;
		this.costo = costo;
		this.brocha = brocha;
		this.tipoLienzo = tipoLienzo;
	}

	public CursoDisenhoApp() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CursoDisenhoApp cursoDisenhoApp = new CursoDisenhoApp();
		
	}

	public String getModalidad() {
		return modalidad;
	}

	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}

	public Double getDuracionHoras() {
		return duracionHoras;
	}

	public void setDuracionHoras(Double duracionHoras) {
		this.duracionHoras = duracionHoras;
	}

	public Double getCosto() {
		return costo;
	}

	public void setCosto(Double costo) {
		this.costo = costo;
	}

	public Brush getBrocha() {
		return brocha;
	}

	public void setBrocha(Brush brocha) {
		this.brocha = brocha;
	}

	public Lienzo getTipoLienzo() {
		return tipoLienzo;
	}

	public void setTipoLienzo(Lienzo tipoLienzo) {
		this.tipoLienzo = tipoLienzo;
	}

	
	
}
