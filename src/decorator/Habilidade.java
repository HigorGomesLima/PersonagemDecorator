package decorator;

public abstract class Habilidade extends Personagem{
    protected Personagem pessoa;
    
    public Habilidade(Personagem p){
        pessoa = p;
    }
    
    public abstract void adicionarHabilidade();
    
}
