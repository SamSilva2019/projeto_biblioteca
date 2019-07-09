package b.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="tb_Genero")
public class Genero implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer IdGenero;
	private String NomeGenero;
	
	public Genero() {
		
	}

	public Integer getIdGenero() {
		return IdGenero;
	}

	public void setIdGenero(Integer idGenero) {
		IdGenero = idGenero;
	}

	public String getNomeGenero() {
		return NomeGenero;
	}

	public void setNomeGenero(String nomeGenero) {
		NomeGenero = nomeGenero;
	}

	
	
	
}
