package com.example.LabDBD.LabDBD.service.interfaces;

import com.example.LabDBD.LabDBD.entity.Carrito;

import java.util.List;

public interface CarritoService {
    /*CREATE*/
    void crearCarrito(Carrito carrito);

    /*READ*/
    Carrito getCarritoById(Long id);
    List<Carrito> getAllCarrito();

    /*UPDATE*/
    void updateCarrito(Long id, Carrito carrito);

    /*DELETE*/
    void deleteCarrito(Long id);
}
