package Fases;

import java.util.Random;
import java.util.Scanner;

import Classes.Jogador;
import Inimigos.Gerentes;
import Inimigos.Poluidor;
import Sistema_De_Combate.Combate_Gerente;
import Sistema_De_Combate.Combate_Gerente2;
import Sistema_De_Combate.Combate_Patrao;
import Sistema_De_Combate.Combate_Poluidor;
import Sistema_De_Combate.Combate_Poluidor2;

public class Mapa {

    static Jogador jogador = new Jogador();

    public static String get_mapa(int x, int y) {
        String str_mapa = "";
        for (int i_coluna = 0; i_coluna < 10; i_coluna++) {
            String linha = "";
            for (int i_row = 0; i_row < 6; i_row++) {
                if (i_coluna == y && i_row == x) {
                    linha = linha + "x";
                    continue;
                } else {
                    linha = linha + "-";
                    continue;
                }

            }
            linha = linha + "\n";
            str_mapa = str_mapa + linha;

            if (y == 0 && x == 3) {
                Combate_Poluidor combate_poluidor1 = new Combate_Poluidor();
                combate_poluidor1.iniciaBatalha();
                break;
            }
            if (y == 4 && x > 0) {
                Combate_Gerente combate_gerente1 = new Combate_Gerente();
                combate_gerente1.iniciaBatalha();
                break;
            }
            if (y == 5 && x == 3) {
                Combate_Poluidor2 combate_poluidor2 = new Combate_Poluidor2();
                combate_poluidor2.iniciaBatalha();
                break;
            }
            if (y == 6 && x == 0) {
                Combate_Gerente2 combate_gerente2 = new Combate_Gerente2();
                combate_gerente2.iniciaBatalha();
                break;
            }
            if (y == 9 && x >= 0) {
                Combate_Patrao combate_patrao1 = new Combate_Patrao();
                combate_patrao1.iniciaBatalha();
                break;
            }
        }

        return str_mapa;
    }

}