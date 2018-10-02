package decorator;

public class Guerreiro extends Personagem{
    
    public Guerreiro(){
        super.nome = "Guerreiro";
    }

    @Override
    public void adicionarforca() {
        super.forca += 20;
    }
}
