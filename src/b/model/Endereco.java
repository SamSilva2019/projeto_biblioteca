package b.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tb_endereco")


public class Endereco implements Serializable  {

	private static final long serialVersionUID = 1L;
	
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer IdEndereco;
	private String NomeEndereco;
	private String BairroEndereco;
	private String CepEndereco;
	private String NumerEndereco;
	
	

	//@ManyToMany(mappedBy="endereco")//mappedBy(lado dominado), a pessoa é dona daquele endereço
	//private List<Cliente> Cliente;
	//private List<Funcionario> Funcionario;
	//private List<Editora> Editora;
	
	
		
	public Endereco() {
		
	}




	public Integer getIdEndereco() {
		return IdEndereco;
	}




	public void setIdEndereco(Integer idEndereco) {
		IdEndereco = idEndereco;
	}




	public String getNomeEndereco() {
		return NomeEndereco;
	}




	public void setNomeEndereco(String nomeEndereco) {
		NomeEndereco = nomeEndereco;
	}




	public String getBairroEndereco() {
		return BairroEndereco;
	}




	public void setBairroEndereco(String bairroEndereco) {
		BairroEndereco = bairroEndereco;
	}




	public String getCepEndereco() {
		return CepEndereco;
	}




	public void setCepEndereco(String cepEndereco) {
		CepEndereco = cepEndereco;
	}




	public String getNumerEndereco() {
		return NumerEndereco;
	}




	public void setNumerEndereco(String numerEndereco) {
		NumerEndereco = numerEndereco;
	}




	//public List<Cliente> getCliente() {
	//	return Cliente;
	//}




	//public void setCliente(List<Cliente> cliente) {
	//	Cliente = cliente;
	//}




	//public List<Funcionario> getFuncionario() {
	//	return Funcionario;
	//}




	//public void setFuncionario(List<Funcionario> funcionario) {
	//	Funcionario = funcionario;
	//}




//	public List<Editora> getEditora() {
//		return Editora;
//	}




	//public void setEditora(List<Editora> editora) {
//		Editora = editora;
	//}


	
	
	
}
