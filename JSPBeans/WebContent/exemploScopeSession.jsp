<jsp:useBean id="contBean" class="br.marcel.melo.ContadorBean" scope="session"/>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Teste de escopo JSP [SESSION]</h1>
	
	<h1>  Valor Contador: 
		<jsp:getProperty property="contador" name="contBean"/>
	</h1>
	
	<form method="post">
		<input type="submit" value="teste"/>
	</form>
	
<%
	if(request.getMethod().equalsIgnoreCase("Post")){
		contBean.incrementaContador();
	}

%>
</body>
</html>