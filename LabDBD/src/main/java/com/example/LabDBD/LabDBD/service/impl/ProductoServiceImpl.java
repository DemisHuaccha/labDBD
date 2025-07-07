package com.example.LabDBD.LabDBD.service.impl;
import com.example.LabDBD.LabDBD.entity.Producto;
import com.example.LabDBD.LabDBD.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl {
    @Autowired
    private ProductoRepository productoRepository;

    /*CREATE*/
    public void crearProducto(Producto producto){
        productoRepository.save(producto);
    }

    /*READ*/
    public Producto getProductoById(Long id){
        return productoRepository.findById(id).orElse(null);
    }
    public List<Producto> getAllProducto(){
        return productoRepository.findAll();
    }

    /*UPDATE*/
    public void updateProducto(Long id, Producto producto){
        Producto existing=productoRepository.findById(id).orElse(null);
        assert existing != null;
        existing.setIdProducto(producto.getIdProducto());
        existing.setDescripcion(producto.getDescripcion());
        existing.setNombreProducto(producto.getNombreProducto());
        existing.setPrecioProducto(producto.getPrecioProducto());
        existing.setStock(producto.getStock());
        existing.setImagen(producto.getImagen());
        productoRepository.save(existing);
    }

    /*DELETE*/
    public void deleteProducto(Long id){
        Producto existing=productoRepository.findById(id).orElse(null);
        assert existing != null;
        productoRepository.delete(existing);
    }
}
