package com.example.LabDBD.LabDBD.service.impl;
import com.example.LabDBD.LabDBD.entity.Tienda;
import com.example.LabDBD.LabDBD.repository.TiendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TiendaServiceImpl {
    @Autowired
    private TiendaRepository tiendaRepository;

    /*CREATE*/
    public void crearTienda(Tienda tienda){
        tiendaRepository.save(tienda);
    }

    /*READ*/
    public Tienda getTiendaById(Long id){
        return tiendaRepository.findById(id).orElse(null);
    }
    public List<Tienda> getAllTienda(){
        return tiendaRepository.findAll();
    }

    /*UPDATE*/
    public void updateTienda(Long id,Tienda tienda){
        Tienda existing=tiendaRepository.findById(id).orElse(null);
        assert existing != null;
        existing.setIdTienda(tienda.getIdTienda());
        existing.setNombre(tienda.getNombre());
        existing.setPropietario(tienda.getPropietario());
        tiendaRepository.save(existing);
    }

    /*DELETE*/
    public void deleteTienda(Long id){
        Tienda existing=tiendaRepository.findById(id).orElse(null);
        assert existing != null;
        tiendaRepository.delete(existing);
    }
}
