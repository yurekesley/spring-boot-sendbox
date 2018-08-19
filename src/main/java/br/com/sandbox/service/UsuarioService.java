package br.com.sandbox.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sandbox.model.Usuario;
import br.com.sandbox.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repo;
	
	public List<Usuario> findAll() {
		return repo.findAll();
	}
	
	public Usuario save(Usuario usuario) {
		return repo.save(usuario);
	}
	
	public Boolean existsById (Long id) {
		return repo.existsById(id);
	}
	
	public String teste() {
		return "XX";
	}

}
