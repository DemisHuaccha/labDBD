package com.example.LabDBD.LabDBD.service.impl;
import com.example.LabDBD.LabDBD.entity.ProductoTienda;
import com.example.LabDBD.LabDBD.repository.ProductoTiendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoTiendaServiceImpl {
    @Autowired
    private ProductoTiendaRepository productoTiendaRepository;
    /*CREATE*/
    public void crearProductoTienda(ProductoTienda pt){
        productoTiendaRepository.save(pt);
    }

    /*READ*/
    public ProductoTienda getProductoTiendaById(Long id){
        return productoTiendaRepository.findById(id).orElse(null);
    }
    public List<ProductoTienda> getAllProductoTienda(){
        return productoTiendaRepository.findAll();
    }

    /*UPDATE*/
    public void updateProductoTienda(Long id, ProductoTienda productoTienda){
        ProductoTienda existing=getProductoTiendaById(id);
        assert existing != null;
        existing.setProducto(productoTienda.getProducto());
        existing.setCantidad(productoTienda.getCantidad());
        productoTiendaRepository.save(existing);
    }

    /*DELETE*/
    public void deleteProductoTienda(Long id){
        ProductoTienda existing=getProductoTiendaById(id);
        assert existing != null;
        productoTiendaRepository.delete(existing);
    }

}
