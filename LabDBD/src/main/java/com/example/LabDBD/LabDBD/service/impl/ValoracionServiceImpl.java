package com.example.LabDBD.LabDBD.service.impl;
import com.example.LabDBD.LabDBD.entity.Valoracion;
import com.example.LabDBD.LabDBD.repository.ValoracionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ValoracionServiceImpl {
    @Autowired
    private ValoracionRepository valoracionRepository;

    /*CREATE*/
    public void crearValoracion(Valoracion valoracion){
        valoracionRepository.save(valoracion);
    }

    /*READ*/
    public Valoracion getValoracionById(Long id){
        return valoracionRepository.findById(id).orElse(null);
    }
    public List<Valoracion> getAllValoracion(){
        return valoracionRepository.findAll();
    }

    /*UPDATE*/
    public void updateValoracion(Long id, Valoracion valoracion){
        Valoracion existing = getValoracionById(id);
        assert existing != null;
        existing.setValoracion(valoracion.getValoracion());
        existing.setComentario(valoracion.getComentario());
        valoracionRepository.save(existing);
    }

    /*DELETE*/
    public void deleteValoracion(Long id){
        Valoracion existing = getValoracionById(id);
        assert existing != null;
        valoracionRepository.delete(existing);
    }

}
