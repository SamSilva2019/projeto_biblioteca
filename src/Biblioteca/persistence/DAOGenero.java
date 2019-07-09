package Biblioteca.persistence;

import java.util.List;

import Biblioteca.model.Genero;

public class DAOGenero extends DAO {

	public void cadastrar(Genero gen) {
		entityManager.getTransaction().begin();
		entityManager.persist(gen);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Genero> getLista(){
		return entityManager.createQuery("from Genero g").getResultList();
		
		
	}
	
	public Genero visualizar(Integer id) {
		return entityManager.find(Genero.class,id);

	}
	
	public void atualizar(Genero genero ) {
		entityManager.getTransaction().begin();
		entityManager.merge(genero);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
}
