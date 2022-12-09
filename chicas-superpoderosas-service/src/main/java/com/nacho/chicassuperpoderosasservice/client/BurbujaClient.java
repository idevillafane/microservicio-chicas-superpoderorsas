package com.nacho.chicassuperpoderosasservice.client;

import com.nacho.chicassuperpoderosasservice.model.Burbuja;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name="burbuja-service")

public interface BurbujaClient {

    @GetMapping("/burbuja/by-chica/{chicaId}")
    List<Burbuja> getBurbujas(@PathVariable("chicaId") int chicaId);

    @PostMapping("/burbuja/")
    Burbuja save(@RequestBody Burbuja burbuja);

}
