package negocio;

public class Linea {
    private Habitacion habit;
    private String fechaInicial,fechaFinal;
    private int cantDias;

    public Linea() {
    }

    public Linea(Habitacion habit, String fechaInicial, String fechaFinal, int cantDias) {
        this.habit = habit;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.cantDias = cantDias;
    }
    
    public double getImporte(){
        return habit.getTipo().getPrecio() * cantDias;
    }

    public Habitacion getHabit() {
        return habit;
    }

    public void setHabit(Habitacion habit) {
        this.habit = habit;
    }

    public String getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(String fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public int getCantDias() {
        return cantDias;
    }

    public void setCantDias(int cantDias) {
        this.cantDias = cantDias;
    }
    
}
