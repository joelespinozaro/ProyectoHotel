package servicio;

import java.util.List;
import negocio.*;
import persistencia.*;

public class ServicioFachada implements Servicio {
    private DAOEmpleado DAOEmp;
    
    public ServicioFachada(){
        DAOEmp = new DAOEmpleadoImp();
    }
    
    @Override
    public Empleado validarEmpleado(String username, String password) {
        List<Empleado> lista=DAOEmp.listar();
        if(lista!=null){
            for(Empleado empleado: lista){
                if(empleado.getUsuario().equals(username) && empleado.getPassword().equals(password)){
                    return empleado;
                }
            }
        }
        return null;
    }
}
