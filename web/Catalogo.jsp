<%@page import="presentacion.ModeloReserva"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://fonts.googleapis.com/css2?family=Merriweather+Sans&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="./Styleglobal.css">
        <link rel="stylesheet" href="./StyleReserva.css">
    </head>
    <body>
        <% ModeloReserva modRes=(ModeloReserva)session.getAttribute("sesRes"); %>
        <header>
            <section>
                <h1>Proyecto Hotel</h1>
            </section>
        </header>
        <main>
            <div>
                <form action="ControlReserva" method="Post">
                    <input type="submit" name="acc" value="Regresar a Reserva" class="back"/>
                </form>
            </div>
            <h1>Lista de Habitaciones</h1>
        
            <% for(int i=1; i<modRes.getListHab().size();i++){ %>
            <% Object[] f =(Object[])modRes.getListHab().get(i); %>
            <section>
                <form action="ControlReserva" method="Post">
                    <input type="text" name="codigo" value='<%= f[0] %>' placeholder="Ingrese Codigo"/>
                    <input type="text" name="nombre" value='<%= f[1] %>' placeholder="Ingrese nombre"/>
                    <input type="text" name="tipo" value='<%= f[2] %>' placeholder="Ingrese tipo"/>
                    <input type="text" name="precio" value='<%= f[3] %>' placeholder="Ingrese precio"/>
                    <input type="text" name="fechaInicial" value="" placeholder="Ingrese fecha Inicial"/>
                    <input type="text" name="fechaFinal" value="" placeholder="Ingrese fecha Final"/>
                    <input type="submit" name="acc" value="Agregar" class="btn"/>
                </form>
            </section>
            <% } %>
        
        </main>
    </body>
</html>
