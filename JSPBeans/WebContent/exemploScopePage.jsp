<jsp:useBean id="pageBean" class="br.marcel.melo.PageBean" scope="page"/>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Page Scope</title>
</head>
<body>
	<h1>Teste de escopo JSP [PAGE]</h1>
	<h1> Valor Inicial:
		<jsp:getProperty property="valor" name="pageBean"/>
	</h1>
	<jsp:setProperty property="valor" name="pageBean" value="Valor Alterado"/>
	<h1> Valor Alterado:
		<jsp:getProperty property="valor" name="pageBean"/>
	</h1>
	<form method="post">
		<input type="submit" value="teste"/>
	</form>
<%
	if(request.getMethod().equalsIgnoreCase("Post")){
		request.getRequestDispatcher("resultScopePage.jsp")
		.forward(request, response);
	}
%>
</body>
</html>