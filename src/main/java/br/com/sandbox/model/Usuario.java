package br.com.sandbox.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="usuario")
public class Usuario {

	public Usuario() {}
	
	@Id @GeneratedValue
	private Integer id;
	
	private String nome;
	
	private String email;

	public Usuario(Integer id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", email=" + email + "]";
	}
}