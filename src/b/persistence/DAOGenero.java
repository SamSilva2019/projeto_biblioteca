package b.persistence;

import java.util.List;

import b.model.Genero;


public class DAOGenero extends DAO {
	@SuppressWarnings("rawtypes")
	
	public void cadastrar(Genero g) {
		entityManager.getTransaction().begin();
		entityManager.persist(g);
		entityManager.getTransaction().commit();
		entityManager.close(); 
	}

	@SuppressWarnings("unchecked")
	public List<Genero> getLista(){
		return entityManager.createQuery("from tb_genero g").getResultList();
	
	}
	
	public Genero visualiza(Integer id) {
		
		return entityManager.find(Genero.class, id);
	}
	
	public void atualizar(Genero g) {
		entityManager.getTransaction().begin();
		entityManager.merge(g);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
	
	public void remove(Genero g) {
		entityManager.getTransaction().begin();
		g = entityManager.find(Genero.class, g.getIdGenero());
		entityManager.remove(g);
		entityManager.getTransaction().commit();
		
	}
}



