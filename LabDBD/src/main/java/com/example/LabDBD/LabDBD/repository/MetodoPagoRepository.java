package com.example.LabDBD.LabDBD.repository;
import com.example.LabDBD.LabDBD.entity.MetodoPago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MetodoPagoRepository extends JpaRepository<MetodoPago, Long>{
}
