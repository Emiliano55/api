package com.example.api.repository;


import com.example.api.model.Duenio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IDuenioRepository extends JpaRepository<Duenio,Long>{

}