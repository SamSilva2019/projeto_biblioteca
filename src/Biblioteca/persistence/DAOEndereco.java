package Biblioteca.persistence;

import java.util.List;

import Biblioteca.model.Endereco;


public class DAOEndereco extends DAO {

	public void cadastrar(Endereco end) {
		entityManager.getTransaction().begin();
		entityManager.persist(end);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	@SuppressWarnings("unchecked")
	public List<Endereco>getLista(){
		return entityManager.createQuery("from endereco e").getResultList();
		
	}
	
	public Endereco visualizar(Integer id) {
		return entityManager.find(Endereco.class,id);
	}
	
	public void atualizar(Endereco endereco) {
		entityManager.getTransaction().begin();
		entityManager.merge(endereco);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
	
	
	
	
}
