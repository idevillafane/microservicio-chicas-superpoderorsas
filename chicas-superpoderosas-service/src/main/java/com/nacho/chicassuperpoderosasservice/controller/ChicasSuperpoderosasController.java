package com.nacho.chicassuperpoderosasservice.controller;

import com.nacho.chicassuperpoderosasservice.entity.ChicasSuperpoderosas;
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



}
