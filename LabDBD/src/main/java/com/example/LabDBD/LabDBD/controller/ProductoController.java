package com.example.LabDBD.LabDBD.controller;

import com.example.LabDBD.LabDBD.entity.Producto;
import com.example.LabDBD.LabDBD.service.impl.ProductoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Producto")
public class ProductoController {
    @Autowired
    private ProductoServiceImpl service;

    /*Create*/
    @PostMapping("/crearProductoTienda")
    public void create(@RequestBody Producto producto) {
        service.crearProducto(producto);
    }
    /*Read*/
    @GetMapping("/getAllProducto")
    public List<Producto> getAll() {
        return service.getAllProducto();
    }
    @GetMapping("/getProductoById/{id}")
    public Producto getById(@PathVariable Long id) {
        return service.getProductoById(id);
    }

    /*Update*/
    @PutMapping("/updateProductoTienda/{id}")
    public void update(@PathVariable Long id, @RequestBody Producto producto) {
        service.updateProducto(id, producto);
    }
    /*Delete*/
    @DeleteMapping("/deleteProductoTienda/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteProducto(id);
    }
}
