package decorator;


public abstract class Personagem {
    protected String habilidades;
    protected int forca;
    protected String nome;
    
    public String getNome(){
        return nome;
    }
    
    public void showHabilidades(){
        System.out.println(habilidades);
    }
    public void showForca(){
        System.out.println("Forca: "+forca);
    }
    public abstract void adicionarforca();
}
