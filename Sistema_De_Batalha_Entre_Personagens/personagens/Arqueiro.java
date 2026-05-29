package POO.Projetos.Sistema_De_Batalha_Entre_Personagens.personagens;

public class Arqueiro extends Personagem {

    private int precisao;

    public Arqueiro(String nome, double vida, double vidaMaxima, double defesaBase,  int precisao) {
        super(nome, vida, vidaMaxima, defesaBase);
        this.precisao = precisao;
    }

    @Override
    public int atacar() {
        int danoBase = 30;
        if(Math.random()*100 < precisao){
            System.out.println("ACERTO CRÍTICO!");
            return danoBase*5;
        }
        return danoBase;
    }

    @Override
    public int defender() {
        return (int) defesaBase;
    }
}
