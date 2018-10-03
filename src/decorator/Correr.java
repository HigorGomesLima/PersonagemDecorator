package decorator;

public class Correr extends Habilidade{
    
    public Correr(Personagem p){
        super(p);
        adicionarHabilidade();
    }

    @Override
    public void adicionarHabilidade() {
        pessoa.habilidades += "correr, ";
        System.out.println("Correr -");
    }
}
