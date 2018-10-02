package decorator;

public class Magia extends Habilidade{
    
    Personagem pessoa;
    
    public Magia(Personagem p){
        pessoa = p;
        adicionarHabilidade();
        adicionarforca();
    }

    @Override
    public void adicionarHabilidade() {
        pessoa.habilidades += "magia, ";
    }

    @Override
    public void adicionarforca() {
        pessoa.forca += 10;
    }
    
}
