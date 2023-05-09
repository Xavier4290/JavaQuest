package Classes;

import java.util.Scanner;

public class Jogador{
	protected int moeda;
	private Scanner nome;
	private int vida;
	private int armadura;
	private int stamina;
	private int dano;
    public String nome_classe;

	
	public Jogador() {
		
	}
	public Jogador(String nome) {
		
	}
	public void nome_classe(){
		this.nome_classe = nome_classe;
	}
	public Jogador(Scanner nome) {
		this.nome = nome;
	}
	public Scanner getNome() {
		return  this.nome;
	}

	public void recebeAtaque(int dano) {
		this.vida -= dano;
	}
	public void  getMoeda() {
		System.out.println("Moedas: "+this.moeda);
	}
	//Metodos que estão sendo herdados pelas classe, Cavaleiro,Mago,Ladino
	public void mostrarNome(String nome) {
		System.out.println("Bem-Vindo " +nome);	
	}
	public void mostrarAtri() {
		System.out.println("Vida: "+this.vida +"\n"
				+"Armadura: "+this.armadura+"\n"
				+"Stamina: " +this.stamina+"\n"
				+"Dano: "+this.dano+"\n");
	}
	
	// metodos que a classe Cavaleiro herdará
	//Ataques e buffs da classe Cavaleiro
	public int ataqueLeve(int ataque) {
		this.stamina -= 5;
		return this.dano = 10;
	}
	
	public int ataquePesado(int ataque) {
		this.stamina -= 15;
		return this.dano *= 1.2;
	}
	
	public void aumentarDefesa(int buff) {
		this.stamina -= 15;
		this.vida -= 15;
		this.armadura += 10;
	}
	// aumenta 35% do dano da classe
	public int aumentarForca(int buff) {
		this.stamina -= 20;
		return this.dano *= 1.5;
	}
	
	//metodos que a classe Mago herdará
	public void magiaRapida() {
		this.stamina -= 9;
	}
	// magiaPesada da 40% de dano a mais que a magia rapida
	public void magiaPesada() {
		this.stamina -= 15;
		this.dano *= 1.4;
	}
	public void Curar() {
		this.stamina -= 20;
		this.vida += 10;
	}
	//metodos que a classe Ladino herdará
	public void Corte() {
		this.stamina -= 12;
	}
	//O ataque corteProfundo tem 100% a mais de dano do que o ataque corte
	public void corteProfundo() {
		this.stamina -= 18;
		this.dano *= 2;
	}
	public void recuperarStamina() {
		this.vida -= 20;
		this.stamina += 30;
	}

	public int getVida() {
		return this.vida;
	}
	
	public void setVida(int vida) {
		 this.vida += vida;
	}
		
}
	
