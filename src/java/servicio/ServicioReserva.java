package servicio;
import negocio.*;


public interface ServicioReserva {
    public Reserva nuevaReserva(String codEmpleado, String porDes);
    public void agregarHabitacion(String cod,String fechaIni, String fechaFin);
    public void quitarHabitacion(String cod);
    public String grabarReserva(String estado,String dni);
}
