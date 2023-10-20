package by.it_academy.jd2.Mk_JD2_103_23.airport.dao;

import by.it_academy.jd2.Mk_JD2_103_23.airport.dao.api.IAirportDao;
import by.it_academy.jd2.Mk_JD2_103_23.airport.dao.entity.AircraftEntity;
import by.it_academy.jd2.Mk_JD2_103_23.airport.dao.entity.AirportEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;


import java.util.List;

public class AirportDao implements IAirportDao {

    private final EntityManagerFactory emf;

    public AirportDao(EntityManagerFactory emf) {
        this.emf = emf;
    }
    @Override
    public List<AirportEntity> getAll() {
        EntityManager em = emf.createEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<?> query = cb.createQuery();
        query.from(AirportEntity.class);
        return (List<AirportEntity>) em.createQuery(query).getResultList();
    }
}
