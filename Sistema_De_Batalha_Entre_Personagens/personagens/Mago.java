package POO.Projetos.Sistema_De_Batalha_Entre_Personagens.personagens;

public class Mago extends Personagem{
    private int poderMagico;



    public Mago(String nome, double vida, double vidaMaxima, double defesaBase, int poderMagico) {
        super(nome, vida, vidaMaxima, defesaBase);
        this.poderMagico = poderMagico;
    }

    @Override
    public int atacar() {
        return poderMagico * 5;
    }

    @Override
    public int defender() {
        return (int) (defesaBase/2);
    }
}
