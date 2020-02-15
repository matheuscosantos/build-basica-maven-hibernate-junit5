package br.estudos.hibernate.maven.cadastro.modelo.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.estudos.hibernate.maven.cadastro.modelo.Pessoa;

public class testePessoa {
	
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		
		pessoa.setLogin("matheuscosantos");
		pessoa.setNome("Matheus");
		pessoa.setSenha("123");
		pessoa.setEmail("matheuscosantos@gmail.com");
		
		//Cria o objeto que ir� usar as informa��es do persistence.xml para montar a Factory, passando como parametro o nome da persistence-unit
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("estudos-hibernate");
		
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(pessoa);
				
		em.getTransaction().commit();
		em.close();
		emf.close();
		
	}
}
