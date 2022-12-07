package com.nacho.burbujaservice.entity;

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

public class Burbuja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String version;
    private String tonoDeAzul;
    private int chicaId;


    public void setVersion(String version) {
        this.version = "Burbuja " + version;
    }

    public void setTonoDeAzul(String tonoDeAzul) {
        this.tonoDeAzul = "Azul " + tonoDeAzul;
    }
}
