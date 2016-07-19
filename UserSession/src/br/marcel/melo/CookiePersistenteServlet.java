package br.marcel.melo;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.util.calendar.BaseCalendar.Date;

@WebServlet("/CookiePersistenteServlet")
public class CookiePersistenteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Exemplo Cookie</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<form method='post' action='ExemploCookieRedirectPage'>");
		out.println("<input type='submit' value='Ver Cookies Salvos'/>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie user = new Cookie("user", "Marcel");	
		user.setHttpOnly(true);
		user.setMaxAge(999999999);
		
		Cookie pass = new Cookie("pass", "123456");
		
		response.addCookie(user);
		response.addCookie(pass);
		
		response.setContentType("text/html");
		
		//Enviando um comando sendRedirect
		//response.sendRedirect("SegundoCookieServlet");
		
		//Adicionando a tag META no arquivo HTML de resposta
		PrintWriter out = response.getWriter();
		out.println("<META HTTP-EQUIV=Refresh CONTENT=0;URL=SegundoCookieServlet>");
	}
	
}
