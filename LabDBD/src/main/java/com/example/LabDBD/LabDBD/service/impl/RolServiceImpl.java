package com.example.LabDBD.LabDBD.service.impl;

import com.example.LabDBD.LabDBD.entity.Rol;
import com.example.LabDBD.LabDBD.repository.RolRepository;
import com.example.LabDBD.LabDBD.service.interfaces.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolServiceImpl implements RolService {
    @Autowired
    private RolRepository rolRepository;
    /*CREATE*/
    public void crearRol(Rol rol) {
        rolRepository.save(rol);
    }
    /*READ*/
    public Rol getRolById(Long id) {
        return rolRepository.findById(id).orElse(null);
    }

    public List<Rol> getAllRol() {
        return rolRepository.findAll();
    }

    /*UPDATE*/

    public void updateRol(Long id, Rol rol) {
        Rol existing = getRolById(id);
        assert existing != null;
        existing.setIdRol(rol.getIdRol());
        existing.setNombreRol(rol.getNombreRol());
        rolRepository.save(existing);
    }

    /*DELETE*/
    public void deleteRol(Long id) {
        Rol existing = getRolById(id);
        assert existing != null;
        rolRepository.delete(existing);
    }
}
