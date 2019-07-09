package b.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import b.model.Cliente;
import b.persistence.DAOCliente;
import b.util.User;

@WebServlet("/ExcluirCliente")
public class ExcluirCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//User.verifica(request , response);
		
		
		Cliente c = new Cliente();
	c.setId(Integer.parseInt(request.getParameter("id")));
	DAOCliente dao = new DAOCliente();
	dao.remove(c);
	
	request.setAttribute("servMenssagem", "Cliente Excluído");
	
	request.getRequestDispatcher("lista-cliente.jsp").forward(request, response);
	
	
	}


	
	
	
	
	
	/*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
*/
}
