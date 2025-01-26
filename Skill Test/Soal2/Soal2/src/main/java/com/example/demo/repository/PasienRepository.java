package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Pasien;

public interface PasienRepository extends JpaRepository<Pasien, Integer> {

}

