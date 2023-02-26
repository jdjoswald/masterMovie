/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.filmrater.filmrater.dao;

import java.util.List;
import java.util.Optional;
import com.filmrater.filmrater.model.Pais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author joswald
 */
@Repository
public class PaisDaoImpl implements IPaisDAO{
    
    @Autowired
    IPaisJPA paisJPA;

    @Override
    public List<Pais> buscarTodos() {
      
        return paisJPA.findAll(); 
    }

    @Override
    public Pais buscarPorId(Integer idPais) {
        
        Optional<Pais> optional = paisJPA.findById(idPais); 
        if (optional.isPresent()) {
        return optional.get();
        }
        return null;
       
    }

    @Override
    public Pais guardarPais(Pais pais) {
    return paisJPA.save(pais);
    }

    @Override
    public void actualizarPais(Pais pais) {
         paisJPA.save(pais);
    }

    @Override
    public void eliminarPais(Integer idPais) {
         paisJPA.deleteById(idPais);
    }
    
}
