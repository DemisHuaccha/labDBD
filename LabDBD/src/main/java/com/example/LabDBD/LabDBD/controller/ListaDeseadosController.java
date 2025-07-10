package com.example.LabDBD.LabDBD.controller;

import com.example.LabDBD.LabDBD.service.impl.ListaDeseadosServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ListaDeseados")
public class ListaDeseadosController {
    @Autowired
    private ListaDeseadosServiceImpl service;
}
