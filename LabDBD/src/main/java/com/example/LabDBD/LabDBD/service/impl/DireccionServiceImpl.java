package com.example.LabDBD.LabDBD.service.impl;
import com.example.LabDBD.LabDBD.entity.Direccion;
import com.example.LabDBD.LabDBD.repository.DireccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DireccionServiceImpl {
    @Autowired
    private DireccionRepository direccionRepository;
    /*CREATE*/
    public void crearDireccion(Direccion direccion){
        direccionRepository.save(direccion);
    }

    /*READ*/
    public Direccion getDireccionById(Long id){
        return direccionRepository.findById(id).orElse(null);
    }
    public List<Direccion> getAllDireccion(){
        return direccionRepository.findAll();
    }

    /*UPDATE*/
    public void updateDireccion(Long id, Direccion direccion){
        Direccion existing= direccionRepository.findById(id).orElse(null);
        assert existing != null;
        existing.setCalle(direccion.getCalle());
        existing.setUsuario(direccion.getUsuario());
        existing.setId(direccion.getId());
        existing.setNumero(direccion.getNumero());
        existing.setRegion(direccion.getRegion());
        existing.setTienda(direccion.getTienda());
        direccionRepository.save(existing);

    }

    /*DELETE*/
    public void deleteDireccion(Long id){
        Direccion existing= direccionRepository.findById(id).orElse(null);
        assert existing != null;
        direccionRepository.delete(existing);
    }

}
