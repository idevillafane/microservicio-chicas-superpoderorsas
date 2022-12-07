package com.nacho.chicassuperpoderosasservice.repository;

import com.nacho.chicassuperpoderosasservice.entity.ChicasSuperpoderosas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChicasSuperpoderosasRepository extends JpaRepository<ChicasSuperpoderosas, Integer> {
}
