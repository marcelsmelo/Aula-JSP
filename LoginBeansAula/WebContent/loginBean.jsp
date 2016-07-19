<jsp:useBean id="loginBean" class="br.marcel.melo.bean.LoginBean" />

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<jsp:setProperty name="loginBean" property="*"/>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login with JSP and Beans</title>
</head>
<body>
	<h1>Login maroto com Feijão</h1>
	
	<%
		if(request.getMethod().equalsIgnoreCase("POST")){
			if(loginBean.login()){
				response.sendRedirect("dashboard.jsp");
			}
		}
	%>
	
	<h2 style="color: red;">
		<jsp:getProperty property="erro" name="loginBean" />
	</h2>
	<form method="POST" action="loginBean.jsp">
		<label>Nome:</label>
		<input type="text" name="usuario"/>
		<br />
		<label>Senha:</label>
		<input type="password" name="senha"/>
		<br />
		<input type="submit" value="MandaVê" />
	</form>
</body>
</html>