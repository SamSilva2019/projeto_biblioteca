package b.persistence;

import java.util.List;

import b.model.Autor;

public class DAOAutor extends DAO {
	@SuppressWarnings("rawtypes")

	public void cadastrar(Autor	a) {
		entityManager.getTransaction().begin();
		entityManager.persist(a);
		entityManager.getTransaction().commit();
		entityManager.close(); 
	}

	@SuppressWarnings("unchecked")
	public List<Autor> getLista(){
		return entityManager.createQuery("from tb_autor ").getResultList();
	
	}
	
	public Autor visualiza(Integer id) {
		
		return entityManager.find(Autor.class, id);
	}
	
	public void atualizar(Autor a) {
		entityManager.getTransaction().begin();
		entityManager.merge(a);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
	
	public void remove(Autor a) {
		entityManager.getTransaction().begin();
		a = entityManager.find(Autor.class, a.getIdAutor());
		entityManager.remove(a);
		entityManager.getTransaction().commit();
		
	}
}
