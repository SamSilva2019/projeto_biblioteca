package b.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_Editora")

public class Editora implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer IdEditora;
	private String NomeEditora;
	
	 @OneToMany(mappedBy="editora")
	 private List<Endereco> endereco = new ArrayList<>();
	
	//Editora e Endereço
	//@ManyToMany
//	@JoinTable(name="EditEnd", joinColumns=
	//{@JoinColumn(name="IdEditora")}, inverseJoinColumns=
	//{@JoinColumn(name="IdEndereco")})
//	private List<Endereco>Endereco;
	
	// Editora e Livro 
	//@ManyToMany
	//@JoinTable(name="EditLivro", joinColumns= {@JoinColumn(name="IdEditora")}, inverseJoinColumns= 
	//{@JoinColumn(name="IdLivro")})
//	private List<Livro>Livro;
	
	
	public Editora(){
		
	}

	public Integer getIdEditora() {
		return IdEditora;
	}

	public void setIdEditora(Integer idEditora) {
		IdEditora = idEditora;
	}

	public String getNomeEditora() {
		return NomeEditora;
	}

	public void setNomeEditora(String nomeEditora) {
		NomeEditora = nomeEditora;
	}

//	public List<Endereco> getEndereco() {
	//	return Endereco;
	//}

	//public void setEndereco(List<Endereco> endereco) {
//		Endereco = endereco;
	//}

	//public List<Livro> getLivro() {
//		return Livro;
	//}

	//public void setLivro(List<Livro> livro) {
	//	Livro = livro;
	//}
	
	
}
