/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.filmrater.filmrater.service;

import com.filmrater.filmrater.dao.IGeneroDAO;
import com.filmrater.filmrater.model.Genero;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author joswald
 */
@Service
public class GeneroService implements IGeneroService{
    @Autowired
    IGeneroDAO generoDao;
    
    @Override
    public List<Genero> buscarTodos() {
        return generoDao.buscarTodos();
    }

    @Override
    public Genero buscarPorId(Integer idGenero) {
        return generoDao.buscarPorId(idGenero);
    }

    @Override
    public Genero guardarGenero(Genero genero) {
        return generoDao.guardarGenero(genero);
    }

    @Override
    public void actualizarGenero(Genero genero) {
        generoDao.actualizarGenero(genero);
    }

    @Override
    public boolean eliminarGenero(Integer idGenero) {
         
        if(generoDao.buscarPorId(idGenero)!= null){
            generoDao.eliminarGenero(idGenero);
            return true;
        }
        return false;
    }
    
}
