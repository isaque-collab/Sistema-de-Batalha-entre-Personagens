package POO.Projetos.Sistema_De_Batalha_Entre_Personagens.interfaces;

public interface Combatente {

   int atacar();

   int defender();

   void receberDano(int dano);

   boolean estaVivo();

   void exibirDados();
}
