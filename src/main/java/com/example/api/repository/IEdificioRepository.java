package com.example.api.repository;
import com.example.api.model.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEdificioRepository extends JpaRepository<Edificio,Long>{

}