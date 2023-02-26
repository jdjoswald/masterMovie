/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.filmrater.filmrater.service;

import com.filmrater.filmrater.model.Pais;
import com.filmrater.filmrater.model.Pelicula;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.filmrater.filmrater.dao.IPeliculaDAO;

/**
 *
 * @author joswald
 */
@Service
public class PeliculaServiceImpl implements IpeliculaService{
    
    @Autowired
    IPeliculaDAO peliculaDao;

    @Override
    public List<Pelicula> buscarTodos() {
        return peliculaDao.buscarTodos();
    }

    @Override
    public Pelicula buscarPorId(Integer idPelicula) {
        return peliculaDao.buscarPorId(idPelicula);
    }

    @Override
    public Pelicula guardarPelicula(Pelicula pelicula) {
        
       peliculaDao.guardarPelicula(pelicula);
       return pelicula;
         
    }

    @Override
    public Pelicula actualizarPelicula(Pelicula pelicula) {
         return peliculaDao.actualizarPelicula(pelicula);
    }

    @Override
    public boolean eliminarPelicula(Integer idPelicula) {
        peliculaDao.eliminarPelicula(idPelicula);
        return true;
    }

    @Override
    public  List<Pelicula> buscarPorTitulo(String titulo) {
        return peliculaDao.buscarPorTitulo(titulo);
    }

    @Override
    public List<Pelicula> buscarPorGenero(Integer genero) {
        return null;
    }

    @Override
    public List<Pelicula> buscarPorActor(Integer actor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
