package com.example.LabDBD.LabDBD.controller;


import com.example.LabDBD.LabDBD.entity.Valoracion;
import com.example.LabDBD.LabDBD.service.impl.ValoracionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Valoracion")
public class ValoracionController {
    @Autowired
    private ValoracionServiceImpl service;

    @PostMapping("/crearValoracion")
    public void create(@RequestBody Valoracion valoracion) {
        service.crearValoracion(valoracion);
    }
    /*Read*/
    @GetMapping("/getAllValoracion")
    public List<Valoracion> getAll() {
        return service.getAllValoracion();
    }
    @GetMapping("/getValoracionById/{id}")
    public Valoracion getById(@PathVariable Long id) {
        return service.getValoracionById(id);
    }

    /*Update*/
    @PutMapping("/updateValoracion/{id}")
    public void update(@PathVariable Long id, @RequestBody Valoracion valoracion) {
        service.updateValoracion(id, valoracion);
    }
    /*Delete*/
    @DeleteMapping("/deleteValoracion/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteValoracion(id);
    }

}
