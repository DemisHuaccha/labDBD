package com.example.LabDBD.LabDBD.controller;

import com.example.LabDBD.LabDBD.entity.MetodoPago;
import com.example.LabDBD.LabDBD.service.impl.MetodoPagoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/MetodoPago")
public class MetodoPagoController {
    @Autowired
    private MetodoPagoServiceImpl service;

    /*Create*/
    @PostMapping("/crearMetodoPago")
    public void create(@RequestBody MetodoPago metodoPago) {
        service.crearMetodoPago(metodoPago);
    }
    /*Read*/
    @GetMapping("/getAllMetodoPago")
    public List<MetodoPago> getAll() {
        return service.getAllMetodoPago();
    }
    @GetMapping("/getMetodoPago/{id}")
    public MetodoPago getById(@PathVariable Long id) {
        return service.getMetodoPagoById(id);
    }

    /*Update*/
    @PutMapping("/updateMetodoPago/{id}")
    public void update(@PathVariable Long id, @RequestBody MetodoPago metodoPago) {
        service.updateMetodoPago(id, metodoPago);
    }
    /*Delete*/
    @DeleteMapping("/deleteMetodoPago/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteMetodoPago(id);
    }

}
