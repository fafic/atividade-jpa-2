package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GenericDao <T>{

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Atividade_2_PU");
    EntityManager em = emf.createEntityManager();

    public void save(T entity){
        em.getTransaction().begin();
        em.persist(entity);
        em.getTransaction().commit();
       // em.close();
    }

    public T findById(Class<T> clazz, Long id){
        return  em.find(clazz, id);
    }
}
