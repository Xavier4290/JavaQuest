package Classes;

import java.util.Scanner;

public class Cavaleiro extends Jogador {
	private Scanner nome;
	private int vida = 100;
	private int dano = 10;
	private String nome_classe = "cavaleiro";

	public Cavaleiro() {

	}

	public Cavaleiro(Scanner nome) {
		this.nome = nome;
	}

	public String getNomeClasse() {
		return this.nome_classe;
	}

	public void nome_classe() {
		this.nome_classe = nome_classe;
	}

	@Override
	public void mostrarNome(String nome) {
		System.out.println("Bem-Vindo " + nome);
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
