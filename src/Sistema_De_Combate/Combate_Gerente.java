package Sistema_De_Combate;

import java.util.Random;
import java.util.Scanner;

import Classes.Jogador;
import Inimigos.Gerentes;

public class Combate_Gerente {
    static Jogador jogador = new Jogador();
    static Gerentes g1 = new Gerentes();

    public Combate_Gerente() {

    }

    static int ataqueUsuario() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Escolha o ataque");
        System.out.println("1 - Ataque leve");
        System.out.println("2 - Ataque pesado");
        System.out.println("3 - Sugar vida");
        System.out.println("4 - Aumento de ataque");
        return leitor.nextInt();
    }

    // Quando o jogador vencer a batalha é acrescentado mais 20 pontos de vida
    static void restauraVida() {
        if (jogador.getVida() < 100) {
            jogador.setVida(20);
        } else {
            jogador.setVida(0);
        }
    }

    // Ataque do computador
    static int ataqueComputador() {
        Random gerador = new Random();
        // retorna o numero de ataques entre 1 a 4
        return gerador.nextInt(4) + 1;
    }

    // Vai mostrar a vida do mob e do Usuario mais os atributos do usuario
    static void mostrarVida(int gerente, int player) {
        System.out.println("=========================");
        System.out.println("Gerente " + g1.getVida());
        System.out.println("Usuario " + jogador.getVida());
        System.out.println("=========================");
    }

    // Sistema de batalha
    static void batalha() {
        int escolhaAtaque = 0;

        // A batalha iniciara quando a vida do player e do Gerente for maior que 0
        while (jogador.getVida() > 0 && g1.getVida() > 0) {
            mostrarVida(g1.getVida(), jogador.getVida());
            // Ataque do Usuario
            escolhaAtaque = ataqueUsuario();
            switch (escolhaAtaque) {
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
                    jogador.sugarVida(0);
                    break;
                case 4:
                    System.out.println("Usou o aumentar ataque");
                    g1.recebeDano(jogador.ataqueLeve(5) + jogador.aumentarForca(5));
                    break;
                default:
                    System.out.println("Opção Invalida");
                    break;
            }
            // Ataque do mob
            if (g1.getVida() > 0) {
                escolhaAtaque = ataqueComputador();
                switch (escolhaAtaque) {
                    case 1:
                        System.out.println("Patrao usou ataque normal");
                        jogador.recebeAtaque(g1.ataqueNormal(12));
                        break;
                    case 2:
                        System.out.println("Gerente usou o ataque Forte");
                        jogador.recebeAtaque(g1.ataqueNormal(12));
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
            } else {
                System.out.println("O gerente foi derrotado");
                System.out.println("\n Você entrou na 2ª parte do mapa");
                System.out.println("\n Continue proseguindo para a 3ª parte do mapa");
            }
        }
    }

    public static void iniciaBatalha() {
        //O combate será finalizando quando a vida do gerente for igual a zero
        while (g1.getVida() > 0) {
            System.out.println("O combate contra o Gerente começou ");
            // esta chamando o metodo restaurar vida
            batalha();
            // esta chamando o metodo batalha
            restauraVida();

        }
    }
}

