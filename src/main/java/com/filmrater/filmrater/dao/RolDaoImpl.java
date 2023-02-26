/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.filmrater.filmrater.dao;

import com.filmrater.filmrater.model.Rol;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author joswald
 */
@Repository
public class RolDaoImpl implements IRolDAO{
    
    @Autowired
    IRolJPA rolJPA;

    @Override
    public List<Rol> buscarTodos() {
        return rolJPA.findAll();
      
    }

    @Override
    public Rol buscarPorId(Integer idRol) {
        Optional<Rol> optional = rolJPA.findById(idRol); 
    
            if (optional.isPresent()) {
         return optional.get();
         }
         return null;}

    @Override
    public void guardarRol(Rol rol) {
        rolJPA.save(rol);
    }

    @Override
    public void actualizarRol(Rol rol) {
        rolJPA.save(rol);
    }

    @Override
    public void eliminarRol(Integer idRol) {
      rolJPA.deleteById(idRol);
    }
    
}
