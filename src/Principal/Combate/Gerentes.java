package Principal.Combate;

public class Gerentes {
    private int vida = 100;
    private int dano = 10;

    public Gerentes(){

    }

    public int getVida(){
        return this.vida;
    }

    public void setVida(int cura){
        this.vida += cura;
    }

    public int recebeDano(){
        return this.vida -= dano;
    }

    public int recebeDano(int dano){
        return this.vida -= dano;
    }

    public int ataqueNormal(int dano){
        return this.dano;
    }
    
    public int ataqueForte(int ataque){
        return this.dano += 7;
    }

    public void regeneraVida(){
        this.vida += 15;
    }

    public void regeneraVida(int buff){
        if(this.vida < 100){
            this.vida += 15;
        }
            this.vida += 0;    
    }

    public void furia(){
         this.dano *= 1.2;
    }

    public void furia(int buff){
        this.dano *= 1.2;
    }
}
