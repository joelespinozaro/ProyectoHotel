package presentacion;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servicio.*;
@WebServlet(name = "ControlReserva", urlPatterns = {"/ControlReserva"})
public class ControlReserva extends HttpServlet {
    private ModeloReserva modRes;
    private ServicioReserva serRes;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String acc = request.getParameter("acc");
        
        if(acc.equals("Regresar")){
              response.sendRedirect("Home.jsp");  
        }else if(acc.equals("Regresar a Reserva")){
             response.sendRedirect("VistaReserva.jsp");
        }else {
            if(acc.equals("Nuevo Reserva") || acc.equals("Gestion de Reserva")){
                serRes = new ServicioReservaImp();
                modRes = new ModeloReserva(serRes.nuevaReserva("E001","10"));
                request.getSession().setAttribute("sesRes", modRes);
                response.sendRedirect("VistaReserva.jsp");

            }
            if(acc.equals("Listar Habitaciones")){
                modRes.setListHab(serRes.listarHabitaciones());
                response.sendRedirect("Catalogo.jsp");
            }
            if(acc.equals("Agregar")){
                String codigo = request.getParameter("codigo");
                String fechaInicial = request.getParameter("fechaInicial");
                String fechaFinal = request.getParameter("fechaFinal");
                serRes.agregarHabitacion(codigo, fechaInicial, fechaFinal);
                response.sendRedirect("VistaReserva.jsp");
            }
            if(acc.equals("Quitar")){
                String codigo = request.getParameter("codigo");
                serRes.quitarHabitacion(codigo);
                response.sendRedirect("VistaReserva.jsp");
            }
            if(acc.equals("")){

            }
            //response.sendRedirect("VistaReserva.jsp");
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
