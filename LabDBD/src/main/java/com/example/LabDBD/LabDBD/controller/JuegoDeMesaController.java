package com.example.LabDBD.LabDBD.controller;


import com.example.LabDBD.LabDBD.entity.JuegoDeMesa;
import com.example.LabDBD.LabDBD.service.impl.JuegoDeMesaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/JuegoDeMesa")
public class JuegoDeMesaController {
    @Autowired
    private JuegoDeMesaServiceImpl service;

    /*Create*/
    @PostMapping("/crearJuegoDeMesa")
    public void create(@RequestBody JuegoDeMesa juegoDeMesa) {
        service.crearJuegoDeMesa(juegoDeMesa);
    }
    /*Read*/
    @GetMapping("/getAllJuegoDeMesa")
    public List<JuegoDeMesa> getAll() {
        return service.getAllJuegoDeMesa();
    }
    @GetMapping("/getJuegoDeMesa/{id}")
    public JuegoDeMesa getById(@PathVariable Long id) {
        return service.getJuegoDeMesaById(id);
    }

    /*Update*/
    @PutMapping("/updateJuegoDeMesa/{id}")
    public void update(@PathVariable Long id, @RequestBody JuegoDeMesa juegoDeMesa) {
        service.updateJuegoDeMesa(id, juegoDeMesa);
    }
    /*Delete*/
    @DeleteMapping("/deleteJuegoDeMesa/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteJuegoDeMesa(id);
    }
}
