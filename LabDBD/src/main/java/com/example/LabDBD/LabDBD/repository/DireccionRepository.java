package com.example.LabDBD.LabDBD.repository;
import com.example.LabDBD.LabDBD.entity.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DireccionRepository extends JpaRepository<Direccion, Long>{
}
