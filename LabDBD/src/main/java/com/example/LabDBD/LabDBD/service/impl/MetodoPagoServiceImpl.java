package com.example.LabDBD.LabDBD.service.impl;
import com.example.LabDBD.LabDBD.entity.MetodoPago;
import com.example.LabDBD.LabDBD.repository.MetodoPagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MetodoPagoServiceImpl {
    @Autowired
    private MetodoPagoRepository metodoPagoRepository;
    /*CREATE*/
    public void crearMetodoPago(MetodoPago metodoPago){
        metodoPagoRepository.save(metodoPago);
    }

    /*READ*/
    public MetodoPago getMetodoPagoById(Long id){
        return metodoPagoRepository.findById(id).orElse(null);
    }
    public List<MetodoPago> getAllMetodoPago(){
        return metodoPagoRepository.findAll();
    }

    /*UPDATE*/
    public void updateMetodoPago(Long id, MetodoPago metodoPago){
        MetodoPago existing=metodoPagoRepository.findById(id).orElse(null);
        assert existing != null;
        existing.setNombreMetodo(metodoPago.getNombreMetodo());
        existing.setIdMetodo(metodoPago.getIdMetodo());
        metodoPagoRepository.save(existing);
    }

    /*DELETE*/
    public void deleteMetodoPago(Long id){
        MetodoPago existing=metodoPagoRepository.findById(id).orElse(null);
        assert existing != null;
        metodoPagoRepository.delete(existing);
    }
}
