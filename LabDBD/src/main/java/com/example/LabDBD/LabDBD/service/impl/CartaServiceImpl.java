package com.example.LabDBD.LabDBD.service.impl;
import com.example.LabDBD.LabDBD.entity.Carta;
import com.example.LabDBD.LabDBD.repository.CartaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartaServiceImpl {
    @Autowired
    private CartaRepository cartaRepository;

    /*CREATE*/
    public void crearCarta(Carta carta){
        cartaRepository.save(carta);
    }

    /*READ*/
    public Carta getCartaById(Long id){
        return cartaRepository.findById(id).orElse(null);
    }
    public List<Carta> getAllCarta(){
        return cartaRepository.findAll();
    }

    /*UPDATE*/
    public void updateCarta(Long id, Carta carta){
        Carta existing=cartaRepository.findById(id).orElse(null);
        assert existing != null;
        existing.setAno(carta.getAno());
        existing.setEstado(carta.getEstado());
        existing.setRareza(carta.getRareza());
        existing.setProducto(carta.getProducto());
        cartaRepository.save(existing);
    }

    /*DELETE*/
    public void deleteCarta(Long id){
        Carta existing=cartaRepository.findById(id).orElse(null);
        assert existing != null;
        cartaRepository.delete(existing);
    }

}
