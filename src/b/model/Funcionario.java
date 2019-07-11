package b.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="tb_Funcionario")
public class Funcionario implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idFuncionario;
	private String nomeFuncionario;
	private String idadeFuncionario;
	private String login;
	private Integer senha;
	private Date Dtadmissao;
	private Double Salario;

	
	 @OneToMany(mappedBy="funcionario")
	 private List<Endereco> endereco = new ArrayList<>();
	
	//ManyToMany acontece em  apenas um dos lado e tem o lado "dominante", ou seja, apenas um dos lados
		//pode afetar diretamente a tabela criada pelo @JoinTable
		
		//Quando definimos o joinColumns estamos dizendo quem é o lado dominante e quando definimos o 
		//inverseJoinColumns estamos definindo o lado dominado
		
	
	
	//@ManyToMany
	//@JoinTable(name="FunciEnd", joinColumns=
//	{@JoinColumn(name="IdFuncionario")}, inverseJoinColumns=
	//{@JoinColumn(name="IdEndereco")})
//	private List<Endereco> Endereco;
	
	public Funcionario() {
		
	}

	public Integer getIdFuncionario() {
		return idFuncionario;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public Integer getSenha() {
		return senha;
	}

	public void setSenha(Integer senha) {
		this.senha = senha;
	}

	public Date getDtadmissao() {
		return Dtadmissao;
	}

	public void setDtadmissao(Date dtadmissao) {
		Dtadmissao = dtadmissao;
	}

	public Double getSalario() {
		return Salario;
	}

	public void setSalario(Double salario) {
		Salario = salario;
	}

	public List<Endereco> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}

	public void setIdFuncionario(Integer idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public String getIdadeFuncionario() {
		return idadeFuncionario;
	}

	public void setIdadeFuncionario(String idadeFuncionario) {
		this.idadeFuncionario = idadeFuncionario;
	}

	//public List<Endereco> getEndereco() {
	//	return Endereco;
//	}

//	public void setEndereco(List<Endereco> endereco) {
//		Endereco = endereco;
//	}

	
	
	
	
}
