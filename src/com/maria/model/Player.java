package com.maria.model;

public class Player {

	private JogadaTipo jogada;

	public Player() {
		
	}
	
	public Player(JogadaTipo jogada) {
		this.jogada = jogada;
	}

	public JogadaTipo getJogada() {
		return jogada;
	}

	public void setJogada(JogadaTipo jogada) {
		this.jogada = jogada;
	}

	@Override
	public String toString() {
		return "jogou "+ jogada;
	}

	
	
}
