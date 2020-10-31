<%-- 
    Document   : VistaEmpleado
    Created on : 31-oct-2020, 15:35:37
    Author     : joelespinozaro
--%>

<%@page import="presentacion.ModeloEmpleado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            h1{
                text-align:center;
            }
            form {
                display: flex;
                flex-direction:column;
                align-items: center;
                justify-content: center;
                height:80vh;
            }
            input{
                margin: 10px 0;
                padding: 10px 14px;
                border-radius: 10px;
                border:none;
                box-shadow: 0 0 1px 1px rgba(0,0,0,0.2);
            }
        </style>
    </head>
    <body>
        <h1>Gestión de Empleado</h1>
        <% ModeloEmpleado modEmp =(ModeloEmpleado)session.getAttribute("sesEmp"); %>
        <form action="ControlEmpleado" method="Post">
            <input type="text" name="codigo" size="20" value='<%= modEmp.getCodigo() %>' placeholder="Ingrese Código"/>
            <input type="text" name="nombre" size="20" value='<%= modEmp.getNombre() %>' placeholder="Ingrese Nombre"/>
            <input type="text" name="usuario" size="20" value='<%= modEmp.getUsuario() %>' placeholder="Ingrese Usuario"/>
            <input type="text" name="password" size="20" value='<%= modEmp.getPassword() %>' placeholder="Ingrese Contraseña"/>
            
            <section>
                <input type="submit" name="acc" value="Nuevo"/>
                <input type="submit" name="acc" value="Grabar"/>
                <input type="submit" name="acc" value="Buscar"/>
                <input type="submit" name="acc" value="Actualizar"/>
            </section>
            <span><%= modEmp.getMsg() %></span>
        </form>
        
    </body>
</html>
