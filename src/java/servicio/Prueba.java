package servicio;

import negocio.Empleado;

public class Prueba {

    public static void main(String[] args) {
        
        Servicio serv = new ServicioFachada();
        Empleado emp = serv.validarEmpleado("emp1", "emp1");
        if(emp!=null){
            System.out.println("Acceso permitido"+" "+emp.getNombre());
        }else{
            System.out.println("Datos incorrectos");
        }
    }
    
}
