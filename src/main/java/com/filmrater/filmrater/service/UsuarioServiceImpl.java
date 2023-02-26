/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.filmrater.filmrater.service;

import com.filmrater.filmrater.dao.IUsuarioDAO;
import com.filmrater.filmrater.model.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author joswald
 */
@Service
public class UsuarioServiceImpl implements IUsuarioService{

    @Autowired
    IUsuarioDAO usuarioDao;
    
    @Override
    public List<Usuario> buscarTodos() {
        return usuarioDao.buscarTodos();   }

    @Override
    public Usuario buscarPorId(Integer idUsuario) {
        return usuarioDao.buscarPorId(idUsuario);
    }

    @Override
    public Usuario guardarUsuario(Usuario usuario) {
         usuarioDao.guardarUsuario(usuario);
         return usuario;
    }

    @Override
    public void actualizarUsuario(Usuario usuario) {
        usuarioDao.guardarUsuario(usuario);
    }

    @Override
    public boolean eliminarUsuario(Integer idUsuario) {
        usuarioDao.eliminarUsuario(idUsuario); 
        return true;
    }
    
}
