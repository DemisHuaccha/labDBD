package com.example.LabDBD.LabDBD.service.impl;
import com.example.LabDBD.LabDBD.entity.ListaDeseados;
import com.example.LabDBD.LabDBD.repository.ListaDeseadosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListaDeseadosServiceImpl {
    @Autowired
    private ListaDeseadosRepository listaDeseadosRepository;

    /*CREATE*/
    public void crearListaDeseados(ListaDeseados listaDeseados){
        listaDeseadosRepository.save(listaDeseados);
    }

    /*READ*/
    public ListaDeseados getListaDeseadosById(Long id){
        return listaDeseadosRepository.findById(id).orElse(null);
    }
    public List<ListaDeseados> getAllListaDeseados(){
        return listaDeseadosRepository.findAll();
    }

    /*UPDATE*/
    public void updateListaDeseados(Long id, ListaDeseados listaDeseados){
        ListaDeseados existing=listaDeseadosRepository.findById(id).orElse(null);
        assert existing != null;
        existing.setCantidad(listaDeseados.getCantidad());
        existing.setProducto(listaDeseados.getProducto());
        existing.setUsuario(listaDeseados.getUsuario());
        listaDeseadosRepository.save(existing);
    }

    /*DELETE*/
    public void deleteListadeseados(Long id){
        ListaDeseados existing=listaDeseadosRepository.findById(id).orElse(null);
        assert existing != null;
        listaDeseadosRepository.delete(existing);
    }

}
