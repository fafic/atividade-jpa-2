package main;

import dao.CampeonatoDao;
import dao.EquipeDao;
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

        Campeonato campeonatoFafic = Campeonato
                .builder()
                .nome("Campeonato Fafic")
                .dataInicio(new Calendar.Builder().setDate(2021, 03, 15).build())
                .dataFim(new Calendar.Builder().setDate(2021, 05, 15).build()).build();

        campeonatoDao.save(campeonatoFafic);

        Jogador joao = new Jogador();
        joao.setNome("João");
        joao.setPosicao("Atacante");
        joao.setIsTitular(true);

        Jogador jose = new Jogador();
        jose.setNome("Jose");
        jose.setPosicao("Zagueiro");
        jose.setIsTitular(false);

        Tecnico tecnico = new Tecnico();
        tecnico.setNome("Mourinho");

        campeonatoFafic = campeonatoDao.findById(Campeonato.class, 1l);

        Equipe equipe1 = Equipe.builder()
                .campeonatos(Arrays.asList(campeonatoFafic))
                .jogadores(Arrays.asList(joao, jose))
                .nome("Barcelona")
                .tecnico(tecnico).build();
        equipeDao.save(equipe1);



    }
}
