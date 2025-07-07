package com.example.LabDBD.LabDBD.service.impl;
import com.example.LabDBD.LabDBD.entity.JuegoDeMesa;
import com.example.LabDBD.LabDBD.repository.JuegoDeMesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JuegoDeMesaServiceImpl {
    @Autowired
    private JuegoDeMesaRepository juegoDeMesaRepository;

    /*CREATE*/
    public void crearJuegoDeMesa(JuegoDeMesa juegoDeMesa){
        juegoDeMesaRepository.save(juegoDeMesa);
    }

    /*READ*/
    public JuegoDeMesa getJuegoDeMesaById(Long id){
        return juegoDeMesaRepository.findById(id).orElse(null);
    }
    public List<JuegoDeMesa> getAllJuegoDeMesa(){
        return juegoDeMesaRepository.findAll();
    }

    /*UPDATE*/
    public void updateJuegoDeMesa(Long id, JuegoDeMesa juegoDeMesa){
        JuegoDeMesa existing= juegoDeMesaRepository.findById(id).orElse(null);
        assert existing != null;
        existing.setTipo(juegoDeMesa.getTipo());
        existing.setProducto(juegoDeMesa.getProducto());
        juegoDeMesaRepository.save(existing);
    }

    /*DELETE*/
    public void deleteJuegoDeMesa(Long id){
        JuegoDeMesa existing= juegoDeMesaRepository.findById(id).orElse(null);
        assert existing != null;
        juegoDeMesaRepository.delete(existing);
    }

}
