package negocio;

import java.util.List;

public class Prueba {

    public static void main(String[] args) {

        Habitacion h1 = new Habitacion("401","Habitación Doble", "Doble", 200.0);
        Habitacion h2 = new Habitacion("402","Habitación Simple", "Simple", 100.0);
        Habitacion h3 = new Habitacion("503","Habitación Matrimonial", "Matrimonial", 250.0);
        Habitacion h4 = new Habitacion("504","Habitación Cuadruple", "Cuadruple", 350.0);

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
            String nombre = lin.getHabit().getNombre();
            double precio = lin.getHabit().getPrecio();
            int cantDias = lin.getCantDias();
            double importe = lin.getImporte();
            
            System.out.println(codigo+ "  "+nombre+ "  "+precio+"  "+cantDias+ "  "+importe);
        }
         System.out.println("Sub Total: "+reserva.getSubTot());
         reserva.setPorDesc(10);
         System.out.println("Descuento: "+reserva.getDesc());
         System.out.println("Total: "+reserva.getTotal());
        
        
    }
    
}
