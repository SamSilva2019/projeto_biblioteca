package Biblioteca.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;




@Entity
@Table(name="tb_Cliente")
public class Cliente implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IdCliente;
	private String  nomeCliente;
	private String  idadeCliente;
	private String CpfCliente;
	private String TelefoneCliente;
	private String EmailCliente;
	
	@OneToOne(mappedBy="IdEmprestimo")
	private List<Emprestimo> emprestimoItems = new ArrayList<Emprestimo>();
	
	
	//ManyToMany acontece em  apenas um dos lado e tem o lado "dominante", ou seja, apenas um dos lados
	//pode afetar diretamente a tabela criada pelo @JoinTable
	
	//Quando definimos o joinColumns estamos dizendo quem é o lado dominante e quando definimos o 
	//inverseJoinColumns estamos definindo o lado dominado
	
	
	
	@ManyToMany
	@JoinTable(name="ClienEndereco"
	,joinColumns={@JoinColumn(name="idCliente")}//LADO DOMINANTE!
	
	,inverseJoinColumns={@JoinColumn(name="IdEndereco")})//LADO DOMINADO!
	private List<Endereco> endereco = new ArrayList<Endereco>();
	
	
		
	
	public Cliente() {
		
	}


	public Integer getIdCliente() {
		return IdCliente;
	}


	public void setIdCliente(Integer idCliente) {
		IdCliente = idCliente;
	}


	public String getNomeCliente() {
		return nomeCliente;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	public String getIdadeCliente() {
		return idadeCliente;
	}


	public void setIdadeCliente(String idadeCliente) {
		this.idadeCliente = idadeCliente;
	}


	public String getCpfCliente() {
		return CpfCliente;
	}


	public void setCpfCliente(String cpfCliente) {
		CpfCliente = cpfCliente;
	}


	public String getTelefoneCliente() {
		return TelefoneCliente;
	}


	public void setTelefoneCliente(String telefoneCliente) {
		TelefoneCliente = telefoneCliente;
	}


	public String getEmailCliente() {
		return EmailCliente;
	}


	public void setEmailCliente(String emailCliente) {
		EmailCliente = emailCliente;
	}


	public List<Emprestimo> getEmprestimoItems() {
		return emprestimoItems;
	}


	public void setEmprestimoItems(List<Emprestimo> emprestimoItems) {
		this.emprestimoItems = emprestimoItems;
	}


	public List<Endereco> getEndereco() {
		return endereco;
	}


	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}

	
}
