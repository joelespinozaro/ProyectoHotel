package persistencia;

import java.util.ArrayList;
import java.util.List;
import negocio.TipoHabitacion;

public class DAOTipoHabitacionImp implements DAOTipoHabitacion {

    @Override
    public String grabar(TipoHabitacion tipoHabita) {
        String sql="insert into tipohabitacion values('"+tipoHabita.getCodigo()+"','"+tipoHabita.getNombre()+"'"
                + ",'"+tipoHabita.getDescripcion()+"',"+tipoHabita.getPrecio()+")";
        return Operacion.ejecutar(sql);
    }

    @Override
    public List listar() {
        List<TipoHabitacion> tHabitaciones = new ArrayList();
        String sql = "select * from tipohabitacion";
        List lista = Operacion.listar(sql);
        if(lista != null){
            for (int i = 1; i < lista.size(); i++) {
                Object[]fila = (Object[]) lista.get(i);
                TipoHabitacion tHabita = new TipoHabitacion();
                tHabita.setCodigo(fila[0].toString());
                tHabita.setNombre(fila[1].toString());
                tHabita.setDescripcion(fila[2].toString());
                tHabita.setPrecio((double)fila[3]);
                tHabitaciones.add(tHabita);
            }
            return tHabitaciones;
        }
        return null;
    }

    @Override
    public TipoHabitacion buscar(String codigo) {
        String sql = "select * from tipohabitacion where codigo='"+codigo+"'";
        Object[]fila = Operacion.buscar(sql);
         if(fila!=null){
            TipoHabitacion tHabita = new TipoHabitacion();
            tHabita.setCodigo(fila[0].toString());
            tHabita.setNombre(fila[1].toString());
            tHabita.setDescripcion(fila[2].toString());
            tHabita.setPrecio((double)fila[3]);
            return tHabita;
         }
        return null;
    }

    @Override
    public String actualizar(TipoHabitacion tipoHabita) {
        String sql="update tipohabitacion set descripcion='"+tipoHabita.getDescripcion()+"' where codigo='"+tipoHabita.getCodigo()+"'";
        return Operacion.ejecutar(sql);
    }
    
}
