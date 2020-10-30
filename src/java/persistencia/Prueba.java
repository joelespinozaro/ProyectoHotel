package persistencia;

//import java.sql.Connection;

import java.util.List;
import negocio.Empleado;

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
        
    }
}
