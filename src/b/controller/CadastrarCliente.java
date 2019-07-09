package b.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import b.model.Cliente;
import b.persistence.DAOCliente;

@WebServlet("/CadastrarCliente")
public class CadastrarCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//	User.verifica(request , response);
		
		
		try{

			Cliente c= new Cliente();
			c.setNomeCliente(request.getParameter("nome"));
			c.setIdadeCliente(request.getParameter("idade"));
			c.setCpfCliente(request.getParameter("cpf"));
			c.setTelefoneCliente(request.getParameter("telefone"));
			c.setEmailCliente(request.getParameter("email"));
			c.setLoginCliente(request.getParameter("login"));
			c.setSenhaCliente(request.getParameter("senha"));
			c.setNascimentoCliente(request.getParameter("nascimento"));
			c.setNascimentoCliente(request.getParameter("ddd"));
			
			
			
			
			//DAO -> cadastra o objeto funcionario(func) no banco
			DAOCliente dao = new DAOCliente();
			dao.cadastrar(c);
			//caso tenha cadastrado, envia uma mensagem de confirmação
			// {$servMensagem} deve ser utilizado na página jsp
			request.setAttribute("servMensagem", "Cadastrado!");
			//
		}catch(Exception e) {
			 e.printStackTrace();
			request.setAttribute("servMensagem", "Erro!");
		}
		request.getRequestDispatcher("form-cliente.jsp").forward(request, response);
	}
	}


