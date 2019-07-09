package Biblioteca.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="tb_emprestimo")
public class Emprestimo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	@EmbeddedId
	private Integer IdEmprestimo;
	
	private Double Multa;
	
	@Temporal(value=TemporalType.DATE)
	private Date DTinicioAL;
	
	@Temporal(value=TemporalType.DATE)
	private Date DTfimAL;
	
	public Emprestimo() {
		
	}

	public Integer getIdEmprestimo() {
		return IdEmprestimo;
	}

	public void setIdEmprestimo(Integer idEmprestimo) {
		IdEmprestimo = idEmprestimo;
	}

	public Double getMulta() {
		return Multa;
	}

	public void setMulta(Double multa) {
		Multa = multa;
	}

	public Date getDTinicioAL() {
		return DTinicioAL;
	}

	public void setDTinicioAL(Date dTinicioAL) {
		DTinicioAL = dTinicioAL;
	}

	public Date getDTfimAL() {
		return DTfimAL;
	}

	public void setDTfimAL(Date dTfimAL) {
		DTfimAL = dTfimAL;
	}
	
	

}
