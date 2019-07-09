package b.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import b.persistence.DAOCliente;

@WebServlet("/EfetuarLogin")
public class EfetuarLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("login.jsp")
			.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DAOCliente dao = new DAOCliente();
		String nome = request.getParameter("nome");
		String senha = request.getParameter("senha");
		
		Boolean logado = dao.login(nome,senha);
		
		if(logado==true) {
			HttpSession session=request.getSession();  
	        session.setAttribute("nome",nome);
	        request.getRequestDispatcher("listar-cliente.jsp")
	        	.forward(request, response);
		}else {
			request.setAttribute("servMensagem", "Usu�rio Inv�lido");
			doGet(request, response);
		}
	}

}
