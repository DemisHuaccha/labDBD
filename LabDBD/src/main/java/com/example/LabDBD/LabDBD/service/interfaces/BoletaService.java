package com.example.LabDBD.LabDBD.service.interfaces;

import com.example.LabDBD.LabDBD.entity.Boleta;

import java.util.List;

public interface BoletaService {
    /*Create*/
    void crearBoleta(Boleta boleta);

    /*Read*/
    List<Boleta> getAllBoletas();
    Boleta getBoletaById(Long id);
    //Boleta getBoletaByRut(String rut);

    /*Update*/
    void updateBoleta(Long id, Boleta boleta);

    /*Delete*/
    void deleteBoleta(Long id);

}
