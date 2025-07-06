package com.example.LabDBD.LabDBD.service.interfaces;

import com.example.LabDBD.LabDBD.entity.Usuario;


import java.util.List;

public interface UsuarioService {
    /*CREATE*/
    void crearUsuario(Usuario usuario);

    /*READ*/
    Usuario getUsuarioById(Long id);
    List<Usuario> getAllUsuario();

    /*UPDATE*/
    void updateUsuario(Long id, Usuario usuario);

    /*DELETE*/
    void deleteUsuario(Long id);
}
