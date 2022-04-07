package com.example.demoNas;

public class Patient {
    String name;
    String snils;

    public Patient() {
    }

    public Patient(String name, String snils) {
        this.name = name;
        this.snils = snils;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSnils() {
        return snils;
    }

    public void setSnils(String snils) {
        this.snils = snils;
    }
}
