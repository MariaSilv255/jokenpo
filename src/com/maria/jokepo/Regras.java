package com.maria.jokepo;

import com.maria.model.Player;
import com.maria.model.Resultado;

import java.util.Map;

import com.maria.model.JogadaTipo;

public class Regras {

	private static final Map<JogadaTipo, JogadaTipo> vitorias = Map.of(
			
			JogadaTipo.PEDRA,JogadaTipo.TESOURA,
			JogadaTipo.PAPEL,JogadaTipo.PEDRA,
			JogadaTipo.TESOURA,JogadaTipo.PAPEL
		
			);
			
			
	
	public Resultado regrasJogo (Player player, Player computador) {
		
		JogadaTipo j1 = player.getJogada();
		JogadaTipo pc = computador.getJogada();
	
		if(j1 == pc) return Resultado.EMPATE;
		if(vitorias.get(j1) == pc) return Resultado.GANHOU;
		return Resultado.PERDEU;
		
		
	
	}
	
}
