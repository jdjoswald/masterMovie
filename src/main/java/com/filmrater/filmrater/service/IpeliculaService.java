/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.filmrater.filmrater.service;

import com.filmrater.filmrater.model.Pelicula;
import java.util.List;

/**
 *
 * @author joswald
 */
public interface IpeliculaService {
    
    List<Pelicula> buscarTodos();
    Pelicula buscarPorId(Integer idPelicula);
    List<Pelicula> buscarPorTitulo(String titulo);
    List<Pelicula> buscarPorGenero(Integer genero);
    List<Pelicula> buscarPorActor(Integer actor);
    Pelicula guardarPelicula(Pelicula pelicula);
    Pelicula actualizarPelicula(Pelicula pelicula);
    boolean eliminarPelicula(Integer idPelicula);
    
    
}
