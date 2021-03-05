package main;

import dao.CampeonatoDao;
import dao.EquipeDao;
import dao.JogadorDao;
import dao.TecnicoDao;
import domain.Equipe;
import domain.Jogador;
import domain.Tecnico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Consultas {

    public static void main(String[] args) {

        //consultar a equipe pelo nome
        EquipeDao equipeDao = new EquipeDao();
        CampeonatoDao campeonatoDao = new CampeonatoDao();
        TecnicoDao tecnicoDao = new TecnicoDao();

        Equipe equipe = equipeDao.buscarEquipePeloNome("Atletico-CZ");
       // System.out.println("Equipe:" +equipe.getNome());
       // System.out.println("Tecnico:" +equipe.getTecnico().getNome());
       // equipe.getCampeonatos().forEach(c -> System.out.println("Campeonato: "+ c.getNome()));

        //consultar time por nome do jogador
        JogadorDao jogadorDao = new JogadorDao();
       // System.out.println("Equipe:" +jogadorDao.equipeByJogador("Pedro"));

        //consulta campeonato de uma equipe pelo nome da equipe
        //equipeDao.campeonatosDaEquipe("Barcelona").forEach(c -> System.out.println("Campeonato:" +c.getNome()));

        //campeonatoDao.equipesDoCampeonato("Campeonato Sertao").forEach(e -> System.out.println("Equipe:" +e.getNome()));
      /* Jogador j = (jogadorDao.jogadorByNome("Pedro"));
        System.out.println("Jogador: " +j.getNome());
        System.out.println("Posicao: " +j.getPosicao());
        System.out.println("Equipe: " +j.getEquipe().getNome());
        System.out.print("É titular? ");
        System.out.println(j.getIsTitular() ? "sim": "não");*/

        //consulta jogador por status
       //jogadorDao.jogadorByStatus(false).forEach(j -> System.out.println(j.getNome()));

        Tecnico tecnico = tecnicoDao.tecnicoByNome("Mourinho");
        System.out.println("Equipe: " +tecnico.getEquipe().getNome());
        System.out.print("Jogadores:");
        tecnico.getEquipe().getJogadores().forEach(j -> System.out.println(j.getNome()));
    }
}
