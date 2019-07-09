package b.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="tb_Autor")
public class Autor implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer IdAutor;
	private String NomeAutor;
	private String emailAutor;
	private Integer CAR;
	
	public Autor() {
		
	}

	public Integer getIdAutor() {
		return IdAutor;
	}

	public void setIdAutor(Integer idAutor) {
		IdAutor = idAutor;
	}

	public String getNomeAutor() {
		return NomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		NomeAutor = nomeAutor;
	}

	public String getEmailAutor() {
		return emailAutor;
	}

	public void setEmailAutor(String emailAutor) {
		this.emailAutor = emailAutor;
	}

	public Integer getCAR() {
		return CAR;
	}

	public void setCAR(Integer cAR) {
		CAR = cAR;
	}

	
	
}
