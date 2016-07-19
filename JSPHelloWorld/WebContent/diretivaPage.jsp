<%@ page language="java" %>

<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page buffer="16384" %>
<%@ page buffer="none" %> 

<%@ page session="true" %>
<%@ page session="false" %>

<%@ page info="Uma página de exemplo diretivas page" %>

<%@ page autoFlush="true" %>
<%@ page autoFlush="false" %>

<%@ page isThreadSafe="true" %>
<%@ page isThreadSafe="false" %>

<%@ page erroPage="ErrorPage.jsp" %>

<%@ page isErroPage="true" %>
<%@ page isErroPage="false" %>


 <%@page import="java.util.Calendar"%>
 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Diretivas Page</title>
</head>
<body>
	<% out.flush(); %>
</body>
</html>