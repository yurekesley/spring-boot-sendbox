package br.com.sandbox.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.sandbox.repository.UsuarioRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class PessoaServiceTest {

	@Autowired
	private TestEntityManager entityManager;
	
	@Autowired
	private UsuarioRepository urUsuarioRepository;
	
	@Test
	public void deveRetornarQuatro () {
		this.entityManager = null;
		assertEquals(4, urUsuarioRepository.count());
	}

}
