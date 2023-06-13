<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.Calendar" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="header.jsp"%>
<!-- TITLE-->
<title>Formulario Registro Producto</title>
<!-- FAVICON-->
<%@include file="header2.jsp"%>
    <form action="registerProduct" method="post">
        <img class="mb-4" src="./img/logo.png" alt="MY APP" width=100>
        <h4 class="text-secondary">My -APP-Product</h4>
        <h1 class="h5 mb-3 fw-normal">Ingresar</h1>
        <div class="form-floating">
            <input type="text" name="product_name" class="form-control" id="floatingName" placeholder="Ingrese el Nombre del Producto" required
                   pattern="[A-Za-z ]{2,40}">
            <label for="floatingName">Nombre:</label>
            <div class="form-floating">
                <input type="number"  name="product_value" class="form-control" id="floatingValue" placeholder="Ingrese el Valor del Producto" required
                       pattern="{2,40}">
                <label for="floatingValue">Valor:</label>
            </div>
            <div class="form-floating">
                <input type="number" name="category_id" class="form-control" id="floatingId"
                       placeholder="Ingrese el Numero de la Categoria"  required
                       pattern="{60}">
                <label for="floatingId">Numero Categoria: </label>
            </div>
            <button class="w-100 btn btn-lg btn-primary" type="submit">Enviar</button>
            <%@include file="footer.jsp"%>