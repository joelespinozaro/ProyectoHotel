
package persistencia;
import java.util.ArrayList;
import java.util.List;
import negocio.Empleado;
public class DAOEmpleadoImp implements DAOEmpleado {

    @Override
    public String grabar(Empleado emp) {
        String sql="insert into empleado values('"+emp.getCodigo()+"','"+emp.getNombre()+"','"+emp.getUsuario()+"','"+emp.getPassword()+"')";
        return Operacion.ejecutar(sql);
    }

    @Override
    public List listar() {
        List<Empleado> empleados = new ArrayList();
        String sql = "select * from empleado";
        List lista = Operacion.listar(sql);
        if(lista != null){
            for (int i = 1; i < lista.size(); i++) {
                Object[]fila = (Object[]) lista.get(i);
                Empleado emp = new Empleado();
                emp.setCodigo(fila[0].toString());
                emp.setNombre(fila[1].toString());
                emp.setUsuario(fila[2].toString());
                emp.setPassword(fila[3].toString());
                empleados.add(emp);
            }
            return empleados;
        }else{
            
        }
        
        
        return null;
    }

    @Override
    public Empleado buscar(String cod) {
        String sql = "select * from empleado where codigo='"+cod+"'";
        Object[]fila = Operacion.buscar(sql);
         if(fila!=null){
            Empleado emp = new Empleado();
            emp.setCodigo(fila[0].toString());
            emp.setNombre(fila[1].toString());
            emp.setUsuario(fila[2].toString());
            emp.setPassword(fila[3].toString());
            return emp;
         }
        return null;
    }
}
