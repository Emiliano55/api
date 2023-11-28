package com.example.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.api.model.Duenio;

@Repository
public interface IDuenioRepository extends JpaRepository<Duenio, Long> {
}