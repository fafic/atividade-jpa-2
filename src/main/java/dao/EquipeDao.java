package dao;

import domain.Campeonato;
import domain.Equipe;

import javax.persistence.Query;
import java.util.List;


public class EquipeDao extends GenericDao<Equipe> {

    public Equipe buscarEquipePeloNome(String nome){
        Query query = em.createNamedQuery("equipeByName");
        query.setParameter("equipe", nome);
        return (Equipe) query.getSingleResult();
    }

    public List<Campeonato> campeonatosDaEquipe(String nomeEquipe){
        Query query = em.createNamedQuery("campeonatoByTeam");
        query.setParameter("equipe", nomeEquipe);
        return query.getResultList();
    }
}
