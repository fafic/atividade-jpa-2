package dao;

import domain.Jogador;

import javax.persistence.Query;
import java.util.List;


public class JogadorDao extends GenericDao<Jogador> {

    public String equipeByJogador(String nomeDoJogador){
        Query query = em.createNamedQuery("equipeByPlayer");
        query.setParameter("nomeJogador", nomeDoJogador);
        return query.getSingleResult().toString();
    }

    public Jogador jogadorByNome(String nome){
        Query query = em.createNamedQuery("jogadorByNome");
        query.setParameter("nomeDoJogador", nome);
        return (Jogador) query.getSingleResult();
    }

    public List<Jogador> jogadorByStatus(Boolean satus){
        Query query = em.createNamedQuery("jogadorByStatus");
        query.setParameter("status", satus);
        return query.getResultList();

    }
}
