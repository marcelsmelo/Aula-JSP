<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login com Bean</title>
</head>
<body>
	<h1>Login With Bean!</h1>
	
	<%
		Boolean error = (Boolean) request.getAttribute("Error");
		if(error != null && error == true){
			out.println("<h2 style='color: red;'>Erro ao logar no sistema!!! Tente novamente</h2>");
		}
	%>
	
	<form method="post" action="ControllerLogin">
		<label>Username:</label>
		<input type="text" name="username" />
		<br />
		<label>Password:</label>
		<input type="password" name="password" />
		<br />
		<input type="submit" value="Enviar"/>
	</form>
</body>
</html>