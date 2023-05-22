package Inimigos;

public class Patrao {
    private int vida = 125;
    private int dano = 12;

    public Patrao() {
        System.out.println("Patrão só pode levar dano se você acerta algo quente nele");
    }

    public void recebeDano(int dano) {
        this.vida = vida - dano;
        System.out.println("Patrão Levou dano");
        return;
    }

    public int ataqueNormal(int dano) {
        return this.dano = 12;
    }

    public int ataqueForte(int ataque) {
        return this.dano += 7;
    }

    public void regeneraVida(int buff) {
        if (this.vida < 100) {
            this.vida += 15;
        }
        this.vida += 0;
    }

    // Aumenta 15% do dano
    public void aumentoForca(int buff) {
        this.dano *= 1.8;
    }

    public void setVida(int cura) {
        this.vida += cura;
    }

    public int getVida() {
        return this.vida;
    }
}