package Classes;

import java.util.Scanner;

public class Ladino extends Jogador{
	
	private int vida = 85;
	private int armadura = 80;
	private int stamina = 120;
	private int dano = 8;
	
	public Ladino() {
	
	}
	public Ladino(Scanner nome) {
		super(nome);
	}
	
	@Override
	public void mostrarAtri() {
		System.out.println("Vida: "+this.vida +"\n"
				+"Armadura: "+this.armadura+"\n"
				+"Stamina: " +this.stamina+"\n"
				+"Dano: "+this.dano+"\n");
	}

}
