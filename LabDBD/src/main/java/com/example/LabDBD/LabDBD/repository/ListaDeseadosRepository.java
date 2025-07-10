package com.example.LabDBD.LabDBD.repository;
import com.example.LabDBD.LabDBD.entity.ListaDeseados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ListaDeseadosRepository extends JpaRepository<ListaDeseados, Long>{
}
