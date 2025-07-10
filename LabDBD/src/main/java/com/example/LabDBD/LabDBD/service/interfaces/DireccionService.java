package com.example.LabDBD.LabDBD.service.interfaces;



import com.example.LabDBD.LabDBD.entity.Direccion;

import java.util.List;

public interface DireccionService {
    /*CREATE*/
    void crearDireccion(Direccion direccion);

    /*READ*/
    Direccion getDireccionById(Long id);
    List<Direccion> getAllDireccion();

    /*UPDATE*/
    void updateDireccion(Long id, Direccion direccion);

    /*DELETE*/
    void deleteDireccion(Long id);

}
