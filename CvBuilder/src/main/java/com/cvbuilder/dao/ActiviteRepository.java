package com.cvbuilder.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cvbuilder.entities.Activite;

@Repository
public interface ActiviteRepository extends JpaRepository<Activite, Long> {

}
