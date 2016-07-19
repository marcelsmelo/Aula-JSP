<jsp:useBean id="pageBean" class="br.marcel.melo.JavaBean" scope="request"/>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Scope Page</title>
</head>
<body>

<h1>Valor Inicial: <%= pageBean.getValor() %></h1>

<% pageBean.setValor("Valor Alterado"); %>

<h1>Valor Alterado: <%= pageBean.getValor() %></h1>

<form method="post" action="scopePage.jsp">
	<input type="submit" value="Enviar"/>
</form>

<%
	if(request.getMethod().equalsIgnoreCase("post")){
		request.getRequestDispatcher("result.jsp")
		.forward(request, response);
	}
%>

</body>
</html>