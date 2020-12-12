
package servicio;

import negocio.Cliente;

public interface ServicioCliente {
    public Cliente buscarCliente(String dni);
    public String grabarCliente(String dni, String nombres, String apellidos, String celular, String email);
    public String actuaizarCliente(String dni, String celular);
}
