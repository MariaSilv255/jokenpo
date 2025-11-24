package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.maria.jokepo.Application;
import com.maria.model.JogadaTipo;

class ValidarJogadaTest {

	@Test
	void entradaValidaEspaco() {
		assertEquals(JogadaTipo.PEDRA, Application.validarJogada(" pedra "));
	}
	
	@Test
	void entradaValidaPedra() {
		assertEquals(JogadaTipo.PAPEL, Application.validarJogada("papel"));
	}
	
	@Test
	void entradaInvalidaVazio(){
		assertNull(Application.validarJogada(""));
	}
	
	@Test
	void entradaInvalida() {
		assertNull(Application.validarJogada("cachorro"));
	}


}
