
<jsp:include page="headerInclude.jsp">
	<jsp:param value="Marcel Melo" name="nomeUsuario"/>
</jsp:include>

<h1>Corpo da p�gina</h1>

<jsp:include page="footer.html" />


<%
	out.println("<!-- Coment�rio exibido no HTML -->");
%>

<%-- Coment�rio JSP que n�o � exibido no HTML --%>