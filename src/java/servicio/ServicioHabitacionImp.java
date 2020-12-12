
package servicio;
import java.util.List;
import negocio.*;
import persistencia.*;

public class ServicioHabitacionImp implements ServicioHabitacion {
    private DAOHabitacion daoHab;
       
    public ServicioHabitacionImp() {
        daoHab = new DAOHabitacionImp();
    }
    
    @Override
    public String grabarHabitacion(String codigo, String nombre, String tipo, double precio) {
        Habitacion h = new Habitacion(codigo, nombre, tipo, precio);
        return daoHab.grabar(h);
    }

    @Override
    public String actualizarHabitacion(String codigo,String nombre, String tipo) {
        Habitacion h = new Habitacion();
        h.setCodigo(codigo);
        h.setNombre(nombre);
        h.setTipoHabitacion(tipo);
        return daoHab.actualizar(h);
    }

    @Override
    public Habitacion buscarHabitacion(String cod) {
        return daoHab.buscar(cod);
    }

    @Override
    public List listarHabitacion() {
        return daoHab.listar();
    }


}
