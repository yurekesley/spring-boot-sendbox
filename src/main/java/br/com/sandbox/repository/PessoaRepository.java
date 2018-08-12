package br.com.sandbox.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sandbox.model.Pessoa;

public interface PessoaRepository  extends JpaRepository<Pessoa, Long> {

}

