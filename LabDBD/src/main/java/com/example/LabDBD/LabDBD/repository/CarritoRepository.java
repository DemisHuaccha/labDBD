package com.example.LabDBD.LabDBD.repository;
import com.example.LabDBD.LabDBD.entity.Carrito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CarritoRepository extends JpaRepository<Carrito, Long>{
}
