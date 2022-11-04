package py.edu.uc.lp3.herencia;

public class Producto extends ItemFacturable {
	private String proveedor;
	
	
	
	protected Long calcularPrecio() {
		return getPrecio() * 2;
	}
	
	
}
