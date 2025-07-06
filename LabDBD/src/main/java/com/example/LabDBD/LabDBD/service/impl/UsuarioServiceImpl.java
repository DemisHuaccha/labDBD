package com.example.LabDBD.LabDBD.service.impl;
import com.example.LabDBD.LabDBD.entity.Usuario;
import com.example.LabDBD.LabDBD.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl {
    @Autowired
    private UsuarioRepository usuarioRepository;
    /*CREATE*/
    public void crearUsuario(Usuario usuario){
        usuarioRepository.save(usuario);
    }

    /*READ*/
    public Usuario getUsuarioById(Long id){
        return usuarioRepository.findById(id).orElse(null);
    }
    public List<Usuario> getAllUsuario(){
        return usuarioRepository.findAll();
    }

    /*UPDATE*/
    public void updateUsuario(Long id, Usuario usuario){
        Usuario existing = getUsuarioById(id);
        assert existing != null;
        existing.setNombre(usuario.getNombre());
        existing.setClave(usuario.getClave());
        existing.setCorreo(usuario.getCorreo());
        existing.setRol(usuario.getRol());
        existing.setRutUser(usuario.getRutUser());
        existing.setReferente(usuario.getReferente());
        usuarioRepository.save(existing);
    }

    /*DELETE*/
    public void deleteUsuario(Long id){
        Usuario existing = getUsuarioById(id);
        assert existing != null;
        usuarioRepository.delete(existing);
    }
}
