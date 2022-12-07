package com.nacho.burbujaservice.controller;

import com.nacho.burbujaservice.entity.Burbuja;
import com.nacho.burbujaservice.service.BurbujaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/burbuja")
public class BurbujaController {

    @Autowired
    BurbujaService burbujaService;

    @GetMapping
    public ResponseEntity<List<Burbuja>> getAll() {
        List<Burbuja> burbujas = burbujaService.getAll();
        if (burbujas.isEmpty())
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(burbujas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Burbuja> getById(@PathVariable("id") int id) {
        Burbuja burbuja = burbujaService.getBurbujaById(id);
        if (burbuja == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(burbuja);
    }

    @PostMapping()
    public ResponseEntity<Burbuja> save(@RequestBody Burbuja burbuja) {
        Burbuja burbujaNueva = burbujaService.save(burbuja);
        if (burbuja == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(burbujaNueva);
    }

    @GetMapping("/by-chica/{chicaId}")
    public ResponseEntity<List<Burbuja>> getByChicaId(@PathVariable("chicaId") int chicaId) {
        List <Burbuja> burbujas = burbujaService.getByChicaId((chicaId));
        if(burbujas.isEmpty())
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(burbujas);

    }



}
