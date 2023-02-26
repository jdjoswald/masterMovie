/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.filmrater.filmrater.controller;

import com.filmrater.filmrater.model.Genero;
import com.filmrater.filmrater.service.IGeneroService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
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
@RequestMapping("genero")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class GeneroController {
    
     @Autowired
     IGeneroService generoService;
     
    @GetMapping("/all")
    public List<Genero> buscarTodos() {
        return generoService.buscarTodos();
    }
    @GetMapping("/genero/{id}")
    public Genero generoPorId(@PathVariable("id") Integer id) {
        return generoService.buscarPorId(id);
    }
    @PostMapping("/save")
    public Genero guardarGenero(@RequestBody Genero genero){
        generoService.guardarGenero(genero);
        return genero;
    }
    @DeleteMapping("/delete/{id}")
    public String eliminarPais(@PathVariable("id") Integer id) {
    return String.valueOf(generoService.eliminarGenero(id));
 }
     
}
