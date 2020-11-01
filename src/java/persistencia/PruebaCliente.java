package persistencia;

import java.util.List;
import negocio.Cliente;

public class PruebaCliente {

    public static void main(String[] args) {
        DAOCliente daoClient = new DAOClienteImp();
        
        /* // Agregar Cliente
        Cliente client = new Cliente("33333333","Cliente 3","Cliente 3","987654322","cliente3@proyectohotel.com");
        String mensaje = daoClient.grabar(client);
        System.out.println(mensaje);
        */
        
         //Listar Clientes
        List<Cliente> clientes = daoClient.listar();
        if(clientes != null){
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.printf("%10s %15s %15s %15s %30s", "DNI", "NOMBRES", "APELLIDOS", "CELULAR", "EMAIL");
            System.out.println();
            System.out.println("-------------------------------------------------------------------------------------------");
            for (Cliente cliente : clientes) {
                System.out.format("%10s %15s %15s %15s %30s"
                        ,cliente.getDni()
                        ,cliente.getNombres()
                        ,cliente.getApellidos()
                        ,cliente.getCelular()
                        ,cliente.getEmail());
                System.out.println();
            }
            System.out.println("-------------------------------------------------------------------------------------------");
        }else {
            System.out.println("No hay clientes registrados.");
        }
        
        
        /* // Buscar Cliente
        DAOCliente daoClient = new DAOClienteImp();
        Cliente client = daoClient.buscar("11111111");
        if(client!=null){
            System.out.println("El cliente es: "+client.getNombres());
        }else{
            System.out.println("No existe el cliente.");
        }
        */
    }
}
