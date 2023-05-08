package Fases;

import Classes.Bixo;

public class Mapa {
    int[] Bixos = {};
    public static String get_mapa(int x, int y){
        String str_mapa = "";
        for(int i_coluna = 0; i_coluna < 5; i_coluna++){
            String linha = "";
            for(int i_row = 0; i_row < 5; i_row++){
                if(i_coluna == y && i_row == x){
                    linha = linha+"x";
                    continue;
                } else {
                    linha = linha+"-";
                    continue;
                }
            }
            linha = linha+"\n";
            str_mapa = str_mapa+linha;
        }
        return str_mapa;
    }
    public void spawna_bixo(int x, int y){
        Bixos[Bixos.length+1] = x;
    }
}