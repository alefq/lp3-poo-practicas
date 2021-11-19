package py.edu.uc.lp3.interfaces;

import java.util.ArrayList;

public class ServicioAccesoImpl implements ServicioAcceso {

	@Override
	public boolean validarLogin(String nombreUsuario, String contrasenha) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<String> listarRoles(String nombreUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<String> listarPermisos(String rolDeUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

}
