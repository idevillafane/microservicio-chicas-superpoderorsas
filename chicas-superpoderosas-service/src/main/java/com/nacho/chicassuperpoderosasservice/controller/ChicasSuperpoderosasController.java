package com.nacho.chicassuperpoderosasservice.controller;

import com.nacho.chicassuperpoderosasservice.entity.ChicasSuperpoderosas;
import com.nacho.chicassuperpoderosasservice.model.Bellota;
import com.nacho.chicassuperpoderosasservice.model.Bombon;
import com.nacho.chicassuperpoderosasservice.model.Burbuja;
import com.nacho.chicassuperpoderosasservice.service.ChicasSuperpoderosasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chicas-superpoderosas")
public class ChicasSuperpoderosasController {

    @Autowired
    ChicasSuperpoderosasService chicasSuperpoderosasService;

    @GetMapping
    public ResponseEntity<List<ChicasSuperpoderosas>> getAll() {
        List<ChicasSuperpoderosas> chicasSuperpoderosas = chicasSuperpoderosasService.getAll();
        if (chicasSuperpoderosas.isEmpty())
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(chicasSuperpoderosas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ChicasSuperpoderosas> getById(@PathVariable("id") int id) {
        ChicasSuperpoderosas chicaSuperpoderosa = chicasSuperpoderosasService.getChicaSuperpoderosaById(id);
        if (chicaSuperpoderosa == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(chicaSuperpoderosa);
    }

    @PostMapping()
    public ResponseEntity<ChicasSuperpoderosas> save(@RequestBody ChicasSuperpoderosas chicaSuperpoderosa) {
        ChicasSuperpoderosas chicaSuperpoderosaNueva = chicasSuperpoderosasService.save(chicaSuperpoderosa);
        if (chicaSuperpoderosa == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(chicaSuperpoderosaNueva);
    }

    @GetMapping("/by-chica/{chicaId}")
    public ResponseEntity<List<Bellota>> getBellotaByChicaId(@PathVariable("chicaId") int chicaId) {
        List <Bellota> bellotas = chicasSuperpoderosasService.getBellotas(chicaId);
        if(bellotas.isEmpty())
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(bellotas);
    }

    @GetMapping("/by-chica1/{chicaId}")
    public ResponseEntity<List<Bombon>> getBombonByChicaId(@PathVariable("chicaId") int chicaId) {
        List <Bombon> bombones = chicasSuperpoderosasService.getBombones(chicaId);
        if(bombones.isEmpty())
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(bombones);
    }

    @GetMapping("/by-chica2/{chicaId}")
    public ResponseEntity<List<Burbuja>> getBurbujaByChicaId(@PathVariable("chicaId") int chicaId) {
        List <Burbuja> burbujas = chicasSuperpoderosasService.getBurbujas(chicaId);
        if(burbujas.isEmpty())
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(burbujas);
    }




}
