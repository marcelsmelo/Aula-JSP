<!DOCTYPE html>
<%@ page import="java.util.Calendar"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Server time</title>
</head>
<body>
<h1>Bem vindo ao servidor, horário: <br/>
	<%
		Calendar now = Calendar.getInstance();
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		
		if(hour < 10) out.println("0" + hour);
		else out.println(hour);
		
		out.println(":");
		
		if(minute < 10) out.println("0" + minute);
		else out.println(minute);
	%>
</h1>
</body>
</html>