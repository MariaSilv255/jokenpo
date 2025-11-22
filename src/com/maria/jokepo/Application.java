package com.maria.jokepo;

import java.util.Random;
import java.util.Scanner;

import com.maria.model.Player;
import com.maria.model.JogadaTipo;

public class Application {
	public static void main(String[] args) {
		
		System.out.println("===JOKENPÔ===");
		Scanner sc = new Scanner(System.in);
		Player player = jogadaPlayer(sc);
		Player computador = jogadarComputador();
		
		Regras regras = new Regras();
		System.out.println("==="+regras.regrasJogo(player, computador)+"===");;
		sc.close();
	}
	
	public static Player jogadaPlayer (Scanner sc) {
	
		System.out.println("Escolha (PEDRA, PAPEL, TESOURA)??");
		String playerJoga = sc.nextLine().toUpperCase();
		Player player = new Player(JogadaTipo.valueOf(playerJoga));
	
		
		return player;
	}
	
	public static Player jogadarComputador() {

		Random random = new Random();
		Player computador = new Player(JogadaTipo.values()[random.nextInt(3)]);
		System.out.println("computador "+ computador);
		return  computador;
	}
}
