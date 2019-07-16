package b.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import b.persistence.DAOCliente;

@WebServlet("/AbrirListaCliente")
public class AbrirListaCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

<<<<<<< HEAD
		DAOCliente dao = new DAOCliente();

		request.setAttribute("lista", dao.getLista());
		request.getRequestDispatcher("listar-cliente.jsp").forward(request, response);
=======
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	//	User.verifica(request , response);

		DAOCliente dao = new DAOCliente();
		request.setAttribute("lista", dao.getLista());
		System.out.println(dao.getLista().size());
		request.getRequestDispatcher("listar-cliente.jsp").forward(request, response);
		
>>>>>>> a23c41c2dfee356a79a6f7acf3568f585b6a5604
	}
}
