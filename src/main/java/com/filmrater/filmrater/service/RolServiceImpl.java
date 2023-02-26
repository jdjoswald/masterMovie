/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.filmrater.filmrater.service;

import com.filmrater.filmrater.dao.IRolDAO;
import com.filmrater.filmrater.model.Rol;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author joswald
 */
@Service
public class RolServiceImpl implements IRolService{

    
    @Autowired
    IRolDAO rolDao;
    
    @Override
    public List<Rol> buscarTodos() {
        return rolDao.buscarTodos();
    }

    @Override
    public Rol buscarPorId(Integer idRol) {
        return rolDao.buscarPorId(idRol);
    }

    @Override
    public boolean guardarRol(Rol rol) {
        
       
            rolDao.guardarRol(rol);
            return true;
      
    }

    @Override
    public void actualizarRol(Rol rol) {
        rolDao.guardarRol(rol);
    }

    @Override
    public boolean eliminarRol(Integer idRol) {
        
        if(rolDao.buscarPorId(idRol)== null){
            rolDao.eliminarRol(idRol);
            return true;
        }
        return false;
        
       
    }
    
}
