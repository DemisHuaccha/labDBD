package com.example.LabDBD.LabDBD.repository;
import com.example.LabDBD.LabDBD.entity.Valoracion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ValoracionRepository extends JpaRepository<Valoracion, Long>{
}
