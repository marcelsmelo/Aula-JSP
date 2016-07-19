package br.marcel.melo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginOKCampoOculto")
public class LoginOKCampoOculto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("user");
		String senha = request.getParameter("pass");
		
		if(nome == null || senha == null){
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<head>");
			out.println("<title> Login Required</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1> Faça o Login primeiro, mermão</h1>");
			out.println("<a href=CampoOcultoLogin><h2>Login Aqui</h2></a>" );
			out.println("</body>");
			out.println("</html>");
			
		}else{
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<head>");
			out.println("<title> Login OK - Campo Oculto</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1> Login Deu tudo bão</h1>");
			out.println("<h2> User - "+nome+"</h1>");
			out.println("<h2> PASS - "+senha+"</h1> <br><br>");
			
			out.println("<form method='post' action='Servlet3'>");
			out.println("<input type='hidden' name='nome' value="+nome+">");
			out.println("<input type='hidden' name='senha' value="+senha+">");
			out.println("<input type='submit' value='Servlet 3 OK'/>");
			out.println("</form>");
			
			out.println("<form method='post' action='Servlet3'>");
			out.println("<input type='submit' value='Servlet 3 NOK'/>");
			out.println("</form>");
			
			out.println("</body>");
			out.println("</html>");
		}
	}
}
