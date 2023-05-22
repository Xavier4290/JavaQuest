package Classes;

import java.util.Scanner;

public class Ladino extends Jogador {

	private int vida = 85;
	private int armadura = 80;
	private int stamina = 120;
	private int dano = 8;
	private String nome_classe = "ladino";

	public Ladino() {

	}

	public Ladino(Scanner nome) {
		super(nome);
	}

	@Override
	public int ataqueLeve(int ataque) {
		this.stamina -= 5;
		return this.dano = 10;
	}

	@Override
	public int ataquePesado(int ataque) {
		this.stamina -= 15;
		return this.dano *= 1.2;
	}

	@Override
	public void sugarVida(int buff) {
		this.dano = 10;
		this.vida += 15;
	}

	// aumenta 35% do dano da classe
	@Override
	public int aumentarForca(int buff) {
		return this.dano *= 1.5;
	}

}
