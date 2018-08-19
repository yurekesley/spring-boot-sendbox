package br.com.sandbox.repository;

import static org.junit.Assert.assertEquals;

import javax.validation.ConstraintViolationException;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

import br.com.sandbox.ApplicationContextTest;
import br.com.sandbox.model.Usuario;
import br.com.sandbox.model.UsuarioBuilder;
import br.com.sandbox.service.UsuarioService;

public class UsuarioServiceTest extends ApplicationContextTest {

	private Usuario usuario;
	
	@Autowired
	private UsuarioService service;

	@Before
	public void antes() {

	}

	@Test
	public void deveSalvarUsuario() {
		usuario = new UsuarioBuilder().setNome("Yure").build();
		
		Usuario usuarioASalvar = service.save(usuario);
		Boolean ehSalvo = service.existsById(usuarioASalvar.getId());

		assertEquals(true, ehSalvo);
		
	}

	@Test
	public void naoDeveSalvarUsuario_nomeNulo() throws ConstraintViolationException {		
		usuario = new UsuarioBuilder().setNome(null).build();

		Usuario usuarioASalvar = service.save(usuario);
		thrown.expect(ConstraintViolationException.class);
		
		Boolean ehSalvo = service.existsById(usuarioASalvar.getId());

		assertEquals(false, ehSalvo);
	}
	
	@Test
	public void deveExecutarMetodoDoServico() {
	
		assertEquals("XX", this.service.teste());

	}
	
	
	@TestConfiguration
	static class UsuarioServiceTestContextConfiguration {

		@Bean
		public UsuarioService usuarioService() {
			return new UsuarioService();
		}
		

	}

}
