package br.Marcel.Melo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ExemploRedirect")
public class ExemploRedirect extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title> ExemploRedirect Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1> ExemploRedirect Servlet</h1>");
		out.println("<form method='post' action='ExemploRedirect'>");
		out.println("<input type='submit' value='Enviar'/>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {				
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/Redirecionamento/SegundoServlet");
		rd.forward(request, response);

		
	}

}
