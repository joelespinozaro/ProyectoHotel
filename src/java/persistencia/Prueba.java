package persistencia;

//import java.sql.Connection;

public class Prueba {

    public static void main(String[] args) {
        /*
        Connection cn = new Conexion().getConexion();
        if(cn!=null){
            System.out.println("🚀 Conectado");
        }else {
            System.out.println("No se puedo conectar");
        }*/
        String sql="insert into cliente values('22222222','Cliente 2','Cliente 2','987654654','cliente2@proyectohotel.com')";
        String msg = Operacion.ejecutar(sql);
        System.out.println(msg);
    }
    
}
