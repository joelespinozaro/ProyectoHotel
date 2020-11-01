
package persistencia;

import java.util.List;
import negocio.Empleado;

public class PruebaEmpleado {

    public static void main(String[] args) {
        DAOEmpleado DAOEmp = new DAOEmpleadoImp();
        /*
        //Agregar Empleado
        Empleado emp = new Empleado("7585","Joel Espinoza", "emp2", "emp2");
        String mensaje = DAOEmp.grabar(emp);
        System.out.println(mensaje);
        
        //Listar Empleados
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
        */
        //Buscar Empleado
        Empleado empl = DAOEmp.buscar("E001");
        if(empl!=null){
            System.out.println("El empleado es: "+empl.getNombre());
        }else{
            System.out.println("No existe el empleado.");
        }
    }
    
}
