package py.edu.uc.lp3.interfaces;

import java.util.List;

public interface TransferenciaService {

		boolean transferir(Double monto, String cuentaDestino, String cuentaOrigen);
		List<Transferencia> listarTransacciones(String numeroTelefono);
		Double obtenerSaldo(String numeroTelefono);
}
