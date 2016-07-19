package br.Marcel.Melo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SegundoServletParams")
public class SegundoServletParams extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html");
		
		String nome = request.getParameter("nome");
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Segundo Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1> Segundo Servlet</h1>");
		out.println("<h1> Param nome -"+nome+"</h1>");
		out.println("</body>");
		out.println("</html>");
	}

}
