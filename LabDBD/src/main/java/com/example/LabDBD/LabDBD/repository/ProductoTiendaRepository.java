package com.example.LabDBD.LabDBD.repository;
import com.example.LabDBD.LabDBD.entity.ProductoTienda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductoTiendaRepository extends JpaRepository<ProductoTienda, Long> {
}
