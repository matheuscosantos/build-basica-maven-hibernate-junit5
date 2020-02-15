package br.estudos.hibernate.maven.cadastro.modelo.testes;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.estudos.hibernate.maven.cadastro.modelo.Compra;

public class testeCompra {
	public static void main(String[] args) {		
		
		Compra compra = new Compra();
		LocalDateTime data = LocalDateTime.now();

		compra.setData(data);
		compra.setObservacao("Observação da compra");
		compra.setValor(500.0);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("estudos-hibernate");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(compra);
		em.getTransaction().commit();		
		em.close();
		
		emf.close();
	}
}
