package com.example.demo.dto;

import java.util.List;
import java.util.Map;

public class ReportResponse {
    private String kecamatan;
    private Map<String, List<VisitData>> kelurahanData;
    private long totalVisits;
    private double percentage;

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public Map<String, List<VisitData>> getKelurahanData() {
        return kelurahanData;
    }

    public void setKelurahanData(Map<String, List<VisitData>> kelurahanData) {
        this.kelurahanData = kelurahanData;
    }

    public long getTotalVisits() {
        return totalVisits;
    }

    public void setTotalVisits(long totalVisits) {
        this.totalVisits = totalVisits;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public ReportResponse(String kecamatan, Map<String, List<VisitData>> kelurahanData, long totalVisits, double percentage) {
        this.kecamatan = kecamatan;
        this.kelurahanData = kelurahanData;
        this.totalVisits = totalVisits;
        this.percentage = percentage;
    }

    
}
