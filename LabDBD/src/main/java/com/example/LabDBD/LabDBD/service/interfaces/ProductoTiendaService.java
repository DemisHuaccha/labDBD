package com.example.LabDBD.LabDBD.service.interfaces;

import com.example.LabDBD.LabDBD.entity.ProductoTienda;

import java.util.List;

public interface ProductoTiendaService {
    /*CREATE*/
    void crearProductoTienda(ProductoTienda pt);

    /*READ*/
    ProductoTienda getProductoTiendaById(Long id);
    List<ProductoTienda> getAllProductoTienda();

    /*UPDATE*/
    void updateProductoTienda(Long id, ProductoTienda productoTienda);

    /*DELETE*/
    void deleteProductoTienda(Long id);

}
