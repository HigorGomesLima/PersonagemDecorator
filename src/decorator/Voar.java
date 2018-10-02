package decorator;

public class Voar extends Habilidade{
    
    Personagem pessoa;
    
    public Voar(Personagem p){
        pessoa = p;
        adicionarHabilidade();
        adicionarforca();
    }

    @Override
    public void adicionarHabilidade() {
        pessoa.habilidades += "voar, ";
    }

    @Override
    public void adicionarforca() {
        pessoa.forca += 2;
    }
}
