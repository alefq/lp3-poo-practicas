package py.edu.uc.lp3.interfaces;

import java.util.List;

public interface Autorizable {
	
	boolean login(String emailOusername, String password);
	List<String> listarRoles(String emailOusername);

}
