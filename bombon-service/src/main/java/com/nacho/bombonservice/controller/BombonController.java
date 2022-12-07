package com.nacho.bombonservice.controller;

import com.nacho.bombonservice.entity.Bombon;
import com.nacho.bombonservice.service.BombonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bombon")
public class BombonController {

    @Autowired
    BombonService bombonService;

    @GetMapping
    public ResponseEntity<List<Bombon>> getAll() {
        List<Bombon> bombons = bombonService.getAll();
        if (bombons.isEmpty())
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(bombons);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bombon> getById(@PathVariable("id") int id) {
        Bombon bombon = bombonService.getBombonById(id);
        if (bombon == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(bombon);
    }

    @PostMapping()
    public ResponseEntity<Bombon> save(@RequestBody Bombon bombon) {
        Bombon bombonNueva = bombonService.save(bombon);
        if (bombon == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(bombonNueva);
    }

    @GetMapping("/by-chica/{chicaId}")
    public ResponseEntity<List<Bombon>> getByChicaId(@PathVariable("chicaId") int chicaId) {
        List <Bombon> bombones = bombonService.getByChicaId((chicaId));
        if(bombones.isEmpty())
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(bombones);

    }



}
