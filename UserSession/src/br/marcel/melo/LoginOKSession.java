package br.marcel.melo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginOKSession
 */
@WebServlet("/LoginOKSession")
public class LoginOKSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if(session==null){
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<head>");
			out.println("<title> Login Required</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1> Faça o Login primeiro, mermão</h1>");
			out.println("<a href=LoginSession><h2>Login Aqui</h2></a>" );
			out.println("</body>");
			out.println("</html>");
		}else{
			String result = (String) session.getAttribute("usuarioLogado");
			if(result.equals("OK")){
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				out.println("<html>");
				out.println("<head>");
				out.println("<title> Login OK - Session</title>");
				out.println("</head>");
				out.println("<body>");
				out.println("<h1> Login Deu tudo bão</h1>");
				out.println("<form method='post' action='LoginOKSession'>");
				out.println("<input type='submit' value='Deslogar'/>");
				out.println("</form>");
				out.println("</body>");
				out.println("</html>");
			}else{
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				out.println("<html>");
				out.println("<head>");
				out.println("<title> Login OK - Session</title>");
				out.println("</head>");
				out.println("<body>");
				out.println("<h1> Algo DEU RUIM</h1>");
				out.println("<a href=- OK</a>" );
				out.println("<a href=LoginSession>Logar Novamente</a>");
				out.println("</body>");
				out.println("</html>");
			}
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getSession().invalidate();
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Login OK - Session</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1> Usuário deslogado</h1>");
		out.println("<a href=- OK</a>" );
		out.println("<a href=LoginSession>Logar Novamente</a>");
		out.println("</body>");
		out.println("</html>");
		
	}
}
