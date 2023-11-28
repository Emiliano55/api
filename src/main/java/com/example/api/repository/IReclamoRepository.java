package com.example.api.repository;
import com.example.api.model.Reclamo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import org.springframework.stereotype.Repository;
@Repository
public interface IReclamoRepository extends JpaRepository<Reclamo,Long>{
    List<Reclamo> findAllByUnidad_Id(Long id);
    List<Reclamo> findAllByPersona_Id(Long id);
}
