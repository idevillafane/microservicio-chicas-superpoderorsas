package com.nacho.chicassuperpoderosasservice.client;

import com.nacho.chicassuperpoderosasservice.entity.ChicasSuperpoderosas;
import com.nacho.chicassuperpoderosasservice.model.Bellota;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name="bellota-service", url="http://localhost:8004")
public interface BellotaClient {

    @GetMapping("/bellota/by-chica/{chicaId}")
    List<Bellota> getBellotas(@PathVariable("chicaId") int chicaId);

    @PostMapping("/bellota/")
    Bellota save(@RequestBody Bellota bellota);

}
