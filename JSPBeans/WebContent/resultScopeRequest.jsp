<jsp:useBean id="pageBean" class="br.marcel.melo.PageBean" scope="request"/>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Result</title>
</head>
<body>
<h1> Valor:
<jsp:getProperty property="valor" name="pageBean"/>
</h1>
</body>
</html>