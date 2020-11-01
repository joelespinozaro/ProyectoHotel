package persistencia;

import java.util.ArrayList;
import java.util.List;
import negocio.Cliente;

public class DAOClienteImp implements DAOCliente{

    @Override
    public String grabar(Cliente client) {
        String sql="insert into cliente values('"+client.getDni()+"','"+client.getNombres()
                +"','"+client.getApellidos()+"','"+client.getCelular()+"','"+client.getEmail()+"')";
        return Operacion.ejecutar(sql);
    }

    @Override
    public List listar() {
        List<Cliente> clientes = new ArrayList();
        String sql = "select * from cliente";
        List lista = Operacion.listar(sql);
        if(lista != null){
            for (int i = 1; i < lista.size(); i++) {
                Object[]fila = (Object[]) lista.get(i);
                Cliente client = new Cliente();
                client.setDni(fila[0].toString());
                client.setNombres(fila[1].toString());
                client.setApellidos(fila[2].toString());
                client.setCelular(fila[3].toString());
                client.setEmail(fila[4].toString());
                clientes.add(client);
            }
            return clientes;
        }      
        return null;
    }

    @Override
    public Cliente buscar(String dni) {
        String sql = "select * from cliente where dni='"+dni+"'";
        Object[] fila = Operacion.buscar(sql);
         if(fila!=null){
            Cliente client = new Cliente();
                client.setDni(fila[0].toString());
                client.setNombres(fila[1].toString());
                client.setApellidos(fila[2].toString());
                client.setCelular(fila[3].toString());
                client.setEmail(fila[4].toString());
            return client;
         }
        return null;
    }

    @Override
    public String actualizar(Cliente client) {
        String sql="update cliente set celular='"+client.getCelular()+"' where dni='"+client.getDni()+"'";
        return Operacion.ejecutar(sql);
    }
    
}
