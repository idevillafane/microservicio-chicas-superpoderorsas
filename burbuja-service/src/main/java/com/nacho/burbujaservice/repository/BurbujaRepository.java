package com.nacho.burbujaservice.repository;

import com.nacho.burbujaservice.entity.Burbuja;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BurbujaRepository extends JpaRepository<Burbuja, Integer> {

    List<Burbuja> findByChicaId(int chicaId);
}
