package servicio;

import negocio.Empleado;
import negocio.Reserva;

public class Prueba {

    public static void main(String[] args) {
        ServicioEmpleado serv = new ServicioEmpleadoImp();
        
        /*
        Empleado emp = serv.validarEmpleado("emp1", "emp1");
        if(emp!=null){
            System.out.println("Acceso permitido"+" "+emp.getNombre());
        }else{
            System.out.println("Datos incorrectos");
        }
        */
        // String msg = serv.grabarEmpleado("E004", "Empleado 4", "emp4", "emp4");
        // System.out.println(msg);
        // Empleado emp = serv.buscarEmpleado("E004");
        // System.out.println(emp.getNombre());
        
        //String msg = serv.actuaizarEmpleado("E003", "pass03");
        //System.out.println(msg);
        
       ServicioReserva serRes = new ServicioReservaImp();
       Reserva res = serRes.nuevaReserva("E002", "10");
       serRes.agregarHabitacion("H001", "10/10/2020", "12/10/2020");
       // serRes.agregarHabitacion("H001", "11/10/2020", "12/10/2020");
       
       String msg = serRes.grabarReserva("Atendido", "22222222");
       System.out.println(msg);
    }
    
}
