package py.edu.uc.lp3.herencia;

public class CursoDisenhoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CursoDisenhoApp cursoDisenhoApp = new CursoDisenhoApp();
		System.out.println("CursoDisenhoApp.main()");
		System.out.println("Descripcion del curso: " + cursoDisenhoApp.describe());

		// Ahora voy a crear un curso con los datos ya conocidos
		CursoDisenhoApp cursoDisenhoDeVerano;
		Brush brocha = new Brush();
		brocha.setCantidadStrokes(100_000);
		Double costo = 300_000.d;
		Double duracionHoras = 20.0;
		String modalidad = "Presencial";
		Lienzo tipoLienzo = new Lienzo();
		tipoLienzo.setMaterial("Cartulina de hilo");

		// Utilizamos todo el contexto para crear el curso con datos conocidos
		cursoDisenhoDeVerano = new CursoDisenhoApp(modalidad, duracionHoras, costo, brocha, tipoLienzo);
		System.out.println("CursoDisenhoApp.main()");
		System.out.println("Descripcion del curso: " + cursoDisenhoDeVerano.describe());

	}

	private String describe() {

		String descripcion = "Tipo de brocha: " + getBrocha().getCantidadStrokes();
		descripcion += " Tipo de Lienzo: " + getTipoLienzo().getMaterial();
		descripcion += " Duración del curso: " + getDuracionHoras();
		return descripcion;
	}

	Brush brocha;
	Double costo;
	Double duracionHoras;
	String modalidad;
	Lienzo tipoLienzo;

	public CursoDisenhoApp() {
		this.brocha = new Brush();
		this.costo = -1.0;
		this.duracionHoras = -1.0;
		this.modalidad = "no se sabe";
		this.tipoLienzo = new Lienzo();
	}

	public CursoDisenhoApp(String modalidad, Double duracionHoras, Double costo, Brush brocha, Lienzo tipoLienzo) {
		super();
		this.modalidad = modalidad;
		this.duracionHoras = duracionHoras;
		this.costo = costo;
		this.brocha = brocha;
		this.tipoLienzo = tipoLienzo;
	}

	public Brush getBrocha() {
		return brocha;
	}

	public Double getCosto() {
		return costo;
	}

	public Double getDuracionHoras() {
		return duracionHoras;
	}

	public String getModalidad() {
		return modalidad;
	}

	public Lienzo getTipoLienzo() {
		return tipoLienzo;
	}

	public void setBrocha(Brush brocha) {
		this.brocha = brocha;
	}

	public void setCosto(Double costo) {
		this.costo = costo;
	}

	public void setDuracionHoras(Double duracionHoras) {
		this.duracionHoras = duracionHoras;
	}

	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}

	public void setTipoLienzo(Lienzo tipoLienzo) {
		this.tipoLienzo = tipoLienzo;
	}

}
