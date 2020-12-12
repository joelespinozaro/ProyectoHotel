package persistencia;

import java.util.ArrayList;
import java.util.List;
import negocio.Habitacion;

public class DAOHabitacionImp implements DAOHabitacion {

    @Override
    public String grabar(Habitacion habitacion) {
        String sql="insert into habitacion values('"+habitacion.getCodigo()+"','"+habitacion.getNombre()
                +"','"+habitacion.getTipoHabitacion()+"',"+habitacion.getPrecio()+")";
        return Operacion.ejecutar(sql);
    }

    @Override
    public List listar() {
        String sql = "select * from habitacion";
        List lista = Operacion.listar(sql);
        if(lista != null){
            return lista;
        }
        return null;
    }

    @Override
    public Habitacion buscar(String codigo) {
        String sql = "select * from habitacion where codigo='"+codigo+"'";
        Object[]fila = Operacion.buscar(sql);
         if(fila!=null){
            Habitacion habitacion = new Habitacion();
            habitacion.setCodigo(fila[0].toString());
            habitacion.setNombre(fila[1].toString());
            habitacion.setTipoHabitacion(fila[2].toString());
            habitacion.setPrecio((double)fila[3]);
            
            return habitacion;
         }
        return null;
    }

    @Override
    public String actualizar(Habitacion habitacion) {
        String sql="update habitacion set Nombre='"+habitacion.getNombre()+"',tipo='"+habitacion.getTipoHabitacion()
                +"' where codigo='"+habitacion.getCodigo()+"'";
        return Operacion.ejecutar(sql);
    }

}
