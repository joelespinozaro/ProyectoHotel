package servicio;
import negocio.*;
import persistencia.*;

public class ServicioReservaImp implements ServicioReserva {
    private ServicioEmpleado serEmp;
    private ServicioCliente serCli;
    private ServicioHabitacion serHab;
    private DAOReserva daoRes;
    private Reserva res;
    
    public ServicioReservaImp() {
        serEmp = new ServicioEmpleadoImp();
        serCli = new ServicioClienteImp();
        serHab = new ServicioHabitacionImp();
        daoRes = new DAOReservaImp();
    }

    @Override
    public Reserva nuevaReserva(String codEmpleado, String porDes) {
        res = new Reserva();
        res.setNumReserva(this.getNum());
        res.setFecha(this.getFec());
        res.setEmpleado(serEmp.buscarEmpleado(codEmpleado));
        res.setPorDesc(Double.parseDouble(porDes));
        return res;
    }

    @Override
    public void agregarHabitacion(String cod, String fechaIni, String fechaFin) {
        res.agregar(serHab.buscarHabitacion(cod), fechaIni, fechaFin);
    }

    @Override
    public void quitarHabitacion(String cod) {
        res.quitar(cod);
    }

    @Override
    public String grabarReserva(String estado, String dni) {
        res.setEstado(estado);
        res.setCliente(serCli.buscarCliente(dni));
        String msg = daoRes.grabarReserva(res);
        for(int i=0; i<res.getCesta().size();i++){
            Linea lin = (Linea)res.getCesta().get(i);
            msg = daoRes.grabarDetalle(res, lin);
        }
        return msg;
    }
    
    private String getNum(){
        return "P00001";
    }
    private String getFec(){
        return "10/10/2020";
    }


    
}
