<%-- 
    Document   : SearchEquipos
    Created on : 30/09/2023, 07:14:50 PM
    Author     : dchri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="ServletSearchEquipo" method="POST">
            <input type="text" id="nombre" name="nombre">
            <button type="submit">Enviar</button>
        </form>
        ${respuesta}
    </body>
</html>
