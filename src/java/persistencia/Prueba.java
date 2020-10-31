package persistencia;

//import java.sql.Connection;

import java.util.List;
import negocio.Cliente;
import negocio.Empleado;
import negocio.Habitacion;
import negocio.TipoHabitacion;

public class Prueba {

    public static void main(String[] args) {
        /*
        Connection cn = new Conexion().getConexion();
        if(cn!=null){
            System.out.println("🚀 Conectado");
        }else {
            System.out.println("No se puedo conectar");
        }
        String sql="insert into empleado values('E002','Empleado 2','emp2','emp2')";
        String msg = Operacion.ejecutar(sql);
        
        DAOEmpleado daoEmp = new DAOEmpleadoImp();
        Empleado emp = new Empleado("E003","Empleado 3","emp3","emp3");
        String mensaje = daoEmp.grabar(emp);
        System.out.println(mensaje);
        
        List lista = Operacion.listar("select * from empleado");
        if(lista != null){
            for(int i=0; i<lista.size(); i++){
                Object[] empleado = (Object[])lista.get(i);
                System.out.format("%10s %12s %10s %10s",empleado[0],empleado[1],empleado[2],empleado[3]);
                System.out.println();
            }        
        }else {
            System.out.println("No hay lista");
        }

        DAOEmpleado DAOEmp = new DAOEmpleadoImp();
        List<Empleado> empleados = DAOEmp.listar();
        if(empleados != null){
            System.out.println("-----------------------------------------------");
            System.out.printf("%10s %12s %10s %10s", "CÓDIGO", "NOMBRE", "USUARIO", "PASSWORD");
            System.out.println();
            System.out.println("-----------------------------------------------");
            for (Empleado empleado : empleados) {
                System.out.format("%10s %12s %10s %10s"
                        ,empleado.getCodigo()
                        ,empleado.getNombre()
                        ,empleado.getUsuario()
                        ,empleado.getUsuario());
                System.out.println();
            }
            System.out.println("-----------------------------------------------");
        }else {
            System.out.println("No hay lista");
        }

    

        String sql = "select * from empleado where codigo='E002'";
        Object[]fila = Operacion.buscar(sql);
        if(fila!=null){
            System.out.println(fila[0]+" "+fila[1]+" "+fila[2]+" "+fila[3]);
        }else {
            System.out.println("No existe el empleado.");
        }
       
        DAOEmpleado DAOEmp = new DAOEmpleadoImp();
        Empleado empleado =DAOEmp.buscar("E002");
        if(empleado!=null){
            System.out.format("%10s %12s %10s %10s"
                        ,empleado.getCodigo()
                        ,empleado.getNombre()
                        ,empleado.getUsuario()
                        ,empleado.getUsuario());
            System.out.println();
        }else{
            System.out.println("No existe el empleado.");
        }
        */
        
        /* // Agregar Cliente
        DAOCliente daoClient = new DAOClienteImp();
        Cliente client = new Cliente("33333333","Cliente 3","Cliente 3","987654322","cliente3@proyectohotel.com");
        String mensaje = daoClient.grabar(client);
        System.out.println(mensaje);
        */
        
        /* //Listar Clientes
        DAOCliente daoClient = new DAOClienteImp();
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
        */
        
        /* // Buscar Cliente
        DAOCliente daoClient = new DAOClienteImp();
        Cliente client = daoClient.buscar("11111111");
        if(client!=null){
            System.out.println("El cliente es: "+client.getNombres());
        }else{
            System.out.println("No existe el cliente.");
        }
        */

        /* // Agregar TipoHabitacion
        DAOTipoHabitacion daoTipoH = new DAOTipoHabitacionImp();
        TipoHabitacion th = new TipoHabitacion("T002","Habitación Doble","Habitación para dos personas", 180.0);
        String mensaje = daoTipoH.grabar(th);
        System.out.println(mensaje);
        */
        
        /* //Listar TipoHabitacion
        DAOTipoHabitacion daoTipoH = new DAOTipoHabitacionImp();
        List<TipoHabitacion> tipoHs = daoTipoH.listar();
        if(tipoHs != null){
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.printf("%10s %20s %35s %15s", "CÓDIGO", "NOMBRE", "DESCRIPCIÓN", "PRECIO");
            System.out.println();
            System.out.println("-------------------------------------------------------------------------------------------");
            for (TipoHabitacion th : tipoHs) {
                System.out.format("%10s %20s %35s %15s"
                        ,th.getCodigo()
                        ,th.getNombre()
                        ,th.getDescripcion()
                        ,th.getPrecio());
                System.out.println();
            }
            System.out.println("-------------------------------------------------------------------------------------------");
        }else {
            System.out.println("No hay tipo de habitación registrados.");
        }
        */
        
        /* // Buscar TipoHabitacion
        DAOTipoHabitacion daoTipoH = new DAOTipoHabitacionImp();
        TipoHabitacion th = daoTipoH.buscar("T002");
        if(th!=null){
            System.out.println("El tipo de habitación es: "+th.getNombre());
        }else{
            System.out.println("No existe el tipo de habitación");
        }
        */
        
         // Buscar Habitacion
        DAOHabitacion daoHabita = new DAOHabitacionImp();
        Habitacion habitacion = daoHabita.buscar("H001");
        if(habitacion!=null){
            System.out.println("La habitación es: "+habitacion.getCodigo());
        }else{
            System.out.println("No existe la habitación");
        }
        
    }
}
