package Inimigos;

public class Gerentes {
    private int vida = 100;
    private int dano = 10;

    public Gerentes() {

    }

    public int getVida() {
        return this.vida;
    }

    public void setVida(int cura) {
        this.vida += cura;
    }

    public void recebeDano(int dano) {
        this.vida = vida - dano;
        System.out.println("Gerente levou dano");
        return;
    }

    public int ataqueNormal(int dano) {
        return this.dano;
    }

    public int ataqueForte(int ataque) {
        return this.dano += 7;
    }

    public void regeneraVida() {
        this.vida += 15;
    }

    //Quando a vida for menor que 100, restaura 15 ponto de vida
    public void regeneraVida(int buff) {
        if (this.vida < 100) {
            this.vida += 15;
        }
        this.vida += 0;
    }

    // aumenta 12% do dano
    public void furia() {
        this.dano *= 1.2;
    }

    public void furia(int buff) {
        this.dano *= 1.2;
    }
}
