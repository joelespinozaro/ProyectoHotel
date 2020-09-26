package persistencia;

import java.sql.*;

public class Operacion {
    public static String ejecutar(String sql){
        String msg = "Operación Exitosa 🔥 ";
        try {
            Connection cn = new Conexion().getConexion();
            if(cn != null){
                Statement st = cn.createStatement();
                st.executeUpdate(sql);
                cn.close();
            }
            else{
                msg="No hay conexión";
            }
        }catch(SQLException e){
            msg=e.getMessage();
        }
        
        return msg;
        
    }
}
