package b.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class DAO {
//entityManager faz o conexao com Bancodedados
	protected EntityManager entityManager;
	
	public DAO(){
		entityManager = getEntityManager();
	}
	private EntityManager getEntityManager(){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistencia");
		
		if(entityManager == null){
			//factory faz mensao a fabrica deconeção criada
			entityManager = factory.createEntityManager();	
		}return entityManager;
		
		
	}
}
