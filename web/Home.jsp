<%@page import="presentacion.ModeloEmpleado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Proyecto Hotel / Home</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
         <link href="https://fonts.googleapis.com/css2?family=Merriweather+Sans&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="./Styleglobal.css">
        <link rel="stylesheet" href="./StyleHome.css">
    </head>
    <body>
        <% ModeloEmpleado modEmp =(ModeloEmpleado)session.getAttribute("sesEmp"); %>
        <header>
            <section>
                <h1>Proyecto Hotel</h1>
            </section>
            <div>
                Bienvenida(o) 
                <span><%= modEmp.getCodigo() %></span>
                <span> · </span>
                <span><%= modEmp.getNombre()%></span>
            </div>
        </header>
        <main>
            <h1>Menu de Administracion</h1>
            <form action="ControlEmpleado" method="Post">
                <input type="submit" name="acc" value="Gestion de Empleado" class="menu-item"/>
            </form>
            <form action="ControlCliente" method="Post">
                <input type="submit" name="acc" value="Gestion de Cliente" class="menu-item"/>
            </form>
            <form action="ControlHabitacion" method="Post">
                <input type="submit" name="acc" value="Gestion de Habitacion" class="menu-item"/>
            </form>
            <form action="ControlReserva" method="Post">
                <input type="submit" name="acc" value="Gestion de Reserva" class="menu-item"/>
            </form>
        </main>
    </body>
</html>
