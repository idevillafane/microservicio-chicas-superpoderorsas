package com.nacho.chicassuperpoderosasservice.service;

import com.nacho.chicassuperpoderosasservice.entity.ChicasSuperpoderosas;
import com.nacho.chicassuperpoderosasservice.repository.ChicasSuperpoderosasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChicasSuperpoderosasService {

    @Autowired
    ChicasSuperpoderosasRepository chicasSuperpoderosasRepository;

    public List<ChicasSuperpoderosas> getAll() {
        return chicasSuperpoderosasRepository.findAll();
    }

    public ChicasSuperpoderosas getChicaSuperpoderosaById(int id) {
        return chicasSuperpoderosasRepository.findById(id).orElse(null);
    }

    public ChicasSuperpoderosas save(ChicasSuperpoderosas chicasSuperpoderosas) {
        ChicasSuperpoderosas chicaSuperpoderosaNueva = chicasSuperpoderosasRepository.save(chicasSuperpoderosas);
        return  chicaSuperpoderosaNueva;
    }
}
