package com.nacho.burbujaservice.service;

import com.nacho.burbujaservice.entity.Burbuja;
import com.nacho.burbujaservice.repository.BurbujaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BurbujaService {

    @Autowired
    BurbujaRepository burbujaRepository;

    public List<Burbuja> getAll() {
        return burbujaRepository.findAll();
    }

    public Burbuja getBurbujaById(int id) {
        return burbujaRepository.findById(id).orElse(null);
    }

    public Burbuja save(Burbuja burbuja) {
        Burbuja burbujaNueva = burbujaRepository.save(burbuja);
        return  burbujaNueva;
    }

    public List<Burbuja> getByChicaId(int chicaId) {
        return burbujaRepository.findByChicaId(chicaId);
    }
}
