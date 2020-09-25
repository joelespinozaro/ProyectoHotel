<%-- 
    Document   : Acceso
    Created on : 25/09/2020, 11:10:16 AM
    Author     : joelespinozaro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Proyecto Hotel</title>
    </head>
    <body>
        <h1>Acceso al sistema</h1>
        <form action="Control" method="POST">
            <input type="text" name="username" size="10" placeholder="Usuario"/>
            <input type="password" name="password" size="10" placeholder="Contraseña"/>
            <button>Iniciar Sesión</button>
        </form>
    </body>
    <style></style>
</html>
