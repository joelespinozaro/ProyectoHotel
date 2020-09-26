package negocio;

import java.util.List;

public class Prueba {

    public static void main(String[] args) {
        TipoHabitacion th1 = new TipoHabitacion("001","Habitación Básica","Es una habitación simple",200);
        TipoHabitacion th2 = new TipoHabitacion("002","Habitación Superior","Es una habitación superior",400);
        TipoHabitacion th3 = new TipoHabitacion("003","Habitación Premium","Es una habitación única",600);
        
        Habitacion h1 = new Habitacion("401", th1);
        Habitacion h2 = new Habitacion("402", th1);
        Habitacion h3 = new Habitacion("510",th2);
        Habitacion h4 = new Habitacion("901",th3);
        
        Reserva reserva = new Reserva();
        
        reserva.agregar(h1, "01/10/2020", "02/10/2020");
        reserva.agregar(h2, "04/10/2020", "08/10/2020");
        reserva.agregar(h3, "06/10/2020", "07/10/2020");
        reserva.agregar(h4, "08/10/2020", "10/10/2020");
        
        //reserva.quitar("401");

        List cesta = reserva.getCesta();
        
        for(int i = 0; i < cesta.size();i++){
            Linea lin = (Linea)cesta.get(i);
            String codigo = lin.getHabit().getCodigo();
            String nombre = lin.getHabit().getTipo().getNombre();
            double precio = lin.getHabit().getTipo().getPrecio();
            int cantDias = lin.getCantDias();
            double importe = lin.getImporte();
            
            System.out.println(codigo+ "  "+nombre+ "  "+precio+"  "+cantDias+ "  "+importe);
        }
         System.out.println("Sub Total: "+reserva.getSubTot());
         reserva.setPorDesc(12);
         System.out.println("Descuento: "+reserva.getDesc());
         System.out.println("Total: "+reserva.getTotal());
        
        
    }
    
}
