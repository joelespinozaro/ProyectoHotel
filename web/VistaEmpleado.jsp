<%@page import="presentacion.ModeloEmpleado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Hotel / Empleado</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://fonts.googleapis.com/css2?family=Merriweather+Sans&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="./Styleglobal.css">
        <link rel="stylesheet" href="./StyleEmpleado.css">
    </head>
    <body>
        <% ModeloEmpleado modEmp =(ModeloEmpleado)session.getAttribute("sesEmp"); %>
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
            <h1>Gestion de Empleado</h1>
            <form action="ControlEmpleado" method="Post">
                <input type="text" name="codigo"  value='<%= modEmp.getCodigo() %>' placeholder="Ingrese Codigo"/>
                <input type="text" name="nombre" value='<%= modEmp.getNombre() %>' placeholder="Ingrese Nombre"/>
                <input type="text" name="usuario" value='<%= modEmp.getUsuario() %>' placeholder="Ingrese Usuario"/>
                <input type="text" name="password" value='<%= modEmp.getPassword() %>' placeholder="Ingrese Password"/>
                <section>
                    <input type="submit" name="acc" value="Nuevo" class="btn"/>
                    <input type="submit" name="acc" value="Grabar" class="btn"/>
                    <input type="submit" name="acc" value="Buscar" class="btn"/>
                    <input type="submit" name="acc" value="Actualizar" class="btn"/>
                </section>
                <span><%= modEmp.getMsg() %></span>
            </form>
        </main>
        
    </body>
</html>
