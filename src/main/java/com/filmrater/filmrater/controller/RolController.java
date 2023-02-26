/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.filmrater.filmrater.controller;

import com.filmrater.filmrater.model.Rol;
import com.filmrater.filmrater.service.IRolService;
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
@RequestMapping("Rol")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class RolController {
    
    @Autowired
    IRolService rolService;
            
    @GetMapping("/all")
    public List<Rol> buscarTodos() {
        return rolService.buscarTodos();
    }
    @GetMapping("/rol/{id}")
    public Rol rolPorId(@PathVariable("id") Integer id) {
        return rolService.buscarPorId(id);
    }
    @PostMapping("/save")
    public Rol guardarRol(@RequestBody Rol rol){
        rolService.guardarRol(rol);
        return rol;
    }
    
    
}
