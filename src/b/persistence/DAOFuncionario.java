package b.persistence;

import java.util.List;

import b.model.Funcionario;

public class DAOFuncionario extends DAO{
	@SuppressWarnings("rawtypes")
	public boolean login(String login, String senha){
		
		String sql = "from tb_funcionario as c where c.LoginFuncionario=:vLogin AND c.SenhaFuncionario=:vSenha";
		
		javax.persistence.Query query = 
				entityManager.createQuery(sql);
		
		query.setParameter("vLogin", login);
		query.setParameter("vSenha",senha);
		
		
		List result = query.getResultList();
		
		if(result.size()>0)
			return true;
		else
			return false;
	
	}

	public void cadastrar(Funcionario f) {
		entityManager.getTransaction().begin();
		entityManager.persist(f);
		entityManager.getTransaction().commit();
		entityManager.close(); 
	}

	@SuppressWarnings("unchecked")
	public List<Funcionario> getLista(){
		return entityManager.createQuery("from Funcionario f").getResultList();
	
	}
	
	public Funcionario visualiza(Integer id) {
		
		return entityManager.find(Funcionario.class, id);
	}
	
	public void atualizar(Funcionario f) {
		entityManager.getTransaction().begin();
		entityManager.merge(f);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
	
	public void remove(Funcionario f) {
		entityManager.getTransaction().begin();
		f = entityManager.find(Funcionario.class, f.getIdFuncionario());
		entityManager.remove(f);
		entityManager.getTransaction().commit();
		
	}
}
