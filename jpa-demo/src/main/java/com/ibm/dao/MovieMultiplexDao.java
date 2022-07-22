package com.ibm.dao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.ibm.entity.Multiplex;
public class MovieMultiplexDao {
	private EntityManagerFactory factory;
	public MovieMultiplexDao() {
		factory=Persistence.createEntityManagerFactory("MyJPA");
	}
	
	public int addMpex(Multiplex m) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		em.persist(m);
		txn.commit();
		em.close();
		return m.getMpexId();
	}
	
	
	
}
