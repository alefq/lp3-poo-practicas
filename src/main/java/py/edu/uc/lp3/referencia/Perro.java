package py.edu.uc.lp3.referencia;


public class Perro {
	/*Inicialización con el constructor*/
	public static final Integer FRECUENCIA_NORMAL = new Integer(512);
	/*Inicialización con autoboxing*/
	public static final Integer FRECUENCIA_ALTA = 11000;
	public static final Integer FRECUENCIA_BAJA = 50;
	private Integer frecuenciaLadrido;
	/*
	 * Las variables que son un dato compuesto, son una clase, se inicializan a
	 * "null"
	 */
	private String nombre;
	/*
	 * Las variables de tipos de dato primitivo se inicializan a valores, en el
	 * caso de los numéricos, se inicializan a 0 (cero)
	 */
	private int pulgas;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPulgas() {
		return pulgas;
	}

	public void setPulgas(int pulgas) {
		this.pulgas = pulgas;
	}

	public static void main(String[] args) {
		/* perro y perro2 son las referencias */
		Perro perro = new Perro();
		/*
		 * una vez construida la instancia, tenemos el objeto "vivo" en la
		 * aplicación, no es necesario reservar memoria, el JVM se encarga de
		 * hacerlo por nosotros
		 */
		perro.setNombre("Scooby Doo");
		perro.setPulgas(200);

		Perro perro2 = new Perro();
		perro2.setNombre("Bolt");
		perro2.setPulgas(500);
		/*
		 * Al igual las referencias, el objeto creado inicialmente para el
		 * "perro" Scooby, pasa al pool de objetos del JVM y ya no está
		 * disponible para la aplicación. No es neceario liberar la memoria, el
		 * Garbage Collector se encarga de eliminar los objetos que ya no son
		 * referenciados
		 */
		perro = perro2;
		System.out.println("Perro: " + perro.getNombre());
		
		Yorkshire perro3 = new Yorkshire();
		perro.ladrar();
		perro3.ladrar();

	}

	public void setFrecuenciaLadrido(Integer frecuenciaLadrido) {
		this.frecuenciaLadrido = frecuenciaLadrido;
	}

	public Integer getFrecuenciaLadrido() {
		if (frecuenciaLadrido == null)
			inicializarFrecuencia();
		return frecuenciaLadrido;
	}

	private void inicializarFrecuencia() {
		setFrecuenciaLadrido(Perro.FRECUENCIA_NORMAL);
	}

	public void ladrar() {
		System.out.println("Emitiendo ladrido con frecuencia:"
				+ getFrecuenciaLadrido() + ". Perro: "+ getClass().getName());
	}
	
	public static void rodar(){
		Perro p = new Perro();
		p.setFrecuenciaLadrido(1);
	}
	
}
