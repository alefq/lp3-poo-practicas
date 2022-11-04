package py.edu.uc.lp3.herencia;

public class Servicio extends ItemFacturable  {

	private String encargado;

	protected Long calcularPrecio() {
		return getPrecio() * 3;
	}

}
