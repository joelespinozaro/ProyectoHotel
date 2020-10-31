package servicio;

import negocio.Empleado;

public interface ServicioEmpleado {
    public Empleado validarEmpleado(String username,String password);
    public String grabarEmpleado(String codigo, String nombre, String usuario, String password);
    public Empleado buscarEmpleado(String codigo);
    public String actuaizarEmpleado(String codigo, String password);
}
