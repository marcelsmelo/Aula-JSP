package br.Marcel.Melo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MultiplosParametros")
public class MultiplosParametros extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Multiplo Valores</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Multiplo Valores</h1>");
		out.println("<form method='post' action='MultiplosParametros'>");
		out.println("Estilo Musical:<br>");
		out.println("<input type='checkbox' name='estilo' value='sertanejo'/> Sertanejo <br>");
		out.println("<input type='checkbox' name='estilo' value='rock'/> Rock <br>");
		out.println("<input type='checkbox' name='estilo' value='funk'/> Funk <br>");
		out.println("<input type='submit' value='Enviar'/>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] values = request.getParameterValues("estilo");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		if(values != null){
			int lenght = values.length;
			out.println("<h1>Estilos Selecionados: </h1>");
			for(int i=0; i<lenght; i++){
				out.println(values[i]+"<br>");
			}
		}
	}

}
