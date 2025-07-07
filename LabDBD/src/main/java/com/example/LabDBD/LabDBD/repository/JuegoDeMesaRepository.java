package com.example.LabDBD.LabDBD.repository;
import com.example.LabDBD.LabDBD.entity.JuegoDeMesa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JuegoDeMesaRepository extends JpaRepository<JuegoDeMesa, Long>{
}
