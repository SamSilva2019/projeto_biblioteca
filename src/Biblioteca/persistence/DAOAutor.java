package Biblioteca.persistence;

import java.util.List;

import Biblioteca.model.Autor;



public class DAOAutor extends DAO {
	
	
	public void cadastrar(Autor aut) {
		entityManager.getTransaction().begin();
		entityManager.persist(aut);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Autor> getLista(){
		return entityManager.createQuery("from autor au").getResultList();
		
		
	}
	
	public Autor visualizar(Integer id) {
		return entityManager.find(Autor.class,id);

	}
	
	public void atualizar(Autor autor ) {
		entityManager.getTransaction().begin();
		entityManager.merge(autor);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
	

}
