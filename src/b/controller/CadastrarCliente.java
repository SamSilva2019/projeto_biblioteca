package b.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import b.model.Cliente;
import b.model.Endereco;
import b.persistence.DAOCliente;
import b.persistence.DAOEndereco;

@WebServlet("/CadastrarCliente")
public class CadastrarCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//	User.verifica(request , response);
		
		
		try{

			Cliente c= new Cliente();
			Endereco e = new Endereco();
			c.setNomeCliente(request.getParameter("nome"));
			c.setIdadeCliente(request.getParameter("idade"));
			c.setCpfCliente(request.getParameter("cpf"));
			c.setTelefoneCliente(request.getParameter("telefone"));
			c.setEmailCliente(request.getParameter("email"));
			c.setLoginCliente(request.getParameter("login"));
			c.setSenhaCliente(request.getParameter("senha"));
			c.setNascimentoCliente(request.getParameter("nascimento"));
			c.setDddCliente(request.getParameter("ddd"));
			e.setTipoLEndereco(request.getParameter("tipol"));
			e.setNomeEndereco(request.getParameter("logradouro"));
			e.setBairroEndereco(request.getParameter("bairro"));
			e.setCepEndereco(request.getParameter("cep"));
			e.setNumerEndereco(request.getParameter("numero"));
			e.setEstadoEndereco(request.getParameter("estado"));

			e.setCliente(c);
			e.setEditora(null);
			e.setFuncionario(null);
			
			
		
			DAOCliente dao = new DAOCliente();
			DAOEndereco dao2 = new DAOEndereco();
				dao.cadastrar(c);
				dao2.cadastrar(e);

			request.setAttribute("servMensagem", "Cadastrado!");
			
		}catch(Exception e) {
			 e.printStackTrace();
			request.setAttribute("servMensagem", "Erro!");
		}
		request.getRequestDispatcher("form-cliente.jsp").forward(request, response);
	}
	}


