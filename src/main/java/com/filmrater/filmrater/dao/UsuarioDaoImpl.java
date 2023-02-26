/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.filmrater.filmrater.dao;

import com.filmrater.filmrater.model.Usuario;
import com.filmrater.filmrater.service.RolServiceImpl;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author joswald
 */
@Repository
public class UsuarioDaoImpl implements IUsuarioDAO{
    
    @Autowired
    IUsuarioJPA usuarioJPA;
    

    @Override
    public List<Usuario> buscarTodos() {
        return usuarioJPA.findAll();
    }

    @Override
    public Usuario buscarPorId(Integer idUsuario) {
        
        Optional<Usuario> optional = usuarioJPA.findById(idUsuario); 
        if (optional.isPresent()) {
        return optional.get();
        }
        return null;
    }

    @Override
    public void guardarUsuario(Usuario usuario) {
        
        usuarioJPA.save(usuario);
    }

    @Override
    public void actualizarUsuario(Usuario usuario) {
        usuarioJPA.save(usuario);
    }

    @Override
    public void eliminarUsuario(Integer idUsuario) {
        usuarioJPA.deleteById(idUsuario);
    }
    
}
