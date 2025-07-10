package com.example.LabDBD.LabDBD.service.interfaces;

import com.example.LabDBD.LabDBD.entity.ListaDeseados;


import java.util.List;

public interface ListaDeseadosService {

    /*CREATE*/
    void crearListaDeseados(ListaDeseados listaDeseados);

    /*READ*/
    ListaDeseados getListaDeseadosById(Long id);
    List<ListaDeseados> getAllListaDeseados();

    /*UPDATE*/
    void updateListaDeseados(Long id, ListaDeseados listaDeseados);

    /*DELETE*/
    void deleteListadeseados(Long id);
}
