package com.example.LabDBD.LabDBD.service.interfaces;

import com.example.LabDBD.LabDBD.entity.JuegoDeMesa;


import java.util.List;

public interface JuegoDeMesaService {
    /*CREATE*/
    void crearJuegoDeMesa(JuegoDeMesa juegoDeMesa);

    /*READ*/
    JuegoDeMesa getJuegoDeMesaById(Long id);
    List<JuegoDeMesa> getAllJuegoDeMesa();

    /*UPDATE*/
    void updateJuegoDeMesa(Long id, JuegoDeMesa juegoDeMesa);

    /*DELETE*/
    void deleteJuegoDeMesa(Long id);
}
