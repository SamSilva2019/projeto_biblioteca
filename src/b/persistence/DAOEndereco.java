package b.persistence;

import java.util.List;

import b.model.Endereco;


public class DAOEndereco extends DAO {
	
	@SuppressWarnings("rawtypes")


	public void cadastrar(Endereco e) {
		entityManager.getTransaction().begin();
		entityManager.persist(e);
		entityManager.getTransaction().commit();
		entityManager.close(); 
	}

	@SuppressWarnings("unchecked")
	public List<Endereco> getLista(){
		return entityManager.createQuery("from Endereco e").getResultList();
	
	}
	
	public Endereco visualiza(Integer id) {
		
		return entityManager.find(Endereco.class, id);
	}
	
	public void atualizar(Endereco e) {
		entityManager.getTransaction().begin();
		entityManager.merge(e);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
	
	public void remove(Endereco e) {
		entityManager.getTransaction().begin();
		e = entityManager.find(Endereco.class, e.getIdEndereco());
		entityManager.remove(e);
		entityManager.getTransaction().commit();
		
	}
}



