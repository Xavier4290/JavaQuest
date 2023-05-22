package Inimigos;

//Essa classe é o homem branco sitado na história
public class Poluidor {
    private int vida = 100;
    private int dano = 7;
    String nome = "Bixo do buxo solto";

    public void recebeDano(int dano) {
        this.vida = vida - dano;
        System.out.println("aiaiaiaii...");
        return;
    }

    public int ataqueNormal(int dano) {
        return this.dano;
    }

    public int ataqueForte(int ataque) {
        return this.dano += 7;
    }
    public void setVida(int cura) {
        this.vida += cura;
    }

    public int getVida() {
        return this.vida;
    }
}
