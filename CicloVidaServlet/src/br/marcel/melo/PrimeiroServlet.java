package br.marcel.melo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/PrimeiroServlet")
public class PrimeiroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext contexto = getServletContext();
		contexto.setAttribute("user", "Marcel Melo");
		contexto.setAttribute("email", "marcel.msmelo@gmail.com");
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Primeiro Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1> Primeiro Servlet</h1>");
		out.println("<form method='get' action='SegundoServlet'>");
		out.println("<input type='submit' name='btn1' value='Segundo Servlet'/>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}

}
