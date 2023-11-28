package com.example.api.repository;
import com.example.api.model.Unidad;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface IUnidadRepository extends JpaRepository<Unidad,Long>{
    List<Unidad> findAllByEdificio_Id(Long id);
}