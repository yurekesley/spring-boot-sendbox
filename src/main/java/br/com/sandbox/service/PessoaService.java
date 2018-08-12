package br.com.sandbox.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sandbox.repository.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
    private PessoaRepository repo;
	
	
	
	public void teste () {
		repo.findAll();
		System.out.println(repo.findAll());
	}
	
}
