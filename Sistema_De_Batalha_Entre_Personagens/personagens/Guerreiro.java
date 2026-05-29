package POO.Projetos.Sistema_De_Batalha_Entre_Personagens.personagens;

public class Guerreiro extends Personagem {
    private int forca;

    public Guerreiro(String nome, double vida, double vidaMaxima, double defesaBase, int forca) {
        super(nome, vida, vidaMaxima, defesaBase);
        this.forca = forca;
    }

    @Override
    public int atacar() {
        return forca * 2;
    }

    @Override
    public int defender() {
        return (int) (defesaBase*2);
    }


}
