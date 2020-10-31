<%-- 
    Document   : Home
    Created on : 25/09/2020, 11:45:11 AM
    Author     : joelespinozaro
--%>

<%@page import="presentacion.ModeloEmpleado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home / ProyectoHotel</title>
    </head>
    <body>
        <% ModeloEmpleado modEmp =(ModeloEmpleado)session.getAttribute("sesEmp"); %>
        <h1>Menú Principal </h1>
        
        <p>Bienvenido(a) <%= modEmp.getCodigo() %> · <%= modEmp.getNombre()%></p>
        
        <form action="ControlEmpleado" method="Post">
            <input type="submit" name="acc" value="Nuevo"/>
        </form>
    </body>
</html>
