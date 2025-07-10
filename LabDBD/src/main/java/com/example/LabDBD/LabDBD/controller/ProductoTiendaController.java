package com.example.LabDBD.LabDBD.controller;

import com.example.LabDBD.LabDBD.service.impl.ProductoTiendaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ProductoTienda")
public class ProductoTiendaController {
    @Autowired
    private ProductoTiendaServiceImpl service;
}
