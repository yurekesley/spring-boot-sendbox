package br.com.sandbox.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sandbox.model.Usuario;
import br.com.sandbox.service.PessoaService;
import br.com.sandbox.service.UsuarioService;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	private PessoaService service;
	
	@Autowired
	private UsuarioService usuarioService;
	
    @RequestMapping("/")
	public ResponseEntity<List<Usuario>> home() {	
		return new ResponseEntity<List<Usuario>>(usuarioService.findAll(), HttpStatus.OK);
	}
}
