package com.example.LabDBD.LabDBD.service.impl;

import com.example.LabDBD.LabDBD.entity.Boleta;
import com.example.LabDBD.LabDBD.repository.BoletaRepository;
import com.example.LabDBD.LabDBD.service.interfaces.BoletaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoletaServiceImpl implements BoletaService {

    @Autowired
    private BoletaRepository boletaRepository;

    /*CREATE*/
    public void crearBoleta(Boleta boleta) {
        boletaRepository.save(boleta);
    }
    /*READ*/
    public Boleta getBoletaById(Long id) {
        return boletaRepository.findById(id).orElse(null);
    }

    public List<Boleta> getAllBoletas() {
        return boletaRepository.findAll();
    }

    /*UPDATE*/

    public void updateBoleta(Long id, Boleta boleta) {
        Boleta existing = getBoletaById(id);
        existing.setFecha(boleta.getFecha());
        existing.setMetodoPago(boleta.getMetodoPago());
        existing.setUsuario(boleta.getUsuario());
        boletaRepository.save(existing);
    }

    /*DELETE*/
    public void deleteBoleta(Long id) {
        Boleta existing = getBoletaById(id);
        boletaRepository.delete(existing);
    }
}
