package py.edu.uc.lp3.interfaces;

import java.util.ArrayList;

public interface ServicioAcceso {

	boolean validarLogin(String nombreUsuario, String contrasenha);
	ArrayList<String> listarRoles(String nombreUsuario);
	ArrayList<String> listarPermisos(String rolDeUsuario);
	
}
