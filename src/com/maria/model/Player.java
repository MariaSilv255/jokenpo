package com.maria.model;

public class Player {

	private final JogadaTipo jogada;
	
	public Player(JogadaTipo jogada) {
		this.jogada = jogada;
	}

	public JogadaTipo getJogada() {
		return jogada;
	}
	
	@Override
	public String toString() {
		return "jogou "+ jogada;
	}

	
	
}
