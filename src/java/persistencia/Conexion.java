package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    public Connection getConexion(){
        Connection cn= null;
        String url, user, password;
        url = "jdbc:derby://localhost:1527/ProyectoHotel";
        user = "joelespinozaro";
        password = "123";
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            cn = DriverManager.getConnection(url,user, password); 
        }catch(Exception e){
            cn=null;
        }
        return cn;
    }
}
