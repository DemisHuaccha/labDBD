package com.example.LabDBD.LabDBD.repository;
import com.example.LabDBD.LabDBD.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long>{
}
