package b.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import b.model.Cliente;
import b.persistence.DAOCliente;

@WebServlet("/VisualizarCliente")
public class VisualizarCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//	User.verifica(request , response);
		Cliente c = new Cliente();
		
		//c.setId(Integer.parseInt(request.getParameter("id")));
		c.setLogin(request.getParameter("login"));
		c.setSenha(request.getParameter("senha"));

		
		DAOCliente dao = new DAOCliente();
		dao.atualizar(c);
		
		request.setAttribute("servMensagem", "Atualizado!");
		request.getRequestDispatcher("listar-cliente.jsp")
			.forward(request, response);
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//	User.verifica(request , response);
		Integer id = Integer.parseInt(
				request.getParameter("id"));
		
		DAOCliente dao = new DAOCliente();
		request.setAttribute("c", dao.visualiza(id));
		request.getRequestDispatcher("visualizar-cliente.jsp")
			.forward(request, response);
		
	}

}