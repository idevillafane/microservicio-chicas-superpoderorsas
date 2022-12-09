package com.nacho.chicassuperpoderosasservice.service;

import com.nacho.chicassuperpoderosasservice.client.BellotaClient;
import com.nacho.chicassuperpoderosasservice.client.BombonClient;
import com.nacho.chicassuperpoderosasservice.client.BurbujaClient;
import com.nacho.chicassuperpoderosasservice.entity.ChicasSuperpoderosas;
import com.nacho.chicassuperpoderosasservice.model.Bellota;
import com.nacho.chicassuperpoderosasservice.model.Bombon;
import com.nacho.chicassuperpoderosasservice.model.Burbuja;
import com.nacho.chicassuperpoderosasservice.repository.ChicasSuperpoderosasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChicasSuperpoderosasService {

    @Autowired
    ChicasSuperpoderosasRepository chicasSuperpoderosasRepository;



    @Autowired
    BellotaClient bellotaClient;
    @Autowired
    BombonClient bombonClient;
    @Autowired
    BurbujaClient burbujaClient;


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

    public List<Bellota> getBellotas(int chicaId) {
        List<Bellota> bellotas = bellotaClient.getBellotas(chicaId);
        return bellotas;
    }

    public List<Burbuja> getBurbujas(int chicaId) {
        List<Burbuja> burbujas = burbujaClient.getBurbujas(chicaId);
        return burbujas;
    }

    public List<Bombon> getBombones(int chicaId) {
        List<Bombon> bombones = bombonClient.getBombones(chicaId);
        return bombones;
    }
}
