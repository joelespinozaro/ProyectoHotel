package servicio;

import java.util.List;
import negocio.Habitacion;

public interface ServicioHabitacion {
    public String grabarHabitacion(String codigo, String nombre, String tipo, double precio);
    public Habitacion buscarHabitacion(String cod);
    public List listarHabitacion();
    public String actualizarHabitacion(String codigo, String nombre, String tipohabitacion);    
}
