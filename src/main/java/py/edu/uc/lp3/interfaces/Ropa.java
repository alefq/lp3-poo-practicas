package py.edu.uc.lp3.interfaces;

public class Ropa implements Cotizable, Comparable<Ropa>, Volador {

	@Override
	public Long getPrecio(String identificador) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int compareTo(Ropa o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Double getPrecioUSD(String identificador) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void volar() {
		System.out.println("Ropa voladora");

	}

}
