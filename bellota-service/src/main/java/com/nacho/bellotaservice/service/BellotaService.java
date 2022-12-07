package com.nacho.bellotaservice.service;

import com.nacho.bellotaservice.entity.Bellota;
import com.nacho.bellotaservice.repository.BellotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BellotaService {

    @Autowired
    BellotaRepository bellotaRepository;

    public List<Bellota> getAll() {
        return bellotaRepository.findAll();
    }

    public Bellota getBellotaById(int id) {
        return bellotaRepository.findById(id).orElse(null);
    }

    public Bellota save(Bellota bellota) {
        Bellota bellotaNueva = bellotaRepository.save(bellota);
        return  bellotaNueva;
    }

    public List<Bellota> getByChicaId(int chicaId) {
        return bellotaRepository.findByChicaId(chicaId);
    }
}
