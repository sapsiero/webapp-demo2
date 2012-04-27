package com.sapsiero.webappdemo2;

import javax.ejb.Stateless;
import javax.persistence.*;
import java.util.List;

/**
 * Date: 4/27/12
 * Time: 2:34 PM
 */
@Stateless
public class PersonBean {

    @PersistenceContext
    EntityManager em;

    public List<PersonEntity> list() {
        TypedQuery<PersonEntity> q = em.createQuery("Select p From PersonEntity p", PersonEntity.class);
        return q.getResultList();
    }

    public void save(PersonEntity personEntity) {
        em.merge(personEntity);
    }

    public PersonEntity load(long personId) {
        TypedQuery<PersonEntity> q = em.createQuery("Select p From PersonEntity p Where p.id = :personId", PersonEntity.class);
        q.setParameter("personId", personId);
        return q.getSingleResult();
    }

    public void delete(long personId) {
        Query q = em.createQuery("Delete from PersonEntity p Where p.id = :personId");
        q.setParameter("personId", personId);
        q.executeUpdate();
    }
}
