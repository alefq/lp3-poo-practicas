package py.edu.uc.lp3.interfaces;



/*BiciVoladora puede implementar también el método volar*/
public class BiciVoladora extends Bicicleta implements Volador, VideoJuegoPosicionable {

	public void volar() {
		System.out.println("Bici volando");
	}

	@Override
	public Avatar getAvatar() {
		Avatar avatar = new Avatar();
		avatar.setNickname("Giant");
		return avatar ;
	}

	@Override
	public Posicion getUbicacion() {
		Posicion ubicacion = new Posicion();
		ubicacion.setX(0.99);
		return ubicacion ;
	}
}
