package Fases;

import java.util.Scanner;

import Classes.Cavaleiro;
import Principal.Program;
import Classes.Jogador;
import Classes.Ladino;
import Classes.Mago;
public class MovimentoP extends Program{
	
	    public int i = 0, j = 0;
	    public int[][] map = new int[5][5];
	    
	    public static void Andar() {
	        Scanner sc = new Scanner(System.in);
	        MovimentoP mp = new MovimentoP();
	        while (true) {
	            System.out.println("-----------------------\n" + "Aperte W para subir \n" + "Aperte S para ir descer \n"
	                    + "Aperte A para ir a esquerda \n" + "Aperte D para ir a direita \n" + "-----------------------");
	            String a = sc.nextLine();
	            if (a.equalsIgnoreCase("w") && !a.equalsIgnoreCase("")) {
	                if (mp.i > -4) {
	                    mp.i--;
	                    System.out.println("Personagem foi para cima. " + mp.i);
	                } else {
	                    System.out.println("Personagem não pode subir mais.");
	                }
	                if(mp.i == -2) {
	                	System.out.println();
	                	
	                }

	            }
	            // Move o personagem para baixo
	            if (a.equalsIgnoreCase("s") && !a.equalsIgnoreCase("")) {
	                if (mp.i < 4) {
	                    mp.i++;
	                    System.out.println("Personagem foi para baixo " + mp.i);
	                } else {
	                    System.out.println("Personagem não pode descer mais.");
	                }
	            }
	            // Move o personagem para direita
	            if (a.equalsIgnoreCase("d") && !a.equalsIgnoreCase("")) {
	                if (mp.j < 4) {
	                    mp.j++;
	                    System.out.println("O personagem foi para direita: " + mp.j);
	                } else {
	                    System.out.println("Personagem não pode ir a direita.");
	                }
	            }
	            // Move o personagem para esquerda
	            if (a.equalsIgnoreCase("a") && !a.equalsIgnoreCase("")) {
	                if (mp.j > -4) {
	                    mp.j--;
	                    System.out.println("Personagem foi para esquerda: " + mp.j);
	                } else {
	                    System.out.println("Personagem não pode ir para esquerda.");
	                }
	            }

	            // System.out.print("["+i+"]");
	            // System.out.print("["+j+"]");
	        }
	    }
		
}	
	
