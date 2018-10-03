package decorator;

public class Decorator {


    public static void main(String[] args) {
        Personagem m = new Mago();
        Personagem g = new Guerreiro();
        
        
        System.out.println("Novo heroi: "+m.getNome());
        System.out.println("Ele pode :");
        m = new Magia(m);
        m = new Voar(m);
        
        System.out.println("Novo heroi: "+g.getNome());
        System.out.println("Ele pode :");
        g = new Escudo(g);
        g = new Correr(g);
    }
    
}
