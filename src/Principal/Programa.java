package Principal;

import java.util.Scanner;

import Classes.Cavaleiro;
import Classes.Jogador;
import Classes.Ladino;
import Classes.Mago;
import Fases.Movimento_Personagem;
import Fases.get_status_mapa;
import Inimigos.Eslaime;

public class Programa {
	static Jogador menu_escolha(String nome_do_jogador) {
		String menuEscolha = Menu.MostrarClasse();
		System.out.println(menuEscolha);
        Jogador jogador_atualizado = new Jogador(nome_do_jogador);
        String classe_escolhida = (new Scanner(System.in)).nextLine().toLowerCase();
		try {
			switch(classe_escolhida){
				case "cavaleiro":
						jogador_atualizado = new Cavaleiro();
						break;
					case "mago":
						jogador_atualizado = new Mago();
						break;
					case "ladino":
						jogador_atualizado = new Ladino();
						break;
					default:
                    jogador_atualizado = menu_escolha(nome_do_jogador);
						break;
			}
		} catch (Exception e) {
			//
		}
        System.out.println(
            "Prosseguir com essa classe?\n (S\\N): "
        );
        String scanner_prosseguir = (new Scanner(System.in)).nextLine().toUpperCase();
        if(scanner_prosseguir.equals("N")){
            jogador_atualizado = menu_escolha(nome_do_jogador);
        }
		return jogador_atualizado;
	}
    public static void main(String[] args){
		// System.out.println("-----------------------\n" + "Aperte W para subir \n" + "Aperte S para ir descer \n"
		// + "Aperte A para ir a esquerda \n" + "Aperte D para ir a direita \n" + "-----------------------");
        // System.out.println(
        //     "Digite seu nome: \n"
        // );
        // String nome_do_jogador = (new Scanner(System.in)).nextLine();
        // Jogador player_escolhido = menu_escolha(nome_do_jogador);
        // (new Movimento_Personagem()).Andador();
    }
}
