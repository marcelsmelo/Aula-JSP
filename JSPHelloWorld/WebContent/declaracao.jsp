<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%!
		private String getHelloWorld(){
			return "Hello World";
		}
	
		private String jsp = "JSP!!!";
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Declaration</title>
</head>
<body>
<h1>
	<%= getHelloWorld() %> 
	<%= jsp %>
</h1>
</body>
</html>