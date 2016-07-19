package br.marcel.melo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet4")
public class Servlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String senha = request.getParameter("senha");
		
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
			out.println("<title> Servlet 4 </title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1> Servlet 4</h1>");
			out.println("<h2> User - "+nome+"</h1>");
			out.println("<h2> PASS - "+senha+"</h1>");
			out.println("</body>");
			out.println("</html>");
		}
	}

}
