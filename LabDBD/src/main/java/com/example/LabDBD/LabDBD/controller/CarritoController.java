package com.example.LabDBD.LabDBD.controller;

import com.example.LabDBD.LabDBD.entity.Carrito;
import com.example.LabDBD.LabDBD.service.impl.CarritoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Carrito")
public class CarritoController {

    @Autowired
    private CarritoServiceImpl service;

    /*Create*/
    @PostMapping("/crearCarrito")
    public void create(@RequestBody Carrito carrito) {
        service.crearCarrito(carrito);
    }
    /*Read*/
    @GetMapping("/getAllCarrito")
    public List<Carrito> getAlllist() {
        return service.getAllCarrito();
    }
    @GetMapping("(/getCarritoById/{id}")
    public Carrito getById(@PathVariable Long id) {
        return service.getCarritoById(id);
    }
    /*
    @GetMapping("/getBoletaByRut/{rut}")
    public Boleta getByRut(@PathVariable String rut) {
        return service.getBoletaByRut(rut);
    }
*/
    /*Update*/
    @PutMapping("/updateCarrito/{id}")
    public void update(@PathVariable Long id, @RequestBody Carrito carrito) {
        service.updateCarrito(id, carrito);
    }
    /*Delete*/
    @DeleteMapping("/deleteCarrito/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.deleteCarrito(id);
        return ResponseEntity.noContent().build();
    }

}
