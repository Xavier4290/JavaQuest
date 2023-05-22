package Classes;

import java.util.Scanner;

public class Mago extends Jogador {

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

	// Ataques e buffs da classe Cavaleiro
	@Override
	public int ataqueLeve(int ataque) {
		return this.dano = 10;
	}

	@Override
	public int ataquePesado(int ataque) {
		return this.dano *= 1.2;
	}

	@Override
	// aumenta 35% do dano da classe
	public int aumentarForca(int buff) {
		return this.dano *= 1.5;
	}

	@Override
	public void sugarVida(int buff) {
		this.dano = 10;
		this.vida += 15;
	}

}
