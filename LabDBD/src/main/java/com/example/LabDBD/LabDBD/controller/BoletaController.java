package com.example.LabDBD.LabDBD.controller;


import com.example.LabDBD.LabDBD.entity.Boleta;
import com.example.LabDBD.LabDBD.service.impl.BoletaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/Boleta")
public class BoletaController {

    @Autowired
    private BoletaServiceImpl service;

    /*Create*/
    @PostMapping("/crearBoleta")
    public void create(@RequestBody Boleta boleta) {
        service.crearBoleta(boleta);
    }
    /*Read*/
    @GetMapping("/getAllBoletas")
    public List<Boleta> getAlllist() {
        return service.getAllBoletas();
    }
    @GetMapping("(/getBoletaById/{id}")
    public Boleta getById(@PathVariable Long id) {
        return service.getBoletaById(id);
    }
    /*
    @GetMapping("/getBoletaByRut/{rut}")
    public Boleta getByRut(@PathVariable String rut) {
        return service.getBoletaByRut(rut);
    }
*/
    /*Update*/
    @PutMapping("/updateBoleta/{id}")
    public void update(@PathVariable Long id, @RequestBody Boleta boleta) {
        service.updateBoleta(id, boleta);
    }
    /*Delete*/
    @DeleteMapping("/deleteBoleta/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.deleteBoleta(id);
        return ResponseEntity.noContent().build();
    }

}
