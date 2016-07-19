package br.marcel.melo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/ServletHTML")
public class FiltroHTML implements Filter {
	
	public void destroy() {
		System.out.println("[INFO] Destruindo Filtro Anotations...");
	}
	

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("[INFO] Inicializando Filtro Anotations...");
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("[INFO] Filtro Funcionando HTML...");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title> ExemploSendRedirect Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1><center>HEADER Alterado</center></h1>");
		out.println("<br><br>");
		out.println("<hr>");
		out.println("<br><br>");
		
		chain.doFilter(request, response);
		
		out.println("<br><br>");
		out.println("<hr>");
		out.println("<br><br>");
		out.println("<h1><center>FOOTER</center></h1>");
		out.println("</body>");
		out.println("</html>");
	}



}
