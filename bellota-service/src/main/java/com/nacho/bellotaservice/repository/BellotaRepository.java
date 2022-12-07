package com.nacho.bellotaservice.repository;

import com.nacho.bellotaservice.entity.Bellota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BellotaRepository extends JpaRepository<Bellota, Integer> {

    List<Bellota> findByChicaId(int chicaId);
}
