<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<s:property value="message"/>

	<s:form action="login">
		<s:textfield name="user" placeholder="Usuario"></s:textfield>
		<s:password name="pass" placeholder="Contraseña"></s:password>
		<s:submit value="Enviar"></s:submit>
	</s:form>

	<s:form action="register">
		<s:textfield name="nombre" placeholder="Nombre"></s:textfield>
		<s:textfield name="apellido1" placeholder="Apellido1"></s:textfield>
		<s:textfield name="apellido2" placeholder="Apellido2"></s:textfield>
		<s:textfield name="direccion" placeholder="Direccion"></s:textfield>
		<s:textfield name="telefono" placeholder="Telefono"></s:textfield>
		<s:textfield name="email" placeholder="Email"></s:textfield>
		<s:textfield name="user" placeholder="Usuario"></s:textfield>
		<s:password name="pass" placeholder="Contraseña"></s:password>
		<s:submit value="Enviar"></s:submit>
	</s:form>
</body>
</html>