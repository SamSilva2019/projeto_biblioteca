package b.persistence;

import java.util.List;

import b.model.Livro;

public class DAOLivro extends DAO {
	
	public void cadastrar(Livro l) {
		entityManager.getTransaction().begin();
		entityManager.persist(l);
		entityManager.getTransaction().commit();
		entityManager.close(); 
	}

	@SuppressWarnings("unchecked")
	public List<Livro> getLista(){
		return entityManager.createQuery("from tb_livro l").getResultList();
	
	}
	
	public Livro visualiza(Integer id) {
		
		return entityManager.find(Livro.class, id);
	}
	
	public void atualizar(Livro l) {
		entityManager.getTransaction().begin();
		entityManager.merge(l);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
	
	public void remove(Livro l) {
		entityManager.getTransaction().begin();
		l = entityManager.find(Livro.class, l.getIdLivro());
		entityManager.remove(l);
		entityManager.getTransaction().commit();
		
	}
}



