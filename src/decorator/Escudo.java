package decorator;

public class Escudo extends Habilidade{

    Personagem pessoa;
    
    public Escudo(Personagem p){
        pessoa = p;
        adicionarHabilidade();
        adicionarforca();
    }

    @Override
    public void adicionarHabilidade() {
        pessoa.habilidades += "escudo, ";
    }

    @Override
    public void adicionarforca() {
        pessoa.forca += 5;
    }
    
}
