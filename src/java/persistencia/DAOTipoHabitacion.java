package persistencia;

import java.util.List;
import negocio.TipoHabitacion;

public interface DAOTipoHabitacion {
    public String grabar(TipoHabitacion tipoHabita);
    public List listar();
    public TipoHabitacion buscar(String codigo);
    public String actualizar(TipoHabitacion tipoHabita);
}
