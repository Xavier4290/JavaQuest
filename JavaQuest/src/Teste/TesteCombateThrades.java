package Teste;

import java.util.Scanner;

import Classes.Cavaleiro;
import Classes.Jogador;

public class TesteCombateThrades extends Jogador implements Runnable {

	private int ataques;

    public TesteCombateThrades() {}

    public TesteCombateThrades(int ataques) {
        super(); // chama o construtor padrão da classe Jogador
        this.ataques = ataques;
    }

    public TesteCombateThrades(Scanner scanner) {
        super(); // chama o construtor padrão da classe Jogador
        this.ataques = scanner.nextInt();

        if (this.ataques == 1) {
            new Thread(this::ataqueRapido).start();
        } else {
            new Thread(this::ataquePesado).start();
        }
    }

    @Override
    public void run() {
        Jogador jogador = new Cavaleiro();

        try {
            for (int i = 0; i < this.ataques; i++) {
                System.out.println(jogador.atacar());
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("O combate terminou");
    }
}