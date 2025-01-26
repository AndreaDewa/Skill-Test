package com.example.demo.dto;

import java.time.LocalDateTime;

public class VisitData {
    private String pasienNama;
    private String kelurahan;
    private String kecamatan;
    private String kabupaten;
    private LocalDateTime waktuDaftar;

    public VisitData(String pasienNama, String kelurahan, String kecamatan, String kabupaten, LocalDateTime waktuDaftar) {
        this.pasienNama = pasienNama;
        this.kelurahan = kelurahan;
        this.kecamatan = kecamatan;
        this.kabupaten = kabupaten;
        this.waktuDaftar = waktuDaftar;
    }

    public String getPasienNama() {
        return pasienNama;
    }

    public void setPasienNama(String pasienNama) {
        this.pasienNama = pasienNama;
    }

    public String getKelurahan() {
        return kelurahan;
    }

    public void setKelurahan(String kelurahan) {
        this.kelurahan = kelurahan;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public String getKabupaten() {
        return kabupaten;
    }

    public void setKabupaten(String kabupaten) {
        this.kabupaten = kabupaten;
    }

    public LocalDateTime getWaktuDaftar() {
        return waktuDaftar;
    }

    public void setWaktuDaftar(LocalDateTime waktuDaftar) {
        this.waktuDaftar = waktuDaftar;
    }

    
}
