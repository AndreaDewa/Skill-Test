package com.example.demo.model;

import lombok.Data;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "dc_pendaftaran")
public class Pendaftaran {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Integer id;

    @Column(name = "no_register", nullable = false, length = 15)
    private String noRegister;

    @ManyToOne
    @JoinColumn(name = "id_pasien")
    private Pasien pasien;

    @Column(name = "waktu_daftar", nullable = false)
    private LocalDateTime waktuDaftar;

    @Column(name = "waktu_keluar")
    private LocalDateTime waktuKeluar;

    @Column(name = "jenis", nullable = false)
    @Enumerated(EnumType.STRING)
    private Jenis jenis;

    @Column(name = "jenis_igd")
    @Enumerated(EnumType.STRING)
    private JenisIgd jenisIgd;

    @Column(name = "status", nullable = false)
    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(name = "langsung", nullable = false)
    @Enumerated(EnumType.STRING)
    private Langsung langsung = Langsung.TIDAK;

    public enum Jenis {
        POLIKLINIK, IGD, RAWAT_INAP, MCU, LABORATORIUM, RADIOLOGI, FISIOTERAPI, 
        FORENSIK, HEMODIALISA, KEMOTERAPI
    }

    public enum JenisIgd {
        UMUM, KAMAR_BERSALIN, HEMODIALISA, KEMOTERAPI, PONEK, VISUM
    }

    public enum Status {
        BARU, LAMA, BATAL, BOOKING
    }

    public enum Langsung {
        YA, TIDAK
    }

}

