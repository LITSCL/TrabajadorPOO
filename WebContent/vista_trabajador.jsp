<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> <!-- Esta instrucción permite crear etiquetas HTML. -->

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mostrar Trabajadores</title>
</head>
<body bgcolor="#FFA07A"> <!-- Aca se esta cambiando el color del body con el atributo bgcolor. -->
	<center>
		<font color="blue"><h1>Muestreo de trabajadores</h1></font>
	</center>

	<center>
		<nav>
			<p>
				<a href="index.html">Inicio</a> 
				<a href="formulario_trabajador.html">Agregar</a>
			</p>
		</nav>
	</center>

	<p>El trabajador fue ingresado satisfactoriamente</p>

	<table border="1">
		<tr>
			<th>Nombre</th>
			<th>Apellido</th>
			<th>Edad</th>
			<th>Pais</th>
			<th>Tecnologia</th>
			<th>Comentario</th>
			<th>Experiencia</th>
		</tr>
		<c:forEach var="fila" items="${listaTrabajadores}">
			<tr>
				<td>${fila.nombre}</td>
				<td>${fila.apellido}</td>
				<td>${fila.edad}</td>
				<td>${fila.pais}</td>
				<td>${fila.tecnologia}</td>
				<td>${fila.comentario}</td>
				<td>${fila.experiencia}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>