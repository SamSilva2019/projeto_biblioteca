package b.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import b.persistence.DAOFuncionario;

@WebServlet("/AbrirListaCliente")
public class AbrirListaFuncionario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		DAOFuncionario dao = new DAOFuncionario();

		request.setAttribute("lista", dao.getLista());
		request.getRequestDispatcher("listar-funcionario.jsp").forward(request, response);
	}
}
