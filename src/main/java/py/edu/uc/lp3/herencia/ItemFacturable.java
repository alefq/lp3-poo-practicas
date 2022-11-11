package py.edu.uc.lp3.herencia;

import java.awt.Image;

public class ItemFacturable implements Comparable<ItemFacturable> {
	
	Double rating;

	
	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Long getPrecio() {
		return precio;
	}

	public void setPrecio(Long precio) {
		this.precio = precio;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	private String descripcion;
	private Long precio;
	private String codigo;

	protected Image obtenterIcono() {
		return null;
	}
	
	protected Long calcularPrecio() {
		return getPrecio();
	}
	
	public static void main(String[] args) {
		ItemFacturable item1= new Servicio();

		ItemFacturable item2= new Producto();
		item1.setPrecio(1000l);
		item2.setPrecio(5000l);
		
		System.out.println("Precio 1: "+ item1.calcularPrecio());

		System.out.println("Precio 2: "+ item2.calcularPrecio());
		 item1.compareTo(item2);
	}

	@Override
	public int compareTo(ItemFacturable itemAComparar) {
		// TODO Auto-generated method stub
		int retorno = getPrecio().compareTo(itemAComparar.getPrecio());;
		return retorno;
//		return getCodigo().compareTo(itemAComparar.getCodigo());
		
	}
}
