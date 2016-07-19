
<jsp:include page="headerInclude.jsp">
	<jsp:param value="Marcel Melo" name="nomeUsuario"/>
</jsp:include>

<h1>Corpo da página</h1>

<jsp:include page="footer.html" />


<%
	out.println("<!-- Comentário exibido no HTML -->");
%>

<%-- Comentário JSP que não é exibido no HTML --%>