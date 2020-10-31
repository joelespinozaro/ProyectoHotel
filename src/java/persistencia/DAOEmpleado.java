package persistencia;

import java.util.List;
import negocio.Empleado;

public interface DAOEmpleado {
    public String grabar(Empleado emp);
    public List listar();
    public Empleado buscar(String cod);
    public String actualizar(Empleado emp);
}
