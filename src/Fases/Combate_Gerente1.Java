public class Combate_Gerente1{
    static Jogador jogador = new Jogador();
    static Gerentes g1 = new Gerentes();

	static int ataqueUsuario(){
		Scanner leitor = new Scanner(System.in);
		System.out.println("Escolha o ataque");
		System.out.println("1 - Ataque leve");
		System.out.println("2 - Ataque pesado");
		System.out.println("3 - Aumento na armadura");
		System.out.println("4 - Aumento de ataque");
		return leitor.nextInt();
	}

    static void restauraVida() {
		if(jogador.getVida() < 100) {
			jogador.setVida(20);
		}else {
			jogador.setVida(0);
		}
	}

    static int ataqueComputador() {
		Random gerador = new Random();
		// retorna o numero de ataques entre 1 a 4
		return gerador.nextInt(4) + 1; 
	}

    static void mostrarVida() {
		System.out.println("=========================");
		System.out.println("Maquina "+g1.getVida());
		System.out.println("Usuario "+jogador.getVida());
		System.out.println("=========================");
	}

    static void batalha(){
        int escolhaAtaque = 0;


        while(jogador.getVida() > 0 && g1.getVida() > 0) {
			mostrarVida(hpComputador, jogador.getVida());
			escolhaAtaque = ataqueUsuario();

            switch(escolhaAtaque) {
                case 1:
                    System.out.println("Usou o ataque leve");
                    hpComputador -= jogador.ataqueLeve(10);
                    break;
                case 2:
                    System.out.println("Usou o ataque pesado");
                    hpComputador -= jogador.ataquePesado(10);
                    break;
                case 3:
                    System.out.println("Usou o aumentar defesa");
                    jogador.aumentarDefesa(15);
                    break;
                case 4:
                    System.out.println("Usou o aumentar ataque");
                    hpComputador -= jogador.ataqueLeve(5) + jogador.aumentarForca(5);
                    break;
                default:
                    System.out.println("Opção Invalida");
                    break;
                    
                }
                if(jogador.getVida() == 0){
                    System.out.println("Jogador morreu")
                }
                
                if(g1.getVida > 0) {
                    escolhaAtaque = ataqueComputador();
                    switch(escolhaAtaque) {
                    case 1:
                        System.out.println("Gerente usou ataque normal");
                        g1.ataqueNormal();
                        jogador.recebeAtaque() = g1.ataqueNormal();
                        break;
                    case 2:
                        System.out.println("Gerente usou o ataque Forta");
                        jogador.recebeAtaque() = g1.ataqueForte();
                        break;
                    case 3:
                        System.out.println("Gerente usou regenerar vida");
                        g1.regeneraVida();
                        break;
                    case 4:
                        System.out.println("Gerente usou furia");
                        g1.furia;
                        break;
                    }
                }
                else {
                    System.out.println("O inimigo foi derrotado");
    
                }
                public static void main(String[] args) {
                    Scanner continuar_jogo = new Scanner(System.in);
                    int continua = 1;
            
                    while(continua == 1) {
                        System.out.println("Deseja Continuar (1 - Sim / 0 - Não)");
                        continua = continuar_jogo.nextInt();
                        //esta chamando o metodo restaurar vida
                        batalha();
                        //esta chamando o metodo batalha
                        restauraVida();
                        
                    }
                }
            }
        }
}