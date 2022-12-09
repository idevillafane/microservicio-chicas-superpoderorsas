package com.nacho.chicassuperpoderosasservice.client;

import com.nacho.chicassuperpoderosasservice.entity.ChicasSuperpoderosas;
import com.nacho.chicassuperpoderosasservice.model.Bombon;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name="bombon-service", url="http://localhost:8004")
public interface BombonClient {

    @GetMapping("/bombon/by-chica/{chicaId}")
    List<Bombon> getBombones(@PathVariable("chicaId") int chicaId);

    @PostMapping("/bombon/")
    Bombon save(@RequestBody Bombon bombon);


}
