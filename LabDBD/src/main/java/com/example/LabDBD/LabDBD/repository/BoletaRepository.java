package com.example.LabDBD.LabDBD.repository;

import com.example.LabDBD.LabDBD.entity.Boleta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface BoletaRepository extends JpaRepository<Boleta, Long>{
    //Optional<Boleta> findByRutUser(String rut);
}
