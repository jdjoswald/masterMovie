/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.filmrater.filmrater.controller;

import java.util.List;
import com.filmrater.filmrater.model.Pais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.filmrater.filmrater.service.IPaisService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author joswald
 */
@RestController
@RequestMapping("pais")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PaisController {
    
    @Autowired
    IPaisService paisService;
    
    @GetMapping("/all")
    public List<Pais> buscarTodos() {
        return paisService.buscarTodos();
    }
    @GetMapping("/pais/{id}")
    public Pais paisPorId(@PathVariable("id") Integer id) {
        return paisService.buscarPorId(id);
    }
    
    @PostMapping("/save")
    public Pais guardarPais(@RequestBody Pais pais){
        
        return paisService.guardarPais(pais);
    }
    
   @DeleteMapping("/delete/{id}")
    public String eliminarPais(@PathVariable("id") Integer id) {
    return String.valueOf(paisService.eliminarPais(id));
 }
    
}
