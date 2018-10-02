package decorator;


public class Mago extends Personagem{
    
    public Mago(){
        super.nome = "Mago";
        super.habilidades = new String();
        super.forca = 0;
    }

    public void adicionarforca() {
        super.forca += 10;
    }
}
