/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.filmrater.filmrater.controller;

import com.filmrater.filmrater.model.Pais;
import com.filmrater.filmrater.model.Usuario;
import com.filmrater.filmrater.service.IRolService;
import com.filmrater.filmrater.service.IUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author joswald
 */
@RestController
@RequestMapping("user")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsuarioController {
    @Autowired
    IUsuarioService usuarioService;
    @Autowired
    IRolService rolService;
    
    @GetMapping("/all")
    public List<Usuario> buscarTodos() {
        return usuarioService.buscarTodos();
    }
    @GetMapping("/user/{id}")
    public Usuario usuarioPorId(@PathVariable("id") Integer id) {
        return usuarioService.buscarPorId(id);
    }
    
    @PostMapping("/save")
    public Usuario guardarUsuario(@RequestBody Usuario usuario){
        var rol=usuario.getIdRol();
        usuario.setIdRol(rolService.buscarPorId(rol.getId()));
        return usuarioService.guardarUsuario(usuario);
    }
    
}
