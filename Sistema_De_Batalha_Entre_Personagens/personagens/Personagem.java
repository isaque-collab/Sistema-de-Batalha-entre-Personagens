package POO.Projetos.Sistema_De_Batalha_Entre_Personagens.personagens;

import POO.Projetos.Sistema_De_Batalha_Entre_Personagens.interfaces.Combatente;

public abstract class Personagem implements Combatente {
    protected String nome;
    protected double vida;
    protected double vidaMaxima;
    protected double defesaBase;

    public Personagem(String nome, double vida, double vidaMaxima, double defesaBase) {
        this.nome = nome;
        this.vida = vida;
        this.vidaMaxima = vidaMaxima;
        this.defesaBase = defesaBase;
    }


    public abstract int atacar();
    public abstract int defender();

    public String getNome() {
        return nome;
    }
    public void receberDano(int dano) {
        this.vida -= dano;
        if (vida<0) {
            vida = 0;
        }
        System.out.println("Dano recebido: "+dano);
        System.out.println("Vida restante: "+vida);
    }

    public boolean estaVivo() {
       return this.vida > 0;
    }

    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
        System.out.println("Defesa base: " + defesaBase);
    }


}
