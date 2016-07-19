package br.marcel.melo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SegundoCookieServlet")
public class SegundoCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Exemplo Cookie</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Segundo Cookie Servlet</h1>");
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
