package com.example.LabDBD.LabDBD.repository;
import com.example.LabDBD.LabDBD.entity.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RolRepository extends JpaRepository<Rol, Long>{
}
