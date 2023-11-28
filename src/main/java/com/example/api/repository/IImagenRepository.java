package com.example.api.repository;

import com.example.api.model.Imagen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IImagenRepository extends JpaRepository<Imagen,Long>{

}
