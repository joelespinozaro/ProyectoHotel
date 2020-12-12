package presentacion;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import negocio.Habitacion;
import servicio.ServicioHabitacion;
import servicio.ServicioHabitacionImp;

@WebServlet(name = "ControlHabitacion", urlPatterns = {"/ControlHabitacion"})
public class ControlHabitacion extends HttpServlet {
    private ModeloHabitacion modHab;
    private ServicioHabitacion serHab;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
        String acc = request.getParameter("acc");
       
            if(acc.equals("Regresar")){
              response.sendRedirect("Home.jsp");  
            }else {
                
                if(acc.equals("Nuevo") || acc.equals("Gestion de Habitacion")){
                  modHab = new ModeloHabitacion();
                  serHab = new ServicioHabitacionImp() ;

                  request.getSession().setAttribute("sesHab", modHab);
                }  

                if(acc.equals("Grabar")){
                  String codigo = request.getParameter("codigo");
                  String nombre = request.getParameter("nombre");
                  String tipo = request.getParameter("tipo");
                  double precio = Double.parseDouble(request.getParameter("precio"));

                  String msg = serHab.grabarHabitacion(codigo, nombre, tipo, precio);
                  modHab.setMsg(msg);
                }

                if(acc.equals("Buscar")){
                    String codigo = request.getParameter("codigo");
                    Habitacion hab = serHab.buscarHabitacion(codigo);
                    if(hab!=null){
                        modHab.setCodigo(hab.getCodigo());
                        modHab.setNombre(hab.getNombre());
                        modHab.setTipoHabitacion(hab.getTipoHabitacion());
                        modHab.setPrecio(String.valueOf(hab.getPrecio()));
                    }else{
                        modHab.setMsg("No existe el empleado.");
                    }
                }

                if(acc.equals("Actualizar")){
                  String codigo = request.getParameter("codigo");
                  String nombre = request.getParameter("nombre");
                  String tipo = request.getParameter("tipo");

                  String msg = serHab.actualizarHabitacion(codigo, nombre, tipo);
                  modHab.setMsg(msg);
                }

                response.sendRedirect("VistaHabitacion.jsp");
            }
    
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
