package Biblioteca.persistence;

import java.util.List;

import Biblioteca.model.Cliente;



public class DAOCliente extends DAO {
	
	 public void  cadastrar(Cliente clie) {
		 entityManager.getTransaction().begin();
		 entityManager.persist(clie);
		 entityManager.getTransaction().commit();
		 entityManager.close();
	 }
	 
	 @SuppressWarnings("unchecked")
	 public List<Cliente> getLista(){
		return entityManager.createQuery("from cliente").getResultList();
		 
	 }
	 
	 public Cliente visualizar(Integer id) {
			return entityManager.find(Cliente.class,id);

		}
	 public void atualizar(Cliente cliente ) {
			entityManager.getTransaction().begin();
			entityManager.merge(cliente);
			entityManager.getTransaction().commit();
			entityManager.close();
		}

}
