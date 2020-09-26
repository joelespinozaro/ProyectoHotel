package negocio;

public class Habitacion {
    private String codigo;
    private TipoHabitacion tipo;


    public Habitacion() {
    }

    public Habitacion(String codigo, TipoHabitacion tipo) {
        this.codigo = codigo;
        this.tipo = tipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public TipoHabitacion getTipo() {
        return tipo;
    }

    public void setTipo(TipoHabitacion tipo) {
        this.tipo = tipo;
    }

    
    
}
