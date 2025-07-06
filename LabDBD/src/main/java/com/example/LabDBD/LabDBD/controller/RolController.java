package com.example.LabDBD.LabDBD.controller;

import com.example.LabDBD.LabDBD.entity.Rol;
import com.example.LabDBD.LabDBD.service.impl.RolServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Rol")
public class RolController {
    @Autowired
    private RolServiceImpl service;

    /*Create*/
    @PostMapping("/crearRol")
    public void create(@RequestBody Rol rol) {
        service.crearRol(rol);
    }
    /*Read*/
    @GetMapping("/getAllRol")
    public List<Rol> getAll() {
        return service.getAllRol();
    }
    @GetMapping("/getRolById/{id}")
    public Rol getById(@PathVariable Long id) {
        return service.getRolById(id);
    }

    /*Update*/
    @PutMapping("/updateRol/{id}")
    public void update(@PathVariable Long id, @RequestBody Rol rol) {
        service.updateRol(id, rol);
    }
    /*Delete*/
    @DeleteMapping("/deleteRol/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteRol(id);
    }

}
