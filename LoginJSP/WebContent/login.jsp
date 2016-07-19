<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%! private String erro = new String("");  %>
    
<%!
	public Boolean login(String name, String pass){
		if(name.equals("marcel") && pass.equals("marcel")){
			erro = "";
			return true;
		}
		else{
			erro = "Usuário e/ou senha incorretos. Tente novamente!";
			return false;
		}
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login JSP</title>
</head>
<body>
	<%
		if(request.getMethod().equalsIgnoreCase("post")){
			String usuario = request.getParameter("usuario");
			String senha = request.getParameter("senha");
			if(login(usuario, senha)){
				response.sendRedirect("dashboard.jsp");
			}
		}
	%>


	<h1>Login JSP</h1>

	<h2 style="color: red;">
		<%= erro %>
	</h2>
	
	<form method="post" action="login.jsp">
		Username: <input type="text" name="usuario" />
		<br />
		Password: <input type="password" name="senha" />
		<br />
		<input type="submit" value="Logar"/>
	</form>
	











</body>
</html>