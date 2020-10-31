package persistencia;

import java.util.List;
import negocio.Habitacion;
import negocio.TipoHabitacion;

public interface DAOHabitacion {
    public String grabar(Habitacion habitacion);
    public List listar();
    public Habitacion buscar(String codigo);
    public String actualizar(Habitacion habitacion, TipoHabitacion tHabita);
}
