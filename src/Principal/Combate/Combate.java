package Principal.Combate;

import java.util.Random;
import java.util.Scanner;

import Classes.Jogador;

public class Combate {
	
	static Jogador jogador = new Jogador();
	static Gerentes g1 = new Gerentes();

	public Combate() {
		
	}
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
		// retorna o numero de ataques entre 1 a 4
		return gerador.nextInt(4) + 1; 
	}

	//Vai mostrar a vida do mob e do Usuario mais os atributos do usuario
	static void mostrarVida(int gerente, int player) {
		System.out.println("=========================");
		System.out.println("Gerente "+ g1.getVida());
		System.out.println("Usuario "+jogador.getVida());
		System.out.println("=========================");
	}

	//Sistema de batalha
	static void batalha() {
		int escolhaAtaque = 0;

		//A batalha iniciara quando a vida do player e do mob for maior que 0
		while(jogador.getVida() > 0 && g1.getVida() > 0) {
			mostrarVida(g1.getVida(), jogador.getVida());
			//Ataque do Usuario
			escolhaAtaque = ataqueUsuario();
			switch(escolhaAtaque) {
			case 1:
				System.out.println("Usou o ataque leve");
				g1.recebeDano(jogador.ataqueLeve(10));
				break;
			case 2:
				System.out.println("Usou o ataque pesado");
				g1.recebeDano(jogador.ataquePesado(10));
				break;
			case 3:
				System.out.println("Usou o aumentar defesa");
				jogador.aumentarDefesa(15);
				break;
			case 4:
				System.out.println("Usou o aumentar ataque");
				g1.recebeDano(jogador.ataqueLeve(5) + jogador.aumentarForca(5)); 
				break;
			default:
				System.out.println("Opção Invalida");
				break;
			}
			//Ataque do mob
			if(g1.getVida() > 0) {
				escolhaAtaque = ataqueComputador();
				switch(escolhaAtaque) {
				case 1:
					System.out.println("Gerente usou ataque normal");
					jogador.recebeAtaque(g1.ataqueNormal(10));
					break;
				case 2:
					System.out.println("Gerente usou o ataque Forte");
					 jogador.recebeAtaque(g1.ataqueNormal(10));
					break;
				case 3:
					System.out.println("Gerente usou regenerar vida");
					g1.regeneraVida(0);
					break;
				case 4:
					System.out.println("Gerente usou furia");
					g1.furia(0);
					break;
				}
			}
			else {
				System.out.println("O inimigo foi derrotado");

			}
		}
	}
	// private static Jogador extracted() {
	// 	return jogador;
	// }
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


