package br.estudos.hibernate.maven.cadastro.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Entity define que a classe ser� uma entidade para o JPA
@Entity
public class Pessoa {
	
	//Id define que o atributo escolhido ser� um identificador
	//GeneratedValue informa que usaremos uma chave prim�ria com auto incremento
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String login;
	String senha;
	String email;
	String nome;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
