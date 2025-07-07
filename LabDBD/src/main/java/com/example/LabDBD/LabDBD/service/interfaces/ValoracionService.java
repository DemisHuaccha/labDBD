package com.example.LabDBD.LabDBD.service.interfaces;

import com.example.LabDBD.LabDBD.entity.Valoracion;

import java.util.List;

public interface ValoracionService {
    /*CREATE*/
    void crearValoracion(Valoracion valoracion);

    /*READ*/
    Valoracion getValoracionById(Long id);
    List<Valoracion> getAllValoracion();

    /*UPDATE*/
    void updateValoracion(Long id, Valoracion valoracion);

    /*DELETE*/
    void deleteValoracion(Long id);
}
