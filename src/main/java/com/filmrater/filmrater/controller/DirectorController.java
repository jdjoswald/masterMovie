/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.filmrater.filmrater.controller;

import com.filmrater.filmrater.model.Director;
import com.filmrater.filmrater.service.IDirectorService;
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
@RequestMapping("director")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DirectorController {
    
    @Autowired
    IDirectorService directorervice;
    
    @GetMapping("/all")
    public List<Director> buscarTodos() {
        return directorervice.buscarTodos();
    }
    @GetMapping("/director/{id}")
    public Director paisPorId(@PathVariable("id") Integer id) {
        return directorervice.buscarPorId(id);
    }
    @CrossOrigin(origins = "http://localhost:8090")
    @PostMapping("/save")
    public Director guardarPais(@RequestBody Director director){
        
        return directorervice.guardarDirector(director);
    }
    @DeleteMapping("/delete/{id}")
    public String eliminarPais(@PathVariable("id") Integer id) {
    return String.valueOf(directorervice.eliminarDirector(id));
 }
    
    
}
