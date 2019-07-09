package Biblioteca.model;

import java.io.Serializable;

public class Genero implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
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
