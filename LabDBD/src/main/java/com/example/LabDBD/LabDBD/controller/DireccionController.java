package com.example.LabDBD.LabDBD.controller;

import com.example.LabDBD.LabDBD.service.impl.DireccionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/direccion")
public class DireccionController {
    @Autowired
    private DireccionServiceImpl service;
}
