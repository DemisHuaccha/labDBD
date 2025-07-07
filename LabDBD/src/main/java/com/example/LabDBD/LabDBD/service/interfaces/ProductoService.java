package com.example.LabDBD.LabDBD.service.interfaces;

import com.example.LabDBD.LabDBD.entity.Producto;

import java.util.List;

public interface ProductoService {
    /*CREATE*/
    void crearProducto(Producto producto);

    /*READ*/
    Producto getValoracionById(Long id);
    List<Producto> getAllValoracion();

    /*UPDATE*/
    void updateProducto(Long id, Producto producto);

    /*DELETE*/
    void deleteProducto(Long id);

}
