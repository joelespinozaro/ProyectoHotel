
package persistencia;

import java.util.List;
import negocio.Habitacion;

public class PruebaHabitacion {

    public static void main(String[] args) {
        DAOHabitacion daoHab = new DAOHabitacionImp();
        
        
         // Agregar Habitación
        Habitacion habita = new Habitacion("201","Habitación Doble", "Doble", 200.0);
        String mensaje = daoHab.grabar(habita);
        System.out.println(mensaje);
        
        /*
         //Listar Habitaciones
        List<Habitacion> habitas = daoHab.listar();
        if(habitas != null){
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.printf("%15s %25s %15s %15s", "CÓDIGO", "NOMBRE", "TIPO", "PRECIO");
            System.out.println();
            System.out.println("-------------------------------------------------------------------------------------------");
            for (Habitacion hab : habitas) {
                System.out.format("%15s %25s %15s %15s"
                        ,hab.getCodigo()
                        ,hab.getNombre()
                        ,hab.getTipoHabitacion()
                        ,hab.getPrecio());
                System.out.println();
            }
            System.out.println("-------------------------------------------------------------------------------------------");
        }else {
            System.out.println("No hay habitaciones registrados.");
        }
        */
        
         // Buscar Habitación
        Habitacion habitacion = daoHab.buscar("H001");
        if(habitacion!=null){
            System.out.println("La habitación es: "+habitacion.getNombre());
        }else{
            System.out.println("No existe la habitación.");
        }
        
    }
    
}
