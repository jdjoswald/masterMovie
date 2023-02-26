/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.filmrater.filmrater.dao;

import com.filmrater.filmrater.model.Director;
import com.filmrater.filmrater.model.Pais;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author joswald
 */
@Repository
public class DirectorDaoImpl implements IDirectorDAO{
    
    @Autowired
    IDirectorJPA directorJPA;

    @Override
    public List<Director> buscarTodos() {
        return directorJPA.findAll();}

    @Override
    public Director buscarPorId(Integer idDirector) {
        Optional<Director> optional = directorJPA.findById(idDirector); 
        if (optional.isPresent()) {
        return optional.get();
        }
        return null;
    }

    @Override
    public Director guardarDirector(Director director) {
        return directorJPA.save(director);}

    @Override
    public void actualizarDirector(Director director) {
         directorJPA.save(director);
    }

    @Override
    public void eliminarDirector(Integer idDirector) {
       directorJPA.deleteById(idDirector);  }
    
    
    
}
