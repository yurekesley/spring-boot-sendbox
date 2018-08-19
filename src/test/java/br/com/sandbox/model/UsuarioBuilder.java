package br.com.sandbox.model;

public class UsuarioBuilder {
	
	private Usuario that;
	
	public UsuarioBuilder() {
		this.that = new Usuario();
	}
	
	public UsuarioBuilder setId(Long id) {
		this.that.setId(id);
		return this;
	}
	
	public UsuarioBuilder setNome(String nome) {
		this.that.setNome(nome);
		return this;
	}
	
	public Usuario build() {
		return this.that;
	}
}
