package com.example.demo.dto;

public class SubRawatJalan {
    private String jenis;
    private Long poliklinikCount;
    private Long igdCount;
    private Long totalCount;

    public SubRawatJalan(String jenis, Long poliklinikCount, Long igdCount, Long totalCount) {
        this.jenis = jenis;
        this.poliklinikCount = poliklinikCount;
        this.igdCount = igdCount;
        this.totalCount = totalCount;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public Long getPoliklinikCount() {
        return poliklinikCount;
    }

    public void setPoliklinikCount(Long poliklinikCount) {
        this.poliklinikCount = poliklinikCount;
    }

    public Long getIgdCount() {
        return igdCount;
    }

    public void setIgdCount(Long igdCount) {
        this.igdCount = igdCount;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    // Getters and setters
}
