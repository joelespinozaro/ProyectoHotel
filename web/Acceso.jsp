<%@page import="presentacion.ModeloEmpleado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Proyecto Hotel</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://fonts.googleapis.com/css2?family=Merriweather+Sans&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="./StyleAcceso.css">
    </head>
    <body>
        <% ModeloEmpleado modEmp =(ModeloEmpleado)session.getAttribute("sesEmp"); %>
        <div class="form-container">    
            <form class="form-login form-login-lx" action="ControlAcceso" method="POST">
                <h1>Iniciar Sesion a Hotel</h1>
                <input class="form__input" type="text" name="usuario" placeholder="Usuario"/>
                <input class="form__input" type="password" name="password" placeholder="Password"/>
                <input type="submit" value="Iniciar Sesion" name="acc" class="btn"/>
                <div class="msg-login">
                    
                    <span><%= modEmp.getMsg() %></span>
                    
                </div>
            </form>
        </div>
    </body>
    <style></style>
</html>
