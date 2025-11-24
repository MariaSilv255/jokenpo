package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.maria.jokepo.Regras;
import com.maria.model.JogadaTipo;
import com.maria.model.Player;
import com.maria.model.Resultado;

class RegrasTest {

	
	// --- TESTE DE VITORIAS ---
	@Test
	void pedraGanhaDeTesoura() {
		Regras regras = new Regras();

		Player player = new Player(JogadaTipo.PEDRA);
		Player computador = new Player(JogadaTipo.TESOURA);

		Resultado resultado = regras.regrasJogo(player, computador);

		assertEquals(Resultado.GANHOU, resultado);

	}
	
	@Test
	void tesouraGanhaDePapel() {
		Regras regras = new Regras();
		
		Player player = new Player(JogadaTipo.TESOURA);
		Player computador = new Player(JogadaTipo.PAPEL);
		
		Resultado result = regras.regrasJogo(player, computador);
		assertEquals(Resultado.GANHOU, result);
		
	}
	
	@Test
	void papelGanhaDePedra() {
		Regras regras = new Regras();
		
		Player player = new Player(JogadaTipo.PAPEL);
		Player computador = new Player(JogadaTipo.PEDRA);
		
		Resultado result = regras.regrasJogo(player, computador);
		assertEquals(Resultado.GANHOU, result);
		
	}

	// --- TESTE DERROTA
	@Test
	void papelPerdeDeTesoura() {
		Regras regras = new Regras();
		
		Player player = new Player(JogadaTipo.PAPEL);
		Player computador = new Player(JogadaTipo.TESOURA);
		
		Resultado result = regras.regrasJogo(player, computador);
		assertEquals(Resultado.PERDEU, result);
		
	}

	@Test
	void pedraPerdeDePapel() {
		Regras regras = new Regras();
		
		Player player = new Player(JogadaTipo.PEDRA);
		Player computador = new Player(JogadaTipo.PAPEL);
		
		Resultado result = regras.regrasJogo(player, computador);
		assertEquals(Resultado.PERDEU, result);
		
	}
	
	@Test
	void tesouraPerdeDePedra() {
		Regras regras = new Regras();
		
		Player player = new Player(JogadaTipo.TESOURA);
		Player computador = new Player(JogadaTipo.PEDRA);
		
		Resultado result = regras.regrasJogo(player, computador);
		assertEquals(Resultado.PERDEU, result);
		
	}
	
	// TESTE EMPATE
	
	@Test
	void tesouraEmpate() {
		Regras regras = new Regras();
		
		Player player = new Player(JogadaTipo.TESOURA);
		Player computador = new Player(JogadaTipo.TESOURA);
		
		Resultado result = regras.regrasJogo(player, computador);
		assertEquals(Resultado.EMPATE, result);
		
	}
	
	@Test
	void pedraEmpate() {
		Regras regras = new Regras();
		
		Player player = new Player(JogadaTipo.PEDRA);
		Player computador = new Player(JogadaTipo.PEDRA);
		
		Resultado result = regras.regrasJogo(player, computador);
		assertEquals(Resultado.EMPATE, result);
		
	}
	
	@Test
	void papelEmpate() {
		Regras regras = new Regras();
		
		Player player = new Player(JogadaTipo.PAPEL);
		Player computador = new Player(JogadaTipo.PAPEL);
		
		Resultado result = regras.regrasJogo(player, computador);
		assertEquals(Resultado.EMPATE, result);
		
	}
	
}
