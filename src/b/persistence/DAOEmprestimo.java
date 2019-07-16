package b.persistence;

import java.util.List;

import b.model.Emprestimo;

public class DAOEmprestimo extends DAO {
	@SuppressWarnings("rawtypes")

	public void cadastrar(Emprestimo em) {
		entityManager.getTransaction().begin();
		entityManager.persist(em);
		entityManager.getTransaction().commit();
		entityManager.close(); 
	}

	@SuppressWarnings("unchecked")
	public List<Emprestimo> getLista(){
		return entityManager.createQuery("from tb_emprestimo ").getResultList();
	
	}
	
	public Emprestimo visualiza(Integer id) {
		
		return entityManager.find(Emprestimo.class, id);
	}
	
	public void atualizar(Emprestimo em) {
		entityManager.getTransaction().begin();
		entityManager.merge(em);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
	
	public void remove(Emprestimo em) {
		entityManager.getTransaction().begin();
		em = entityManager.find(Emprestimo.class, em.getIdEmprestimo());
		entityManager.remove(em);
		entityManager.getTransaction().commit();
		
	}
}
