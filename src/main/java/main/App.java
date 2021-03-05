package main;

import dao.CampeonatoDao;
import dao.EquipeDao;
import dao.JogadorDao;
import dao.TecnicoDao;
import domain.Campeonato;
import domain.Equipe;
import domain.Jogador;
import domain.Tecnico;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class App {
    public static void main(String[] args) {

        CampeonatoDao campeonatoDao = new CampeonatoDao();
        EquipeDao equipeDao = new EquipeDao();
        JogadorDao jogadorDao = new JogadorDao();
        TecnicoDao  tecnicoDao = new TecnicoDao();

        Campeonato campeonatoFafic = Campeonato
                .builder()
                .nome("Campeonato Fafic")
                .dataInicio(new Calendar.Builder().setDate(2021, 03, 15).build())
                .dataFim(new Calendar.Builder().setDate(2021, 05, 15).build()).build();

        // campeonatoDao.save(campeonatoFafic);

        Jogador joao = new Jogador();
        joao.setNome("João");
        joao.setPosicao("Atacante");
        joao.setIsTitular(true);

        Jogador jose = new Jogador();
        jose.setNome("Jose");
        jose.setPosicao("Zagueiro");
        jose.setIsTitular(false);

        Tecnico mourinho = new Tecnico();
        mourinho.setNome("Mourinho");

        campeonatoFafic = campeonatoDao.findById(Campeonato.class, 1l);

        Equipe equipe1 = Equipe.builder()
                .campeonatos(Arrays.asList(campeonatoFafic))
                .jogadores(Arrays.asList(joao, jose))
                .nome("Barcelona")
                .tecnico(mourinho).build();

       //  equipeDao.save(equipe1);

        Campeonato campeonatoSertao = Campeonato
                .builder()
                .nome("Campeonato Sertao")
                .dataInicio(new Calendar.Builder().setDate(2021, 8, 1).build())
                .dataFim(new Calendar.Builder().setDate(2021, 12, 1).build()).build();


      //  campeonatoDao.save(campeonatoSertao);

        Jogador tonho = new Jogador();
        tonho.setNome("Tonho");
        tonho.setPosicao("Meio Campo");
        tonho.setIsTitular(true);

        Jogador pedro = new Jogador();
        pedro.setNome("Pedro");
        pedro.setPosicao("Atacante");
        pedro.setIsTitular(false);


        Tecnico tecnico2 = new Tecnico();
        tecnico2.setNome("Felipão");

        campeonatoFafic = campeonatoDao.findById(Campeonato.class, 1l);
        campeonatoSertao =campeonatoDao.findById(Campeonato.class, 2l);


        Equipe equipe2 = Equipe.builder()
                .campeonatos(Arrays.asList(campeonatoFafic, campeonatoSertao))
                .jogadores(Arrays.asList(tonho, pedro))
                .nome("Atletico-CZ")
                .tecnico(tecnico2).build();

       // equipeDao.save(equipe2);

        mourinho = tecnicoDao.findById(Tecnico.class, 4l);
        equipe1 = equipeDao.findById(Equipe.class, 2l);
        mourinho.setEquipe(equipe1);
        tecnicoDao.save(mourinho);

        tecnico2 = tecnicoDao.findById(Tecnico.class, 7l);
        equipe2 = equipeDao.findById(Equipe.class, 3l);
        tecnico2.setEquipe(equipe2);
        tecnicoDao.save(tecnico2);

        pedro = jogadorDao.findById(Jogador.class, 9l);
        tonho = jogadorDao.findById(Jogador.class, 8l);
        pedro.setEquipe(equipe2);
        tonho.setEquipe(equipe2);

        jogadorDao.save(pedro);
        jogadorDao.save(tonho);

        jose = jogadorDao.findById(Jogador.class, 6l);
        joao = jogadorDao.findById(Jogador.class, 5l);
        jose.setEquipe(equipe1);
        joao.setEquipe(equipe1);

        jogadorDao.save(jose);
        jogadorDao.save(joao);



    }
}
