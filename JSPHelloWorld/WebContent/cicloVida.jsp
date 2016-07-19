<%! 
	public void jspInit(){
		System.out.println("[JSP] Inicianlizando JSP...");
	}

	public void jspDestroy(){
		System.out.println("[JSP] Destruindo JSP...");
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% out.println("[JSP] Atendendo requisição..."); %>
	<h1> H1 Aletorio</h1>
	<%	System.out.println("[JSP] Atendendo requisição...");%>
	<h2> H2 Aletorio</h2>
	<% out.println("JSP aleatorio"); %>
</body>
</html>