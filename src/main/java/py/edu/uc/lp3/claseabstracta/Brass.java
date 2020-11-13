package py.edu.uc.lp3.claseabstracta;

public class Brass extends Instrument {

	@Override
	public void play(Note n) {
		System.out.println("Brass.play() " + n);

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
