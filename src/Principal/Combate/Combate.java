package Principal.Combate;

import java.util.Random;
import java.util.Scanner;
import Classes.Jogador;
import Principal.Programa;

public class Combate extends Programa{
	static Jogador jogador = new Jogador();
	static int ataqueUsuario(){
		Scanner leitor = new Scanner(System.in);
		System.out.println("Escolha o ataque");
		System.out.println("1 - Ataque leve");
		System.out.println("2 - Ataque pesado");
		System.out.println("3 - Aumento na armadura");
		System.out.println("4 - Aumento de ataque");
		return leitor.nextInt();
	}
	// Quando o jogador vencer a batalha é acrescentado mais 20 pontos de vida
	static void restauraVida() {
		if(jogador.getVida() < 100) {
			jogador.setVida(20);
		}else {
			jogador.setVida(0);
		}
	}

	//Ataque do computador
	static int ataqueComputador() {
		Random gerador = new Random();
		// retorna o numero de ataques entre 1 a 2
		return gerador.nextInt(2) + 1; 
	}

	//Vai mostrar a vida do mob e do Usuario mais os atributos do usuario
	static void mostrarVida(int hpComputador, int i) {
		System.out.println("=========================");
		System.out.println("Maquina "+hpComputador);
		System.out.println("Usuario "+jogador.getVida());
		System.out.println("=========================");
	}

	//Sistema de batalha
	static void batalha() {
		int hpComputador = 100;
		int escolhaAtaque = 0;

		//A batalha iniciara quando a vida do player e do mob for maior que 0
		while(jogador.getVida() > 0 && hpComputador > 0) {
			mostrarVida(hpComputador, jogador.getVida());
			//Ataque do Usuario
			escolhaAtaque = ataqueUsuario();
			switch(escolhaAtaque) {
			case 1:
				System.out.println("Usou o ataque leve");
				hpComputador -= jogador.ataqueLeve(10);
				break;
			case 2:
				System.out.println("Usou o ataque pesado");
				hpComputador -= jogador.ataquePesado(10);
				break;
			case 3:
				System.out.println("Usou o aumentar defesa");
				jogador.aumentarDefesa(15);
				break;
			case 4:
				System.out.println("Usou o aumentar ataque");
				hpComputador -= jogador.ataqueLeve(5) + jogador.aumentarForca(5);
				break;
			default:
				System.out.println("Opção Invalida");
				break;
			}
			//Ataque do mob
			if(hpComputador > 0) {
				escolhaAtaque = ataqueComputador();
				switch(escolhaAtaque) {
				case 1:
					System.out.println("Usou o mordida");
					jogador.recebeAtaque(10);
					break;
				case 2:
					System.out.println("Usou acido");
					jogador.recebeAtaque(15);
					break;
				}
			}
			else {
				System.out.println("O inimigo foi derrotado");

			}
		}
	}
	public static void main(String[] args) {
		Scanner continuar_jogo = new Scanner(System.in);
		int continua = 1;

		while(continua == 1) {
			System.out.println("Deseja Continuar (1 - Sim / 0 - Não)");
			continua = continuar_jogo.nextInt();
			//esta chamando o metodo restaurar vida
			batalha();
			//esta chamando o metodo batalha
			restauraVida();
			
		}
	}

}


