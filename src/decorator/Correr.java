package decorator;

public class Correr extends Habilidade{
    Personagem pessoa;
    
    public Correr(Personagem p){
        pessoa = p;
        adicionarHabilidade();
        adicionarforca();
    }

    @Override
    public void adicionarHabilidade() {
        pessoa.habilidades += "correr, ";
    }

    @Override
    public void adicionarforca() {
        pessoa.forca += 5;
    }
}
