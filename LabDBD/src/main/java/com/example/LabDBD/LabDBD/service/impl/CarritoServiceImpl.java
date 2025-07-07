package com.example.LabDBD.LabDBD.service.impl;

import com.example.LabDBD.LabDBD.entity.Carrito;
import com.example.LabDBD.LabDBD.repository.CarritoRepository;
import com.example.LabDBD.LabDBD.service.interfaces.CarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarritoServiceImpl {
    @Autowired
    private CarritoRepository carritoRepository;

    /*CREATE*/
    public void crearCarrito(Carrito carrito){
        carritoRepository.save(carrito);
    }

    /*READ*/
    public Carrito getCarritoById(Long id){
        return carritoRepository.findById(id).orElse(null);
    }
    public List<Carrito> getAllCarrito(){
        return carritoRepository.findAll();
    }

    /*UPDATE*/
    public void updateCarrito(Long id, Carrito carrito){
        Carrito existing= carritoRepository.findById(id).orElse(null);
        assert existing != null;
        existing.setCantidad(carrito.getCantidad());
        existing.setProducto(carrito.getProducto());
        existing.setUsuario(carrito.getUsuario());
        carritoRepository.save(existing);
    }

    /*DELETE*/
    public void deleteCarrito(Long id){
        Carrito existing= carritoRepository.findById(id).orElse(null);
        assert existing != null;
        carritoRepository.delete(existing);
    }

}
