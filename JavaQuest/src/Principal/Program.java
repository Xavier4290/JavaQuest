package Principal;

import java.util.Scanner;

import Classes.Cavaleiro;
import Classes.Jogador;
import Classes.Ladino;
import Classes.Mago;
import Fases.MovimentoP;
import NPCs.Comerciantes;

public class Program {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Scanner conf = new Scanner(System.in);
		Scanner escolhaC = new Scanner(System.in);
		
		// Mostrar menu
		System.out.println(Menu.MostrarMenu());
	
		//Escolhe o nome para o personagem
		System.out.println("Escolha o nome para seu personagem");
		String nome = scanner.nextLine();
		Jogador jogador = new Jogador(nome);
		jogador.mostrarNome(nome);
		
		// Escolher a classe
		System.out.println(Menu.MostrarClasse());
		String escolhaP = escolhaC.nextLine();
		
		while(escolhaP.equalsIgnoreCase("")) {
			System.out.println(Menu.MostrarClasse());
			escolhaP = escolhaC.nextLine();
		
			if(escolhaP.equalsIgnoreCase("cavaleiro")) {
				 jogador = new Cavaleiro();
			}
			else if(escolhaP.equalsIgnoreCase("mago")) {
				jogador = new Mago();	
			}
			else if(escolhaP.equalsIgnoreCase("ladino")) {
				jogador = new Ladino();	
				
			}
			
			
		}
		
		//Vai mostar os atributos da classe que o jogador escolher
		if(escolhaP.equalsIgnoreCase("cavaleiro")) {
			jogador = new Cavaleiro();
			jogador.mostrarAtri();
		}
		else if(escolhaP.equalsIgnoreCase("mago")) {
			jogador = new Mago();
			jogador.mostrarAtri();
		}
		else if(escolhaP.equalsIgnoreCase("ladino")) {
			jogador = new Ladino();
			jogador.mostrarAtri();
			
		}
		// Confirmar a classe escolhida
		System.out.printf("A classe escolhida foi: %s\n", escolhaP);
		System.out.printf("Deseja Iniciar com a classe: %s?\n", escolhaP);
		String confirmaP =  conf.nextLine().toUpperCase();
		
		// Escolher outra classe
		while (!confirmaP.equalsIgnoreCase("Sim") && !confirmaP.equalsIgnoreCase("s")) {
			System.out.println(Menu.MostrarClasse());
		    String escolhaP2 = escolhaC.nextLine();
		    System.out.printf("A classe escolhida foi: %s\n",escolhaP2);
		    
			if(escolhaP2.equalsIgnoreCase("cavaleiro")) {
				jogador = new Cavaleiro();
				jogador.mostrarAtri();
			}
			else if(escolhaP2.equalsIgnoreCase("mago")) {
				jogador = new Mago();
				jogador.mostrarAtri();
			}
			else if(escolhaP2.equalsIgnoreCase("ladino")) {
				jogador = new Ladino();
				jogador.mostrarAtri();
			}
			// Confirma a nova classe escolhida pelo jogador		
			System.out.printf("Deseja Iniciar com a classe: %s?\n", escolhaP2); 
			confirmaP = new Scanner(System.in).nextLine();
			
			// Mostra a nova classe escolhida escolhida pelo jogador
			if (confirmaP.equalsIgnoreCase("Sim") || confirmaP.equalsIgnoreCase("s")) {
		        System.out.printf("Você escolheu a classe: %s\n", escolhaP2);
		        break;
		    }
			
		}
		
		//Inicia a fase
		MovimentoP mp = new MovimentoP();
		mp.Andar();
//		System.out.println("Seguindo caminho adiante, " +nome+ " encontra um vendedor. \n");
//		System.out.println("Vendedor Red: Bom dia amigo. Deseja comprar alguma coisa ??");
//		System.out.println(Comerciantes.ItemDoComercianteRed());	
//				
	}

}
