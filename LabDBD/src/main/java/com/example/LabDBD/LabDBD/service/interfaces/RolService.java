package com.example.LabDBD.LabDBD.service.interfaces;

import com.example.LabDBD.LabDBD.entity.Boleta;
import com.example.LabDBD.LabDBD.entity.Rol;

import java.util.List;

public interface RolService {

    /*CREATE*/
    void crearRol(Rol rol);

    /*READ*/
    Rol getRolById(Long id);
    List<Rol> getAllRol();

    /*UPDATE*/
    void updateRol(Long id, Rol rol);

    /*DELETE*/
    void deleteRol(Long id);
}
