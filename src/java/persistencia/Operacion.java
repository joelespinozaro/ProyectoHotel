package persistencia;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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
    public static List listar(String sql){
        List lista = new ArrayList();
        try{
            Connection cn = new Conexion().getConexion();
            if(cn != null){
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                ResultSetMetaData rm = rs.getMetaData();
                
                int numCol = rm.getColumnCount();
                String[] tituloCol = new String[numCol];
                
                for(int i=0; i<numCol; i++){
                    tituloCol[i]= rm.getColumnName(i+1);
                }
                
                lista.add(tituloCol);
                while(rs.next()){
                    Object[]fila = new Object[numCol];
                    for(int i=0;i<numCol;i++){
                        fila[i]=rs.getObject(i+1);
                    }
                    lista.add(fila);
                }
                cn.close();
            }
            else{
                lista=null;
            }
        }catch(SQLException e){
            lista= null;
        }
        return lista;
    }
    public static Object[] buscar(String sql){
        Object[] fila = null;
        List lista = listar(sql);
        if(lista != null){
            if(lista.size()>1){
                fila = (Object[])lista.get(1);
            }
        }
        return fila;
    }
}
