package br.com.sandbox.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sandbox.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
