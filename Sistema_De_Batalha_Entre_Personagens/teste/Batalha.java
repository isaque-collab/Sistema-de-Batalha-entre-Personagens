package POO.Projetos.Sistema_De_Batalha_Entre_Personagens.teste;

import POO.Projetos.Sistema_De_Batalha_Entre_Personagens.interfaces.Combatente;
import POO.Projetos.Sistema_De_Batalha_Entre_Personagens.personagens.Arqueiro;
import POO.Projetos.Sistema_De_Batalha_Entre_Personagens.personagens.Guerreiro;
import POO.Projetos.Sistema_De_Batalha_Entre_Personagens.personagens.Mago;
import POO.Projetos.Sistema_De_Batalha_Entre_Personagens.personagens.Personagem;

import java.util.ArrayList;
import java.util.List;
public class Batalha {
    public static void main(String[] args) {

        List <Combatente> personagens = new ArrayList<>();
        personagens.add(new Guerreiro("Thor", 1000, 5000, 20, 50));
        personagens.add(new Mago("Merlin", 500, 1000, 10, 100));
        personagens.add(new Arqueiro("Arqueiro Verde", 600, 1500, 10, 70));
        personagens.add(new Arqueiro("Arqueiro Azul", 600, 1500, 10, 50));

        simularRodada((Personagem) personagens.get(0), (Personagem) personagens.get(1));
        simularRodada((Personagem) personagens.get(2), (Personagem) personagens.get(3));
    }

    public static void simularRodada(Personagem jogador1, Personagem jogador2){

        int rodada = 1;

        System.out.println("====================================");
        System.out.println("⚔ "+ jogador1.getNome()+" VS "+jogador2.getNome());
        System.out.println("====================================");

        while (jogador1.estaVivo() && jogador2.estaVivo()) {

            System.out.println("\n========= RODADA " + rodada + " =========");



            System.out.println(jogador1.getNome()+" está atacando...");

            int danoAtaque1 = jogador1.atacar();
            int defesa2 = jogador2.defender();

            int danoFinal1 = danoAtaque1 - defesa2;

            if (danoFinal1 < 0) {
                danoFinal1 = 0;
            }

            System.out.println("Dano de ataque: " + danoAtaque1);
            System.out.println("Defesa do "+jogador2.getNome()+": " + defesa2);
            System.out.println("Dano final: " + danoFinal1);

            jogador2.receberDano(danoFinal1);

            System.out.println("\nStatus do "+jogador2.getNome()+":");
            jogador2.exibirDados();


            if (!jogador2.estaVivo()) {

                System.out.println(jogador1.getNome()+" Venceu a batalha!");
                break;
            }


            System.out.println("\n"+jogador2.getNome()+" está atacando...");

            int danoAtaque2 = jogador2.atacar();
            int defesa1 = jogador1.defender();

            int danoFinal2 = danoAtaque2 - defesa1;

            if (danoFinal2 < 0) {
                danoFinal2 = 0;
            }

            System.out.println("Dano de ataque: " + danoAtaque2);
            System.out.println("Defesa do "+jogador1.getNome()+": " + defesa1);
            System.out.println("Dano final: " + danoFinal2);

            jogador1.receberDano(danoFinal2);

            System.out.println("\nStatus do "+jogador1.getNome()+":");
            jogador1.exibirDados();

            if (!jogador1.estaVivo()) {

                System.out.println(jogador2.getNome()+" venceu a batalha!");
                break;
            }

            rodada++;

            System.out.println("\n------------------------------------");
        }

        System.out.println("\n========== FIM DA BATALHA ==========");
    }
}
