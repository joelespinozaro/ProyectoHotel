
package servicio;
import negocio.*;
import persistencia.*;

public class ServicioHabitacionImp implements ServicioHabitacion {
    private DAOHabitacion daoHab;

    public ServicioHabitacionImp() {
        daoHab = new DAOHabitacionImp();
    }
    
    @Override
    public Habitacion buscarHabitacion(String cod) {
        return daoHab.buscar(cod);
    }
}
