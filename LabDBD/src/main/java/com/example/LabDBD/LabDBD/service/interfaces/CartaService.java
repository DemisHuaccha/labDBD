package com.example.LabDBD.LabDBD.service.interfaces;

import com.example.LabDBD.LabDBD.entity.Carta;


import java.util.List;

public interface CartaService {
    /*CREATE*/
    void crearCarta(Carta carta);

    /*READ*/
    Carta getCartaById(Long id);
    List<Carta> getAllCarta();

    /*UPDATE*/
    void updateCarta(Long id, Carta carta);

    /*DELETE*/
    void deleteCarta(Long id);
}
