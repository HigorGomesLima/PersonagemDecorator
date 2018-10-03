package decorator;

public class Escudo extends Habilidade{
    
    public Escudo(Personagem p){
        super(p);
        adicionarHabilidade();
    }

    @Override
    public void adicionarHabilidade() {
        pessoa.habilidades += "escudo, ";
        System.out.println("Escudo -");
    }

    
}
