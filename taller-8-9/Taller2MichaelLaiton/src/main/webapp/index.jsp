<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.Calendar" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="uft-8">
    <meta name="author" content="Nombre Autor">

    <meta name="description" content="Esta debe ser la informacion que aparece en el párrafo que acompaña los resultados de una busqueda de Internet ">

    <meta name="keywords" content="registro de usuario, fomulario de registro, crear cuenta, registro en linea ">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Registro de Usuario .:. MY APP</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/booststrap.min.css"
          rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAq046Mgn0M80zW1RWuH61DGLwZJEdKadq2F9CUG65"
          crossorigin="anonymous">
    <link rel="stylesheet"
    href="https://cdn/jsdelivr.net/npm/booststrap-icons@1.10.3/font/booststrap-icons.css">
    <link rel="stylesheet" href="./css/signin.css">

</head>
<body class="text-center">
<main class="form-signin w-100 m-auto">
 <form action="" method="post">
     <img class="mb-4" src="./img/logo.png" alt="MY APP" width="100">
     <H4 class="text-secondary">My -APP</H4>
     <h1 class="h5 mb-3 fw-normal">Ingreso</h1>
     <div class="form-floating">
     <input type="text" class="form-control" id="floatingInput"
     placeholder="ingrese su nombre de usuario" required autofocus
     pattern="[A-Za-z0-9]{8, 12}">
     <label for="floatingInput"></label></div>
     <div class="form-floating">
         <input type="password" class="from-control" id="floatinpassword"
         placeholder="ingrese contraseña" required pattern="[A-Za-z0-9]{8, 12}">
         <label for="floatinpassword">Contraseña</label>
     </div>
     <button class="w-100 btn btn-lg btn-primary" type="subtime">Ingresar</button>
     <div id="register">
         <a href="#">Registrarse</a>
     </div>
     <p class="mt-3 mb-3 text-muted">Todos los Drechos Reservados MY APP
      <%=displayDate()%>
     </p>
 </form>
</main>
</main>
<script src="https://cdn.jsdelivr.net/npm/boostrap@5.2.3/dist/js/bootstrap.bundle.min.js"
           integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJL+0I4"
            crossorigin="anonymous"></script>
            <%! public String displayDate(){
                SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY");
                Date date = Calendar.getInstance().getTime();
                return  dateFormat.format(date);
            }%>
</body>
</html>