package py.edu.uc.lp3.interfaces;

public class Spiderman extends java.lang.Object implements Volador {

	String universe; 	
	private Integer vidas;
	protected String colorMascara;
	
	
	public Spiderman() {
		universe =  "marvel";		
		vidas = 1;
	}

	public Spiderman(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//Una instancia de tipo Spiderman
		Spiderman peter = new Spiderman();		
		Spiderman steven = new Spiderman("");		
		System.gc();

		System.out.println("argumentos: " + args);
		System.out.println("Hola soy: " + peter.toString());
				

	}
	
	public String getUniverse() {
		return universe;
	}
	
	private void calcularColorMascara () {
		//TODO: Definir colores
	}
	
	protected String obtenerSaludo() {
		//TODO: Definir saludo
		return "Hola";
	}

	public void setUniverse(String universe) {
		this.universe = universe;
	}

	public Integer getVidas() {
		return vidas;
	}

	public void setVidas(Integer vidas) {
		this.vidas = vidas;
	}



	public Spiderman newInstance() {
		Spiderman nuevoSpiderman = new Spiderman();
		//Verificar resolución de pantalla
		//velocidad de cpu
		return nuevoSpiderman;
	}

	@Override
	public void volar() {
		System.out.println("Soy superman estoy volando");
		
	}

}
