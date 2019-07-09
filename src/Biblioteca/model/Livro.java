package Biblioteca.model;

import java.io.Serializable;

public class Livro implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Integer IdLivro;
	private String nomeLivro;
	private String generoLivro;
	
	public Livro() {
		
	}

	public Integer getIdLivro() {
		return IdLivro;
	}

	public void setIdLivro(Integer idLivro) {
		IdLivro = idLivro;
	}

	public String getNomeLivro() {
		return nomeLivro;
	}

	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}

	public String getGeneroLivro() {
		return generoLivro;
	}

	public void setGeneroLivro(String generoLivro) {
		this.generoLivro = generoLivro;
	}

	
	
	
}
