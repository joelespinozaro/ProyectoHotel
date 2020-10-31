<%-- 
    Document   : Acceso
    Created on : 25/09/2020, 11:10:16 AM
    Author     : joelespinozaro
--%>

<%@page import="presentacion.ModeloEmpleado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Proyecto Hotel</title>
        <style>
            h1{
                text-align:center;
            }
            form {
                display: flex;
                flex-direction:column;
                align-items: center;
                justify-content: center;
                height:90vh;
            }
            input{
                margin: 10px 0;
                padding: 10px 14px;
                border-radius: 10px;
                border:none;
                box-shadow: 0 0 1px 1px rgba(0,0,0,0.2);
            }
            .btn {
                padding: 10px 14px;
                border-radius: 10px;
                border: none;
                box-shadow: 0 0 1px 1px rgba(0,0,0,0.2);
                background-color:#0016FF;
                color:#fff;
                font-size:14px;
            }
        </style>
    </head>
    <body>
        <% ModeloEmpleado modEmp =(ModeloEmpleado)session.getAttribute("sesEmp"); %>
        <form action="ControlAcceso" method="POST">
            <h1>Acceso al sistema</h1>
            <input type="text" name="usuario" size="10" placeholder="Usuario"/>
            <input type="password" name="password" size="10" placeholder="Contraseña"/>
            <input type="submit" value="Iniciar Sesion" name="acc" class="btn"/>
            <span><%= modEmp.getMsg() %></span>
        </form>
    </body>
    <style></style>
</html>
