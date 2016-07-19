package br.marcel.melo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CampoOcultoLogin
 */
@WebServlet("/CampoOcultoLogin")
public class CampoOcultoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		sendLoginForm(response, false);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = 	request.getParameter("user");
		String senha = request.getParameter("pass");
		
		if(login(nome,senha)){
			RequestDispatcher rd = request.getRequestDispatcher("LoginOKCampoOculto");
			rd.forward(request, response);
		}else{
			sendLoginForm(response, true);
		}
	}
	
	private boolean login(String user, String pass){
		if(user.equals("marcel") && pass.equals("123456")) return true;
		return false;
	}
	
	private void sendLoginForm(HttpServletResponse response, boolean withErrorMessage) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Login Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1> Login Form</h1>");
		
		if(withErrorMessage)
			out.println("<h2 style='color: red'>Login Failed. Please try again. <br></h2>");
		
		out.println("<form method='post' action='CampoOcultoLogin'>");
		out.println("Nome Usuário:");
		out.println("<input type='text' name='user'/> <br>");
		out.println("Senha: ");
		out.println("<input type='password' name='pass' />");
		out.println("<input type='submit' value='Enviar' />");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}



}
