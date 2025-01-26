package com.example.demo.dto;

public class PersentaseWilayah {
    private String value;
    private String label;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    // Constructor, Getters and Setters
    public PersentaseWilayah(String value, String label) {
        this.value = value;
        this.label = label;
    }
}


