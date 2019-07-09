package Biblioteca.persistence;

import java.util.List;

import Biblioteca.model.Funcionario;

public class DAOFuncionario extends DAO {

	
	public void cadastrar(Funcionario fun) {
		entityManager.getTransaction().begin();
		entityManager.persist(fun);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Funcionario>getLista(){
		return entityManager.createQuery("from funcionario f").getResultList();
		
	}
	
	public Funcionario visualizar(Integer id) {
		return entityManager.find(Funcionario.class,id);
	}
	
	public void atualizar(Funcionario funcionario) {
		entityManager.getTransaction().begin();
		entityManager.merge(funcionario);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}
