package com.nacho.bellotaservice.controller;

import com.nacho.bellotaservice.entity.Bellota;
import com.nacho.bellotaservice.service.BellotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bellota")
public class BellotaController {

    @Autowired
    BellotaService bellotaService;

    @GetMapping
    public ResponseEntity<List<Bellota>> getAll() {
        List<Bellota> bellotas = bellotaService.getAll();
        if (bellotas.isEmpty())
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(bellotas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bellota> getById(@PathVariable("id") int id) {
        Bellota bellota = bellotaService.getBellotaById(id);
        if (bellota == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(bellota);
    }

    @PostMapping()
    public ResponseEntity<Bellota> save(@RequestBody Bellota bellota) {
        Bellota bellotaNueva = bellotaService.save(bellota);
        if (bellota == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(bellotaNueva);
    }

    @GetMapping("/by-chica/{chicaId}")
    public ResponseEntity<List<Bellota>> getByChicaId(@PathVariable("chicaId") int chicaId) {
        List <Bellota> bellotas = bellotaService.getByChicaId((chicaId));
        if(bellotas.isEmpty())
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(bellotas);

    }


}
