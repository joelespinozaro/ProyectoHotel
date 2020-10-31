package persistencia;

import negocio.Linea;
import negocio.Reserva;

public class DAOReservaImp implements DAOReserva{

    @Override
    public String grabarReserva(Reserva res) {
        String sql="insert into reserva values('"+res.getNumReserva()+"','"+res.getFecha()+"','"+res.getEstado()
                +"',"+res.getTotal()+",'"+res.getCliente().getDni()+"','"+res.getEmpleado().getCodigo()+"')";
        return Operacion.ejecutar(sql);
    }

    @Override
    public String grabarDetalle(Reserva res, Linea lin) {
        String sql="insert into detalle values('"+res.getNumReserva()+"','"+lin.getHabit().getCodigo()+"','"+lin.getFechaInicial()
            +"','"+lin.getFechaFinal()+"',"+lin.getCantDias()+")";
        return Operacion.ejecutar(sql);
    }
    
}
