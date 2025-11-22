package com.maria.jokepo;

import com.maria.model.Player;
import com.maria.model.Resultado;
import com.maria.model.JogadaTipo;

public class Regras {

	public Resultado regrasJogo (Player player, Player computador) {
		
		JogadaTipo j1 = player.getJogada();
		JogadaTipo pc = computador.getJogada();
	
		
		
		//EMPATE
		if(j1 == pc) {
			return Resultado.EMPATE;
		}
		
		if(j1 == JogadaTipo.PAPEL && pc == JogadaTipo.PEDRA) return Resultado.GANHOU;
		if(j1 == JogadaTipo.PEDRA && pc == JogadaTipo.TESOURA)return Resultado.GANHOU;
		if(j1 == JogadaTipo.TESOURA && pc == JogadaTipo.PAPEL)return Resultado.GANHOU;
		
		if(j1 == JogadaTipo.PAPEL && pc == JogadaTipo.TESOURA) return Resultado.PERDEU;
		if(j1 == JogadaTipo.PEDRA && pc == JogadaTipo.PAPEL) return Resultado.PERDEU;
		if(j1 == JogadaTipo.TESOURA && pc == JogadaTipo.PEDRA) return Resultado.PERDEU;
		
		return null;
		
		
	
	}
	
}
