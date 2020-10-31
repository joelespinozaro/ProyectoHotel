package persistencia;
import negocio.*;
public interface DAOReserva {
    public String grabarReserva(Reserva res);
    public String grabarDetalle(Reserva res, Linea lin);
}
