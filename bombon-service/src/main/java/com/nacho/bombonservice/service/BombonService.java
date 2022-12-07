package com.nacho.bombonservice.service;

import com.nacho.bombonservice.entity.Bombon;
import com.nacho.bombonservice.repository.BombonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BombonService {

    @Autowired
    BombonRepository bombonRepository;

    public List<Bombon> getAll() {
        return bombonRepository.findAll();
    }

    public Bombon getBombonById(int id) {
        return bombonRepository.findById(id).orElse(null);
    }

    public Bombon save(Bombon bombon) {
        Bombon bombonNueva = bombonRepository.save(bombon);
        return  bombonNueva;
    }

    public List<Bombon> getByChicaId(int chicaId) {
        return bombonRepository.findByChicaId(chicaId);
    }
}
