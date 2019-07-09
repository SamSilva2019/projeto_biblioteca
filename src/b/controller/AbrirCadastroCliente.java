package b.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import b.util.User;

/**
 * Servlet implementation class AbrirCadastroCliente
 */
@WebServlet("/AbrirCadastroCliente")
public class AbrirCadastroCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	       

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//	User.verifica(request , response);
			
			
			request.getRequestDispatcher("form-cliente.jsp").forward(request, response);
			
		}



	
}


