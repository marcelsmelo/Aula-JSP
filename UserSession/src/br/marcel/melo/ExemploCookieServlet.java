package br.marcel.melo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExemploC
 */
@WebServlet("/ExemploCookieServlet")
public class ExemploCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Cookie user = new Cookie("user", "Marcel");
		Cookie pass = new Cookie("pass", "123456");
		
		response.addCookie(user);
		response.addCookie(pass);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Exemplo Cookie</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<form method='post' action='ExemploCookieServlet'>");
		out.println("<input type='submit' value='Ver Cookies Salvos'/>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Exemplo Cookie</title>");
		out.println("</head>");
		out.println("<body>");
		
		Cookie[] cookies = request.getCookies();
		if(cookies != null){
			for(int i = 0; i< cookies.length; i++){
				Cookie cookie = cookies[i];
				out.println("<h1>Cookie Name:"+cookie.getName()+"</h1>");
				out.println("<h1>Cookie Value:"+cookie.getValue()+"</h1><br>");
			}
		}else{
			out.println("<h1>Sem Cookies</h1>");
		}
		
		out.println("</body>");
		out.println("</html>");
	}
}
