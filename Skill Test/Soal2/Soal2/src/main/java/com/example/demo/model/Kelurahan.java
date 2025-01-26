package com.example.demo.model;

import lombok.Data;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Data
@Entity
@Table(name = "dc_kelurahan")
public class Kelurahan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nama", nullable = false, length = 50)
    private String nama;

    @ManyToOne
    @JoinColumn(name = "id_kecamatan")
    private Kecamatan kecamatan;

    @Column(name = "kode", length = 6)
    private String kode;

}

