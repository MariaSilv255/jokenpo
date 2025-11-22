package com.maria.jokepo;

import java.util.Random;
import java.util.Scanner;
import com.maria.model.Player;
import com.maria.model.Resultado;
import com.maria.model.JogadaTipo;

public class Application {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("===JOKENPÔ===");

		Player player = jogadaPlayer(sc);
		Player computador = jogadarComputador();

		Regras regras = new Regras();
		Resultado rs = regras.regrasJogo(player, computador);

		if (rs == Resultado.GANHOU) {
			System.out.println("VOCE GANHOU URUUUUU");
		} else if (rs == Resultado.PERDEU) {
			System.out.println("Que pena voce perdeu");
		} else {
			System.out.println(rs);
		}

		sc.close();
	}

	public static JogadaTipo validarJogada(String entrada) {

		try {
			return JogadaTipo.valueOf(entrada.toUpperCase());
		} catch (IllegalArgumentException e) {

			System.out.println("#################################");
			System.out.println("Entrada inválida!");

			return null;
		}
	}

	public static Player jogadaPlayer(Scanner sc) {

		JogadaTipo turno = null;
		
		while (turno == null) {

			System.out.print("Escolha (PEDRA, PAPEL, TESOURA)? ");
			String playerJoga = sc.nextLine().toUpperCase();
			turno = validarJogada(playerJoga);

		}
		
		Player player = new Player(turno);
		System.out.println("Voce escolheu: " + player.getJogada());
		return player;

	}

	public static Player jogadarComputador() {

		Random random = new Random();
		Player computador = new Player(JogadaTipo.values()[random.nextInt(3)]);
		System.out.println("computador " + computador);
		return computador;
	}
}
