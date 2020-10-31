package servicio;

import java.util.List;
import negocio.*;
import persistencia.*;

public class ServicioEmpleadoImp implements ServicioEmpleado {
    private DAOEmpleado DAOEmp;
    
    public ServicioEmpleadoImp(){
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

    @Override
    public String grabarEmpleado(String codigo, String nombre, String usuario, String password) {
        Empleado empleado = new Empleado(codigo,nombre, usuario, password);
        return DAOEmp.grabar(empleado);
    }

    @Override
    public Empleado buscarEmpleado(String codigo) {
        return DAOEmp.buscar(codigo);
    }

    @Override
    public String actuaizarEmpleado(String codigo, String password) {
        Empleado empleado = new Empleado();
        empleado.setCodigo(codigo);
        empleado.setPassword(password);
        return DAOEmp.actualizar(empleado);
    }
}
