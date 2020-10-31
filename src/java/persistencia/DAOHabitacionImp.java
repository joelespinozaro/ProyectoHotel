package persistencia;

import java.util.ArrayList;
import java.util.List;
import negocio.Habitacion;
import negocio.TipoHabitacion;

public class DAOHabitacionImp implements DAOHabitacion {

    @Override
    public String grabar(Habitacion habitacion) {
        String sql="insert into habitacion values('"+habitacion.getCodigo()+"','"+habitacion.getTipo()+"')";
        return Operacion.ejecutar(sql);
    }

    @Override
    public List listar() {
        List<Habitacion> habitaciones = new ArrayList();
        String sql = "select * from habitacion";
        List lista = Operacion.listar(sql);
        if(lista != null){
            for (int i = 1; i < lista.size(); i++) {
                Object[]fila = (Object[]) lista.get(i);
                Habitacion habitacion = new Habitacion();
                habitacion.setCodigo(fila[0].toString());
                
                DAOTipoHabitacion daoTipoH = new DAOTipoHabitacionImp();
                TipoHabitacion th = daoTipoH.buscar(fila[1].toString());
                habitacion.setTipo(th);
                
                habitaciones.add(habitacion);
            }
            return habitaciones;
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
            
            DAOTipoHabitacion daoTipoH = new DAOTipoHabitacionImp();
            TipoHabitacion th = daoTipoH.buscar(fila[1].toString());
            habitacion.setTipo(th);
            
            return habitacion;
         }
        return null;
    }

    @Override
    public String actualizar(Habitacion habitacion, TipoHabitacion tHabita) {
        String sql="update habitacion set codtipohabitacion='"+tHabita.getCodigo()+"' where codigo='"+habitacion.getCodigo()+"'";
        return Operacion.ejecutar(sql);
    }
    
}
