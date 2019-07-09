package b.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="tb_Emprestimo")
public class Emprestimo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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
