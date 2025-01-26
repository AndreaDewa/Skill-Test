package com.example.demo.model;

import lombok.Data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Data
@Entity
@Table(name = "dc_kabupaten")
public class Kabupaten {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nama", nullable = false, length = 50)
    private String nama;

    @Column(name = "id_provinsi", nullable = false)
    private int idProvinsi;

    @Column(name = "kode", length = 4)
    private String kode;
}

