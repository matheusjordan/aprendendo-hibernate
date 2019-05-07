package banco;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import banco.model.Conta;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("teste");
		EntityManager em = emf.createEntityManager();
		
		Conta conta = new Conta("1234", 150.0);
		
		em.getTransaction().begin();
		em.persist(conta);
		em.getTransaction().commit();
		
		em.close();
//		emf.close();
	}
}
