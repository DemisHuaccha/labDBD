package com.example.LabDBD.LabDBD.controller;


import com.example.LabDBD.LabDBD.entity.Carta;
import com.example.LabDBD.LabDBD.service.impl.CartaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/carta")
public class CartaController {

    @Autowired
    private CartaServiceImpl service;

    /*Create*/
    @PostMapping("/crearDireccion")
    public void create(@RequestBody Carta carta) {
        service.crearCarta(carta);
    }
    /*Read*/
    @GetMapping("/getAllDireccion")
    public List<Carta> getAll() {
        return service.getAllCarta();
    }
    @GetMapping("/getJuegoDeMesa/{id}")
    public Carta getById(@PathVariable Long id) {
        return service.getCartaById(id);
    }

    /*Update*/
    @PutMapping("/updateJuegoDeMesa/{id}")
    public void update(@PathVariable Long id, @RequestBody Carta carta) {
        service.updateCarta(id, carta);
    }
    /*Delete*/
    @DeleteMapping("/deleteJuegoDeMesa/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteCarta(id);
    }
}
