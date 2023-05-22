package Fases;

import java.util.Scanner;

public class Movimento_Personagem{
		public static int x = 0, y = 0;
		public void Andador(){
			String tecla_pressionada = (new Scanner(System.in)).nextLine().toUpperCase();
			switch(tecla_pressionada){
				case "W":
					if(y < 0 || y > 10){
						y = 1;
					} else {
						y--;
					}
					break;
				case "A":
					if(x < 0 || x > 5){
						x = 1;
					} else {
						x--;
					}
					break;
				case "S":
					if(y < 0 || y > 10){
						y = 1;
					} else {
						y++;
					}
					break;
				case "D":
					if(x < 0 || x > 5){
						x = 1;
					} else {
						x++;
					}
					break;
				default:
					break;
			}
			System.out.println((new Fases.Mapa()).get_mapa(x, y));
			Andador();
		}

}	
	
