package Biblioteca.persistence;



import java.util.List;

import Biblioteca.model.Livro;

public class DAOLivro  extends DAO{
	
	public void cadastrar(Livro liv) {
	entityManager.getTransaction().begin();
	entityManager.persist(liv);
	entityManager.getTransaction().commit();
	entityManager.close();
	
	
	}
	
	@SuppressWarnings("unchecked")
	private List<Livro> getLista(){
		return entityManager.createQuery("from livro").getResultList();

	}
	
	public  Livro visualizar(Integer id) {
		return entityManager.find(Livro.class,id);
	}
	 public void atualizar(Livro livro ) {
			entityManager.getTransaction().begin();
			entityManager.merge(livro);
			entityManager.getTransaction().commit();
			entityManager.close();
		}
}
