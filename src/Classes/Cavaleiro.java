package Classes;

import java.util.Scanner;

public class Cavaleiro extends Jogador{
	private Scanner nome;
	private int vida = 100;
	private int armadura = 100;
	private int stamina = 100;
	private int dano = 10;
	private String nome_classe = "cavaleiro";
	
	public Cavaleiro() {

	}
	
	public Cavaleiro(Scanner nome) {
			this.nome = nome;
	}
	public String getNomeClasse(){
		return this.nome_classe;
	}
	public void nome_classe(){
		this.nome_classe = nome_classe;
	}
	@Override
	public void mostrarAtri() {
		System.out.println("Vida: "+this.vida +"\n"
				+"Armadura: "+this.armadura+"\n"
				+"Stamina: " +this.stamina+"\n"
				+"Dano: "+this.dano+"\n");
	}
	@Override
	public void mostrarNome(String nome) {
		System.out.println("Bem-Vindo " +nome);
	}
	
	//Ataques e buffs da classe Cavaleiro
	public void ataqueRapido() {
		this.stamina -= 5;
	}
	//Ataque pesado é 20% mais forte que o ataque rapido
	public void ataquePesado() {
		this.stamina -= 10;
		this.dano *= 1.2;
	}
	@Override
	// aumenta 35% do dano da classe
	public void aumentarDano() {
		this.stamina -= 20;
		this.dano *= 1.5;
	}
	@Override
	public void aumentaDefesa() {
		this.stamina -= 15;
		this.vida -= 15;
		this.armadura += 10;
	}
	

}
