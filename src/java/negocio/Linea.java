package negocio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Linea {
    private Habitacion habit;
    private String fechaInicial,fechaFinal;

    public Linea() {
    }

    public Linea(Habitacion habit, String fechaInicial, String fechaFinal) {
        this.habit = habit;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
    }
    
    public double getImporte(){
        return habit.getTipo().getPrecio() * this.getCantDias();
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
        return dateDiff(fechaInicial, fechaFinal);
    }
    
    private int dateDiff(String fechaInicial, String fechaFinal){
        int diff;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy",Locale.ROOT);
            Date fechaIni = sdf.parse(fechaInicial);
            Date fechaFin = sdf.parse(fechaFinal);

            long diffMiliSeg = Math.abs(fechaIni.getTime() - fechaFin.getTime());
            diff = (int)TimeUnit.DAYS.convert(diffMiliSeg, TimeUnit.MILLISECONDS) + 1;

        }catch(ParseException e){
            diff = 0;
        }

        return diff;
    }
    
}
