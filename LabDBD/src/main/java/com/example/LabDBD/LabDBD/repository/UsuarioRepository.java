package com.example.LabDBD.LabDBD.repository;
import com.example.LabDBD.LabDBD.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
}
