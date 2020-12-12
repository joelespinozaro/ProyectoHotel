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

    @Override
    public String grabarCliente(String dni, String nombres, String apellidos, String celular, String email) {
        Cliente cli = new Cliente(dni, nombres, apellidos, celular, email);
        return daoClient.grabar(cli);
    }

    @Override
    public String actuaizarCliente(String dni, String celular) {
        Cliente cli = new Cliente();
        cli.setDni(dni);
        cli.setCelular(celular);
        return daoClient.actualizar(cli);
    }



}
