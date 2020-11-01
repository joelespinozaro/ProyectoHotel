package negocio;

public class Habitacion {
    private String codigo,nombre, tipoHabitacion;
    private double precio;


    public Habitacion() {
    }

    public Habitacion(String codigo, String nombre, String tipoHabitacion, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipoHabitacion = tipoHabitacion;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    

    
    
}
