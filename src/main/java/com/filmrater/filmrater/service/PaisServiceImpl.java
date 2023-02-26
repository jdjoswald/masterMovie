/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.filmrater.filmrater.service;

import com.filmrater.filmrater.dao.IPaisDAO;
import java.util.List;
import com.filmrater.filmrater.model.Pais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author joswald
 */
@Service
public class PaisServiceImpl implements IPaisService{

    @Autowired
    IPaisDAO paisDao;

    @Override
    public List<Pais> buscarTodos() {
        return paisDao.buscarTodos();
    }

    @Override
    public Pais buscarPorId(Integer idPais) {
    return paisDao.buscarPorId(idPais);
    }

    @Override
    public Pais guardarPais(Pais pais) {
        
            return paisDao.guardarPais(pais);
       
      
    }

    @Override
    public void actualizarPais(Pais pais) {
         int id=pais.getId(); 
        if(paisDao.buscarPorId(id)!= null){
            paisDao.guardarPais(pais);
           
        }
         
    }

    @Override
    public boolean eliminarPais(Integer idPais) {
       
        if(paisDao.buscarPorId(idPais)!= null){
            paisDao.eliminarPais(idPais);
            return true;
        }
        return false;
    }
    
  
    
}
