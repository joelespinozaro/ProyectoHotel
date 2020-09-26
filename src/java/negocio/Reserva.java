package negocio;

import java.util.ArrayList;
import java.util.List;

public class Reserva {
    private String numReserva, fecha, estado;
    private double porDesc;
    private Cliente cliente;
    private Empleado empleado;
    private List cesta;

    public Reserva() {
        cesta = new ArrayList();
    }
    
    public List getCesta() {
        return cesta;
    }
    
    public void agregar(Habitacion habit, String fechaInicial, String fechaFinal, int cantDias){
        Linea lin = new Linea(habit, fechaInicial,fechaFinal,cantDias);
        cesta.add(lin);
    }
    
    public void quitar(String cod){
        for(int i=0; i<cesta.size(); i++){
            Linea lin = (Linea)cesta.get(i);
            if(lin.getHabit().getCodigo().equals(cod)){
                cesta.remove(i);
            }
        }
    }
    public double getSubTot(){
        double total=0;
         for(int i=0; i<cesta.size(); i++){
            Linea lin = (Linea)cesta.get(i);
            total = total + lin.getImporte();
        }
         return total;
    }
    
    public double getDesc(){
        return this.getSubTot() * this.getPorDesc();
    }
    public double getTotal(){
        return this.getSubTot()-this.getDesc();
    }
                
    public double getPorDesc() {
        return porDesc;
    }

    public void setPorDesc(double porDesc) {
        this.porDesc = porDesc / 100;
    }

    public String getNumReserva() {
        return numReserva;
    }

    public void setNumReserva(String numReserva) {
        this.numReserva = numReserva;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
        

    
    
}
