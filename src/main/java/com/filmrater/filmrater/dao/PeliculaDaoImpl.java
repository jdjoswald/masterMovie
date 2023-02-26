/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.filmrater.filmrater.dao;

import com.filmrater.filmrater.model.Actor;
import com.filmrater.filmrater.model.Genero;
import com.filmrater.filmrater.model.Pais;
import com.filmrater.filmrater.model.Pelicula;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author joswald
 */
@Repository
public class PeliculaDaoImpl implements  IPeliculaDAO{
    @Autowired
    IPeliculaJPA peliculaJPA;

    @Override
    public List<Pelicula> buscarTodos() {
        return peliculaJPA.findAll();
    }

    @Override
    public Pelicula buscarPorId(Integer idPelicula) {
         Optional<Pelicula> optional = peliculaJPA.findById(idPelicula); 
    
            if (optional.isPresent()) {
         return optional.get();
         }
         return null;
    }

    @Override
    public void guardarPelicula(Pelicula pelicula) {
         peliculaJPA.save(pelicula);
    }

    @Override
    public Pelicula actualizarPelicula(Pelicula pelicula) {
        
        
         peliculaJPA.save(pelicula);
        return pelicula;
     
    }

    @Override
    public void eliminarPelicula(Integer idPelicula) {
        Pelicula pelicula= this.buscarPorId(idPelicula);
        pelicula.setActor(null);
        pelicula.setGenero(null);
        pelicula.setIdPais(null);
         peliculaJPA.delete(pelicula);
    }

   

    @Override
    public List<Pelicula> buscarPorTitulo(String titulo) {
        
        
         return peliculaJPA.findByTituloContainingIgnoreCase(titulo);   
    }
}
