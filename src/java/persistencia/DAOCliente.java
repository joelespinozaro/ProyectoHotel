package persistencia;

import java.util.List;
import negocio.Cliente;

public interface DAOCliente {
    public String grabar(Cliente client);
    public List listar();
    public Cliente buscar(String dni);
    public String actualizar(Cliente client);
}
