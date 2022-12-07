package com.nacho.bombonservice.repository;

import com.nacho.bombonservice.entity.Bombon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BombonRepository extends JpaRepository<Bombon, Integer> {

    List<Bombon> findByChicaId(int chicaId);
}
