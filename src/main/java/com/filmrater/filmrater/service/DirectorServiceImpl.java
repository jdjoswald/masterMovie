/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.filmrater.filmrater.service;

import com.filmrater.filmrater.dao.IDirectorDAO;
import com.filmrater.filmrater.model.Director;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author joswald
 */
@Service
public class DirectorServiceImpl implements IDirectorService{
    @Autowired
    IDirectorDAO directorDao;

    @Override
    public List<Director> buscarTodos() {
        return directorDao.buscarTodos();  }

    @Override
    public Director buscarPorId(Integer idDirector) {
       return directorDao.buscarPorId(idDirector);
    }

    @Override
    public Director guardarDirector(Director director) {
        return directorDao.guardarDirector(director);
    }

    @Override
    public void actualizarDirector(Director director) {
        directorDao.actualizarDirector(director);
    }

    @Override
    public boolean eliminarDirector(Integer idDirector) {
        
         if(directorDao.buscarPorId(idDirector)!= null){
            directorDao.eliminarDirector(idDirector);
            return true;
        }
        return false;
        
    }
    
    
}
