package Teste;

import java.util.Scanner;

import Classes.Cavaleiro;
import Classes.Jogador;

public class TesteCombate {

	public static void main(String[] args) {

//		Scanner scanner = new Scanner(System.in);
//		Scanner ataque = new Scanner(System.in);
//
//		Jogador jogador = new Jogador();
//		
//		Thread ataqueR = new Thread(jogador);
//		Thread ataqueP = new Thread(jogador);
//		System.out.println("Digite 1 para ataque Rapido");
//		int ataques = scanner.nextInt();
//		TesteCombateThrades tct = new TesteCombateThrades(ataques);
//		tct.ataquePesado();
//		tct.ataqueRapido();
//
//		try {
//			tct.join();
//			tct.join();
//		}catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println("Voltando para o mapa");
//
//	}
		
		Scanner scanner = new Scanner(System.in);
		Jogador jogador = new Jogador();

		Thread ataqueR = new Thread(jogador::ataqueRapido);
		Thread ataqueP = new Thread(jogador::ataquePesado);

		System.out.println("Digite 1 para ataque Rápido");
		int opcao = scanner.nextInt();
		TesteCombateThrades tct = new TesteCombateThrades(opcao);

//		if (opcao == 1) {
//		    ataqueR.start();
//		} else {
//		    ataqueP.start();
//		}
//
//		try {
//		    ataqueR.join();
//		    ataqueP.join();
//		} catch (InterruptedException e) {
//		    e.printStackTrace();
//		}
//
//		System.out.println("Voltando para o mapa");
//
//	}
}
}
