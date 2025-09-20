package com.emobile.springtodo.repository;

import com.emobile.springtodo.entity.ToDoEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@Profile("hibernate")
@Transactional(readOnly = true)
public class ToDoRepository {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public ToDoEntity save(ToDoEntity entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return em.merge(entity);
        }
    }

    public Optional<ToDoEntity> findById(Long id) {
        return Optional.ofNullable(em.find(ToDoEntity.class, id));
    }

    public List<ToDoEntity> findAll(int limit, int offset) {
        return em.createQuery("from ToDoEntity e order by e.id", ToDoEntity.class)
                .setFirstResult(offset)
                .setMaxResults(limit)
                .getResultList();
    }

    @Transactional
    public void deleteByID(Long id) {
        ToDoEntity e = em.find(ToDoEntity.class, id);
        if (e != null) {
            em.remove(e);
        }
    }

    public long count() {
        Long c = em.createQuery("select count(e.id) from ToDoEntity e", Long.class)
                .getSingleResult();
        return c == null ? 0 : c;
    }
}
