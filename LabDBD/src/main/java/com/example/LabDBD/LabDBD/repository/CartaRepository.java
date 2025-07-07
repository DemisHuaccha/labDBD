package com.example.LabDBD.LabDBD.repository;
import com.example.LabDBD.LabDBD.entity.Carta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CartaRepository extends JpaRepository<Carta, Long> {
}
