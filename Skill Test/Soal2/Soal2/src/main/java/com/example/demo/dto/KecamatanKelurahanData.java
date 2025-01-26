package com.example.demo.dto;

import java.util.List;

public class KecamatanKelurahanData {

    private String namaKecamatan;
    private List<String> listNamaKecamatan;

    public KecamatanKelurahanData(String namaKecamatan, String namaKelurahan) {
        this.namaKecamatan = namaKecamatan;
        this.listNamaKecamatan = List.of(namaKelurahan);
    }

    public String getNamaKecamatan() {
        return namaKecamatan;
    }

    public void setNamaKecamatan(String namaKecamatan) {
        this.namaKecamatan = namaKecamatan;
    }

    public List<String> getNamaKelurahan() {
        return listNamaKecamatan;
    }

    public void setNamaKelurahan(List<String> listNamaKecamatan) {
        this.listNamaKecamatan = listNamaKecamatan;
    }
}

