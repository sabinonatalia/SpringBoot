package br.org.generation.blogPessoal.model;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT) //classe de teste
public class UsuarioTest {

public Usuario usuario;
	
	@Autowired //injeção de dependencia 
	private final Validator validator = Validation.buildDefaultValidatorFactory().getValidator(); //verifica se avalidação deu certo
	
	@BeforeEach //execute antes de cada teste
	public void start() { // @BeforeEach para inicializar o objeto da Classe Usuario antes de iniciar o teste
		usuario = new Usuario(0, "Dandara", "dandara16@gmail.com", "dandara16");
	}
	
	@Test
	public void testValidationAtributos() {
		/*usuario.setNome("Patricia");
		usuario.setUsuario("pati@gmail.com");
		usuario.setSenha("123456");*/
		
		Set<ConstraintViolation<Usuario>> violations = validator.validate(usuario);
		System.out.println(violations.toString());
		assertTrue(violations.isEmpty());
		
	}
}
