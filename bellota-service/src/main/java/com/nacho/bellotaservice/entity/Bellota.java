package com.nacho.bellotaservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Bellota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String version;
    private String tonoDeVerde;
    private int chicaId;


    public void setVersion(String version) {
        this.version = "Bellota " + version;
    }

    public void setTonoDeVerde(String tonoDeVerde) {
        this.tonoDeVerde = "Verde " + tonoDeVerde;
    }
}
