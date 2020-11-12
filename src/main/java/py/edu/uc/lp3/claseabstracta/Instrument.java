package py.edu.uc.lp3.claseabstracta;

public abstract class Instrument {
	/*
	 * Al declarar la clase como abstracta, estamos diciendo que nadie podrá
	 * instanciar esta clase, para utilizarla necesariamente tendrán que ser
	 * extensiones de la clase Instrument
	 */
	private String nombre;

	/*
	 * En una clase abstracta podemos definir prototipos para métodos, con el
	 * keyword "abstract" estamos diciendo que los descendientes de Instrument
	 * deben implementar este método. Al declarar un método como abstract, sólo
	 * se declara la firma, no la implementación. Esta utilidad es similara a
	 * los comportamientos o protocolos que se pueden definir con las interfaces
	 */
	public abstract void play(Note n);

	/*
	 * Una de las diferencias entre una clase abstract y una interfaz es que se
	 * puede tener métodos implementados, y métodos abstract que no tienen
	 * implementación. Para los métodos con implementación, se aplican las
	 * mismas reglas de la herencia normal, es decir se puede sobre escribir
	 * (override) siempre que los método no tengan el modificador "final"
	 */
	public void afinar() {
		System.out.println("Instrument afinando) ");
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
}
