package Classes;

import java.util.Scanner;

public class Mago extends Jogador{

	private int vida = 80;
	private int armadura = 80;
	private int stamina = 90;
	private int dano = 16;
	private String nome_classe = "mago";

	public Mago() {
		
	}
	public Mago(Scanner nome) {
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
