package br.Marcel.Melo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ExemploForward")
public class ExemploForward extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title> ExemploForward Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1> ExemploForward Servlet</h1>");
		response.flushBuffer();
		RequestDispatcher rd = request.getRequestDispatcher("SegundoServlet");
		rd.forward(request, response);
		out.println("</body>");
		out.println("</html>");
	}
}
