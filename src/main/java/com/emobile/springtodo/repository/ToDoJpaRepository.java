package com.emobile.springtodo.repository;

import com.emobile.springtodo.entity.ToDoEntity;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Profile("datajpa")
public interface ToDoJpaRepository extends JpaRepository<ToDoEntity, Long> {
}