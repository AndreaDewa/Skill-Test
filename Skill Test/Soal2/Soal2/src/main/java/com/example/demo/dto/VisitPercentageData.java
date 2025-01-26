package com.example.demo.dto;

public class VisitPercentageData {
    private String kecamatan;
    private Long visitCount;
    private double percentage;

    public VisitPercentageData(String kecamatan, Long visitCount, double percentage) {
        this.kecamatan = kecamatan;
        this.visitCount = visitCount;
        this.percentage = percentage;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public Long getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(Long visitCount) {
        this.visitCount = visitCount;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}

