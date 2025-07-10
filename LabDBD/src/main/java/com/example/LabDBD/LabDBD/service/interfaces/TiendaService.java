package com.example.LabDBD.LabDBD.service.interfaces;



import com.example.LabDBD.LabDBD.entity.Tienda;

import java.util.List;

public interface TiendaService {
    /*CREATE*/
    void crearTienda(Tienda tienda);

    /*READ*/
    Tienda getTiendaById(Long id);
    List<Tienda> getAllTienda();

    /*UPDATE*/
    void updateTienda(Long id,Tienda tienda);

    /*DELETE*/
    void deleteTienda(Long id);
}
