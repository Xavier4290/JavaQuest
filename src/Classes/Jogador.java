package Classes;

import java.util.Scanner;

public class Jogador {
	private Scanner nome;
	private int vida = 100;
	private int dano;
	public String nome_classe;

	public Jogador() {

	}

	public Jogador(String nome) {

	}

	public void nome_classe() {
		this.nome_classe = nome_classe;
	}

	public Jogador(Scanner nome) {
		this.nome = nome;
	}

	public Scanner getNome() {
		return this.nome;
	}

	public void recebeAtaque(int dano) {
		this.vida -= dano;
	}

	// Metodos que estão sendo herdados pelas classe, Cavaleiro,Mago,Ladino
	public void mostrarNome(String nome) {
		System.out.println("Bem-Vindo " + nome);
	}

	// metodos que a classe Cavaleiro herdará
	// Ataques e buffs da classe Cavaleiro, Mago, Ladino
	public int ataqueLeve(int ataque) {
		return this.dano = 10;
	}

	public int ataquePesado(int ataque) {
		return this.dano *= 1.2;
	}

	// Se a vida for maior que 100, não restaura vida
	public void sugarVida(int buff) {
		if (this.vida < 100) {
			this.vida += 15;
		}else{
			this.vida += 0;
		}
	}

	// aumenta 35% do dano da classe
	public int aumentarForca(int buff) {
		return this.dano *= 1.5;
	}

	public int getVida() {
		return this.vida;
	}

	public void setVida(int vida) {
		this.vida += vida;
	}

	// Metodos usandos na ultima luta
	public int ataqueDeFogo(int ataque) {
		return this.dano = 14;
	}

	public int ataqueDeAgua(int ataque) {
		return this.dano *= 1.5;
	}

	public void regenDaTerra(int buff) {
		if (this.vida < 100) {
			this.vida += 25;
		}else{
			this.vida += 0;
		}
		
	}

	public int laminasDeVento(int ataque) {
		return this.dano *= 1.5;
	}
}
