/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.filmrater.filmrater.dao;

import com.filmrater.filmrater.model.Genero;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author joswald
 */
@Repository
public class GeneroDaoImpl implements IGeneroDAO{
    
      @Autowired
      IGeneroJPA generoJPA;

    @Override
    public List<Genero> buscarTodos() {
        return generoJPA.findAll();
    }

    @Override
    public Genero buscarPorId(Integer idGenero) {
        
        Optional<Genero> optional = generoJPA.findById(idGenero); 
        if (optional.isPresent()) {
        return optional.get();
        }
        return null;
    }

    @Override
    public Genero guardarGenero(Genero genero) {
        return generoJPA.save(genero);
    }

    @Override
    public void actualizarGenero(Genero genero) {
        generoJPA.save(genero);
    }

    @Override
    public void eliminarGenero(Integer idGenero) {
        generoJPA.deleteById(idGenero);
    }
    
}
