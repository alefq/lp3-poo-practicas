package py.edu.uc.lp3.referencia;

public class Yorkshire extends Perro {

	@Override
	public void ladrar() {
		setFrecuenciaLadrido(Perro.FRECUENCIA_ALTA);
		super.ladrar();
	}
}
