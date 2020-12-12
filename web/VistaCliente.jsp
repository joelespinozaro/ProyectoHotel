<%@page import="presentacion.ModeloCliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Hotel / Cliente</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://fonts.googleapis.com/css2?family=Merriweather+Sans&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="./Styleglobal.css">
        <link rel="stylesheet" href="./StyleEmpleado.css">
    </head>
    <body>
        
        <% ModeloCliente modCli =(ModeloCliente)session.getAttribute("sesCli"); %>
        <header>
            <section>
                <h1>Proyecto Hotel</h1>
            </section>
        </header>
        <main>
            <div>
                <form action="ControlEmpleado" method="Post">
                    <input type="submit" name="acc" value="Regresar" class="back"/>
                </form>
            </div>
            <h1>Gestion de Cliente</h1>
        <form action="ControlCliente" method="Post">
            <input type="text" name="dni" value='<%= modCli.getDni() %>' placeholder="Ingrese DNI"/>
            <input type="text" name="nombres" value='<%= modCli.getNombres() %>' placeholder="Ingrese Nombres"/>
            <input type="text" name="apellidos" value='<%= modCli.getApellidos() %>' placeholder="Ingrese Apellidos"/>
            <input type="text" name="celular" value='<%= modCli.getCelular() %>' placeholder="Ingrese Celular"/>
            <input type="text" name="email" value='<%= modCli.getEmail() %>' placeholder="Ingrese Email"/>
            
            <section>
                <input type="submit" name="acc" value="Nuevo" class="btn"/>
                <input type="submit" name="acc" value="Grabar" class="btn"/>
                <input type="submit" name="acc" value="Buscar" class="btn"/>
                <input type="submit" name="acc" value="Actualizar" class="btn"/>
            </section>
            <span><%= modCli.getMsg() %></span>
        </form>
         </main>
    </body>
</html>
