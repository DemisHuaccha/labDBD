package com.example.LabDBD.LabDBD.service.interfaces;

import com.example.LabDBD.LabDBD.entity.MetodoPago;


import java.util.List;

public interface MetodoPagoService {
    /*CREATE*/
    void crearMetodoPago(MetodoPago metodoPago);

    /*READ*/
    MetodoPago getMetodoPagoById(Long id);
    List<MetodoPago> getAllMetodoPago();

    /*UPDATE*/
    void updateMetodoPago(Long id, MetodoPago metodoPago);

    /*DELETE*/
    void deleteMetodoPago(Long id);
}
