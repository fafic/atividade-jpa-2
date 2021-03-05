package dao;

import domain.Tecnico;

import javax.persistence.Query;

public class TecnicoDao extends GenericDao<Tecnico>{

    public Tecnico tecnicoByNome(String nome){
        Query query = em.createNamedQuery("equipeByTecnico");
        query.setParameter("nomeTecnico", nome);
        return (Tecnico) query.getSingleResult();
    }
}
