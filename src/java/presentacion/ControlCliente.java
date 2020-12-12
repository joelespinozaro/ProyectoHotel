package presentacion;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import negocio.Cliente;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servicio.ServicioClienteImp;

@WebServlet(name = "ControlCliente", urlPatterns = {"/ControlCliente"})
public class ControlCliente extends HttpServlet {
    private ModeloCliente modCli;
    private ServicioClienteImp serCli;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String acc = request.getParameter("acc");
        
            if(acc.equals("Regresar")){
              response.sendRedirect("Home.jsp");  
            }else {
        
            if(acc.equals("Nuevo") || acc.equals("Gestion de Cliente")){
              modCli = new ModeloCliente();
              serCli = new ServicioClienteImp();
              
              request.getSession().setAttribute("sesCli", modCli);
            }
        
            if(acc.equals("Grabar")){
              String dni = request.getParameter("dni");
              String nombres = request.getParameter("nombres");
              String apellidos = request.getParameter("apellidos");
              String celular = request.getParameter("celular");
              String email = request.getParameter("email");
              
              String msg = serCli.grabarCliente(dni, nombres, apellidos, celular, email);
              modCli.setMsg(msg);
            }
            
            if(acc.equals("Buscar")){
              String dni = request.getParameter("dni");
              Cliente cli = serCli.buscarCliente(dni);
              if(cli!=null){
                  modCli.setDni(cli.getDni());
                  modCli.setNombres(cli.getNombres());
                  modCli.setApellidos(cli.getApellidos());
                  modCli.setCelular(cli.getCelular());
                  modCli.setEmail(cli.getEmail());
              }else{
                  modCli.setMsg("No existe el cliente.");
              }
            }
            
            if(acc.equals("Actualizar")){
              String dni = request.getParameter("dni");
              String celular = request.getParameter("celular");

              String msg = serCli.actuaizarCliente(dni, celular);
              modCli.setMsg(msg);
            }
            response.sendRedirect("VistaCliente.jsp");
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
