package Sistema_De_Combate;

import java.util.Random;
import java.util.Scanner;

import Classes.Jogador;
import Inimigos.Patrao;

public class Combate_Patrao {

    static Jogador jogador = new Jogador();
    static Patrao chefePatrao = new Patrao();

    static int ataqueUsuario() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Escolha o ataque");
        System.out.println("1 - Ataque de fogo");
        System.out.println("2 - Ataque de água");
        System.out.println("3 - Cura da terra");
        System.out.println("4 - Lamina de vento");
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
        return gerador.nextInt(4) + 1;
    }

    static void mostrarVida(int patrao, int player) {
        System.out.println("=========================");
        System.out.println("Patrão " + chefePatrao.getVida());
        System.out.println("Usuario " + jogador.getVida());
        System.out.println("=========================");
    }

    static void batalha() {
        int escolhaAtaque = 0;

        while (jogador.getVida() > 0 && chefePatrao.getVida() > 0) {
            mostrarVida(chefePatrao.getVida(), jogador.getVida());
            escolhaAtaque = ataqueUsuario();
            switch (escolhaAtaque) {
                case 1:
                    System.out.println("Usou o ataque de fogo");
                    chefePatrao.recebeDano(jogador.ataqueDeFogo(10));
                    break;
                case 2:
                    System.out.println("Usou ataque de água");
                    chefePatrao.recebeDano(jogador.ataquePesado(10));
                    break;
                case 3:
                    System.out.println("Usou cura da terra");
                    jogador.regenDaTerra(0);
                    break;
                case 4:
                    System.out.println("Usou lamina de vento");
                    chefePatrao.recebeDano(jogador.laminasDeVento(10));
                    break;
                default:
                    System.out.println("Opção Invalida");
                    break;
            }
            if (chefePatrao.getVida() > 0) {
                escolhaAtaque = ataqueComputador();
                switch (escolhaAtaque) {
                    case 1:
                        System.out.println("Patrão usou ataque normal");
                        jogador.recebeAtaque(chefePatrao.ataqueNormal(10));
                        break;
                    case 2:
                        System.out.println("Patrão usou o ataque Forte");
                        jogador.recebeAtaque(chefePatrao.ataqueNormal(10));
                        break;
                    case 3:
                        System.out.println("Patrão usou regenerar vida");
                        chefePatrao.regeneraVida(0);
                        break;
                    case 4:
                        System.out.println("Patrão usou furia");
                        chefePatrao.aumentoForca(0);
                        break;
                }
            } else {
                System.out.println("O Patrão foi derrotado, Fim do jogo");

            }
        }
    }

    public static void iniciaBatalha() {
        while (chefePatrao.getVida() > 0) {
            System.out.println("O combate conta o Patrão começou");
            batalha();
            restauraVida();

        }
    }

}
