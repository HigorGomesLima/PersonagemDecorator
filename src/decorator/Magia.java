package decorator;

public class Magia extends Habilidade{
    
    public Magia(Personagem p){
        super(p);
        adicionarHabilidade();
    }

    @Override
    public void adicionarHabilidade() {
        pessoa.habilidades += "magia, ";
        System.out.println("Magia - ");
    }
    
}
