package Biblioteca.persistence;

import java.util.List;

import Biblioteca.model.Editora;

public class DAOEditora extends DAO {
	
	
	public void cadastrar(Editora edi) {
		entityManager.getTransaction().begin();
		entityManager.persist(edi);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	@SuppressWarnings("unchecked")
	public List<Editora>getLista(){
		return entityManager.createQuery("from editora ed").getResultList();
		
	}
	public Editora visualizar(Integer id) {
		return entityManager.find(Editora.class,id);
	}
	public void atualizar(Editora editora) {
		entityManager.getTransaction().begin();
		entityManager.merge(editora);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
}
