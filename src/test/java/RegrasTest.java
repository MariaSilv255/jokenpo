package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.maria.jokepo.Regras;
import com.maria.model.JogadaTipo;
import com.maria.model.Player;
import com.maria.model.Resultado;

class RegrasTest {

	@Test
	void pedraGanhaDeTesoura() {
		Regras regras = new Regras();

		Player player = new Player(JogadaTipo.PEDRA);
		Player computador = new Player(JogadaTipo.TESOURA);

		Resultado resultado = regras.regrasJogo(player, computador);

		assertEquals(Resultado.GANHOU, resultado);

	}

}
