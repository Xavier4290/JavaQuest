package Sistema_De_Combate;

import java.util.Random;
import java.util.Scanner;

import Classes.Jogador;
import Inimigos.Poluidor;

public class Combate_Poluidor {
    static Jogador jogador = new Jogador();
    static Poluidor poluidor = new Poluidor();

    static int ataqueUsuario() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Escolha o ataque");
        System.out.println("1 - Ataque leve");
        System.out.println("2 - Ataque pesado");
        System.out.println("3 - Sugar vida");
        System.out.println("4 - Aumento de ataque");
        return leitor.nextInt();
    }

    static void restauraVida() {
        if (jogador.getVida() < 100) {
            jogador.setVida(20);
        } else {
            jogador.setVida(0);
        }
    }

    static int ataqueComputador() {
        Random gerador = new Random();
        return gerador.nextInt(2) + 1;
    }

    static void mostrarVida(int poluidor1, int player) {
        System.out.println("=========================");
        System.out.println("O Poluidor " + poluidor.getVida());
        System.out.println("Usuario " + jogador.getVida());
        System.out.println("=========================");
    }

    static void batalha() {
        int escolhaAtaque = 0;

        while (jogador.getVida() > 0 && poluidor.getVida() > 0) {
            mostrarVida(poluidor.getVida(), jogador.getVida());
            escolhaAtaque = ataqueUsuario();
            switch (escolhaAtaque) {
                case 1:
                    System.out.println("Usou o ataque leve");
                    poluidor.recebeDano(jogador.ataqueLeve(10));
                    break;
                case 2:
                    System.out.println("Usou o ataque pesado");
                    poluidor.recebeDano(jogador.ataquePesado(10));
                    break;
                case 3:
                    System.out.println("Usou o aumentar defesa");
                    jogador.sugarVida(0);
                    break;
                case 4:
                    System.out.println("Usou o aumentar ataque");
                    poluidor.recebeDano(jogador.ataqueLeve(5) + jogador.aumentarForca(5));
                    break;
                default:
                    System.out.println("Opção Invalida");
                    break;
            }
            if (poluidor.getVida() > 0) {
                escolhaAtaque = ataqueComputador();
                switch (escolhaAtaque) {
                    case 1:
                        System.out.println("Patrao usou ataque normal");
                        jogador.recebeAtaque(poluidor.ataqueNormal(12));
                        break;
                    case 2:
                        System.out.println("O Poluidor usou o ataque Forte");
                        jogador.recebeAtaque(poluidor.ataqueNormal(12));
                        break;
                }
            } else {
                System.out.println("O Poluidor foi derrotado");

            }
        }
    }

    public static void iniciaBatalha() {
        while (poluidor.getVida() > 0) {
            System.out.println("O combate contra o Poluidor começou");
            batalha();
            restauraVida();

        }
    }
}
