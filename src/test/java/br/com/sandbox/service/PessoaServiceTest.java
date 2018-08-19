package br.com.sandbox.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import br.com.sandbox.model.Usuario;
import br.com.sandbox.repository.UsuarioRepository;

@RunWith(MockitoJUnitRunner.class)
public class PessoaServiceTest {
	
	private Usuario usuario;
	
	@Mock
	private UsuarioRepository urUsuarioRepository;
	
	@Mock
	private UsuarioService service;
	
	@Before
	public void before() {
		
	}
	
	
	
	@Test
	public void deveRetornarQuatro () {
		System.out.println("xxxxxxxxxxxxxx"+service.teste());
		assertEquals(10, 10);
	}

}
