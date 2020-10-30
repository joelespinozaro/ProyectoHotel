package servicio;

import negocio.Empleado;

public interface Servicio {
    public Empleado validarEmpleado(String username,String password);
}
