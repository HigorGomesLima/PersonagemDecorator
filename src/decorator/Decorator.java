package decorator;

public class Decorator {


    public static void main(String[] args) {
        Personagem m = new Mago();
        Personagem g = new Guerreiro();
        
        
        System.out.println("Novo heroi: "+m.getNome());
        m = new Magia(m);
        m = new Voar(m);
        System.out.println("Ele pode :");
        m.showHabilidades();
        System.out.println("E tem de forca ");
        m.showForca();
        
        System.out.println("Novo heroi: "+g.getNome());
        g = new Escudo(g);
        g = new Correr(g);
        System.out.println("Ele pode :");
        g.showHabilidades();
        System.out.println("E tem de forca ");
        g.showForca();
    }
    
}
