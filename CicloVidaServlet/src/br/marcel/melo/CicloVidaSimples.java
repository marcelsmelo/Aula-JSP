package br.marcel.melo;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CicloVidaSimples")
public class CicloVidaSimples extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int contador;
	
	public void init(ServletConfig config) throws ServletException {
		contador = 0;
		System.out.println("Inicializando... CONTADOR:"+contador);
	}
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		contador++;
		System.out.println("Atendendo Requisições.... CONTADOR: "+contador);
	}

	public void destroy() {
		System.out.println("Finalizando...");
	}
	
}
