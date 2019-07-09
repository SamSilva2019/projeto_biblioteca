package Biblioteca.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="tbl_funcionario")
public class Funcionario implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idFuncionario;
	private String nomeFuncionario;
	private String idadeFuncionario;
	
	
	
	//ManyToMany acontece em  apenas um dos lado e tem o lado "dominante", ou seja, apenas um dos lados
		//pode afetar diretamente a tabela criada pelo @JoinTable
		
		//Quando definimos o joinColumns estamos dizendo quem � o lado dominante e quando definimos o 
		//inverseJoinColumns estamos definindo o lado dominado
		
	
	
	@ManyToMany
	@JoinTable(name="FunciEnd", joinColumns=
	{@JoinColumn(name="IdFuncionario")}, inverseJoinColumns=
	{@JoinColumn(name="IdEndereco")})
	private List<Endereco> Endereco;
	
	public Funcionario() {
		
	}

	public Integer getIdFuncionario() {
		return idFuncionario;
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

	public List<Endereco> getEndereco() {
		return Endereco;
	}

	public void setEndereco(List<Endereco> endereco) {
		Endereco = endereco;
	}

	
	
	
	
}
