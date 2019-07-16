package b.persistence;

import java.util.List;

import b.model.Editora;

public class DAOEditora extends DAO {
	@SuppressWarnings("rawtypes")

	public void cadastrar(Editora e) {
		entityManager.getTransaction().begin();
		entityManager.persist(e);
		entityManager.getTransaction().commit();
		entityManager.close(); 
	}

	@SuppressWarnings("unchecked")
	public List<Editora> getLista(){
		return entityManager.createQuery("from tb_editora ").getResultList();
	
	}
	
	public Editora visualiza(Integer id) {
		
		return entityManager.find(Editora.class, id);
	}
	
	public void atualizar(Editora e) {
		entityManager.getTransaction().begin();
		entityManager.merge(e);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
	
	public void remove(Editora e) {
		entityManager.getTransaction().begin();
		e = entityManager.find(Editora.class, e.getIdEditora());
		entityManager.remove(e);
		entityManager.getTransaction().commit();
		
	}
}
