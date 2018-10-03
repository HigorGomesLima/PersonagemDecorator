package decorator;

public class Voar extends Habilidade{
    
    public Voar(Personagem p){
        super(p);
        adicionarHabilidade();
    }

    @Override
    public void adicionarHabilidade() {
        pessoa.habilidades += "voar, ";
        System.out.println("Voar -");
    }
}
