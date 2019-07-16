package b.persistence;

import java.util.List;

import b.model.Cliente;


public class DAOCliente extends DAO {
	
	@SuppressWarnings("rawtypes")
	public boolean login(String nome, String senha){
		
		String sql = "from tb_cliente as c where c.LoginCliente=:vNome AND c.SenhaCliente=:vSenha";
		
		javax.persistence.Query query = 
				entityManager.createQuery(sql);
		
		query.setParameter("vNome", nome);
		query.setParameter("vSenha",senha);
		
		
		List result = query.getResultList();
		
		if(result.size()>0)
			return true;
		else
			return false;
	
	}

	public void cadastrar(Cliente c) {
		entityManager.getTransaction().begin();
		entityManager.persist(c);
		entityManager.getTransaction().commit();
		entityManager.close(); 
	}

	@SuppressWarnings("unchecked")
	public List<Cliente> getLista(){
		return entityManager.createQuery("from tb_cliente c").getResultList();
	
	}
	
	public Cliente visualiza(Integer id) {
		
		return entityManager.find(Cliente.class, id);
	}
	
	public void atualizar(Cliente c) {
		entityManager.getTransaction().begin();
		entityManager.merge(c);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
	
	public void remove(Cliente c) {
		entityManager.getTransaction().begin();
		c = entityManager.find(Cliente.class, c.getIdCliente());
		entityManager.remove(c);
		entityManager.getTransaction().commit();
		
	}
}



