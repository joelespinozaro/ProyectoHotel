package servicio;

import negocio.Cliente;
import persistencia.DAOCliente;
import persistencia.DAOClienteImp;

public class ServicioClienteImp implements ServicioCliente {
    private DAOCliente daoClient;

    public ServicioClienteImp() {
        daoClient = new DAOClienteImp();
    }
    
    @Override
    public Cliente buscarCliente(String dni) {
        return daoClient.buscar(dni);
    }
}
