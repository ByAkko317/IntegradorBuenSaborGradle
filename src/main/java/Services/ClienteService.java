package Services;

import Dao.ClienteDAO;
import Dao.ClienteSQL;
import entities.Cliente;

public class ClienteService {
    private ClienteDAO clienteDAO;

    public ClienteService() {
        this.clienteDAO= new ClienteSQL();
    }

    public void registrarCliente(Cliente cliente) throws Exception {
        // Ejemplo validación sencilla
        if (cliente.getNombre() == null || cliente.getNombre().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser vacío");
        }
        clienteDAO.guardar(cliente);
    }
}
