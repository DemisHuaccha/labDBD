package com.example.LabDBD.LabDBD.controller;

import com.example.LabDBD.LabDBD.entity.Usuario;
import com.example.LabDBD.LabDBD.service.impl.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Usuario")
public class UsuarioController {
    @Autowired
    private UsuarioServiceImpl service;

    @PostMapping("/crearUsuario")
    public void create(@RequestBody Usuario usuario) {
        service.crearUsuario(usuario);
    }
    /*Read*/
    @GetMapping("/getAllUsuario")
    public List<Usuario> getAll() {
        return service.getAllUsuario();
    }
    @GetMapping("/getUsuarioById/{id}")
    public Usuario getById(@PathVariable Long id) {
        return service.getUsuarioById(id);
    }

    /*Update*/
    @PutMapping("/updateUsuario/{id}")
    public void update(@PathVariable Long id, @RequestBody Usuario usuario) {
        service.updateUsuario(id, usuario);
    }
    /*Delete*/
    @DeleteMapping("/deleteUsuario/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteUsuario(id);
    }

}
