package b.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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


	

	
}
