package py.edu.uc.lp3.interfaces;

/**
 * 
 * @author afeltes
 * La interfaz Cotizable nos permite establecer un protocolo para que las clases que la implementen
 * puedan responder con su precio y su precio en dólares.
 *
 */
public interface Cotizable {

	/**
	 * Precio en Guaraníes, de un identificador de producto
	 * @param identificador
	 * @return
	 */
	/**
	 * 
	 * @param identificador
	 * @return
	 */
	Long getPrecio(String identificador);
	Double getPrecioUSD(String identificador);
}
