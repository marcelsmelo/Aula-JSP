<%! private String error = ""; %>

<%!
	public boolean login(String user, String pass){
		if(user.equals("marcel") && pass.equals("marcel")){
			return true;
		}
		return false;
	}
%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login JSP</title>
</head>
<body>

<%
	if(request.getMethod().equalsIgnoreCase("post")){
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(login(username, password)){
			this.error = "";
			response.sendRedirect("welcome.jsp");
		}else{
			this.error = "Username ou Password errado. Tente novamente!";
		}
	}
%>

	<h1>
	<% out.print("Login with JSP!"); %>
	</h1>
	
	<h1 style="color:red;"><%= error %></h1>
	
	<form method="post" action="login.jsp">
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