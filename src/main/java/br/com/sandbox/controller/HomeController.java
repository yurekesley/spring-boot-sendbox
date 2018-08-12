package br.com.sandbox.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sandbox.service.PessoaService;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	private PessoaService service;
	
    @RequestMapping("/")
	public ResponseEntity<?> home() {	
    	service.teste();
		return new ResponseEntity<Optional<?>>(HttpStatus.OK);
	}
}
