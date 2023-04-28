package Classes;

public class Bixo {
    int vida = 100;
    int escudo = 0;
    int dano = 15;
    String nome = "Bixo do buxo solto";

    public void Apanha(int dano){
        vida = vida-dano;
        return;
    }
}
