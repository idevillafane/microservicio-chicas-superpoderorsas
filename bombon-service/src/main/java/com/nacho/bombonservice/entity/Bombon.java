package com.nacho.bombonservice.entity;

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

public class Bombon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String version;
    private String tonoDeRojo;
    private int chicaId;


    public void setVersion(String version) {
        this.version = "Bombon " + version;
    }

    public void setTonoDeAzul(String tonoDeAzul) {
        this.tonoDeRojo = "Rojo " + tonoDeAzul;
    }
}
