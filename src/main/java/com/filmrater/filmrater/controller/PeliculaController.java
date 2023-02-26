/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.filmrater.filmrater.controller;

import com.filmrater.filmrater.model.Actor;
import com.filmrater.filmrater.model.Director;
import com.filmrater.filmrater.model.Genero;
import com.filmrater.filmrater.model.Pelicula;
import com.filmrater.filmrater.service.IActorService;
import com.filmrater.filmrater.service.IDirectorService;
import com.filmrater.filmrater.service.IGeneroService;
import com.filmrater.filmrater.service.IPaisService;
import com.filmrater.filmrater.service.IpeliculaService;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author joswald
 */
@RestController
@RequestMapping("movie")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PeliculaController {
    
    @Autowired
    IpeliculaService peliculaService;
     @Autowired
    IPaisService paisService;
    @Autowired
    IGeneroService generoService;
    @Autowired
    IActorService actorService;
    @Autowired
    IDirectorService directorService;
    
     @GetMapping("/all")
    public List<Pelicula> buscarTodos() {
        return peliculaService.buscarTodos();
    }
    @GetMapping("/movie/{id}")
    public Pelicula PeliculaPorId(@PathVariable("id") Integer id) {
        //System.out.println(id+"kk");
        return peliculaService.buscarPorId(id);
    }
    
    @PostMapping("/save")
    @CrossOrigin(origins = "http://localhost:3000")
    public Pelicula guardarPelicula(@RequestBody Pelicula pelicula){
         
        
        if( pelicula.getGenero()!=null){
            Set<Genero> generos= new HashSet<Genero>();
            pelicula.getGenero().forEach((e) -> { 
                //System.out.println(e.getId()); 
                generos.add(generoService.buscarPorId(e.getId()));
            });
            pelicula.setGenero(generos);
        }
        if( pelicula.getActor()!=null){
            Set<Actor> actores= new HashSet<Actor>();
            pelicula.getActor().forEach((e) -> { 
                //System.out.println(e.getId()); 
                actores.add(actorService.buscarPorId(e.getId()));
            });
            pelicula.setActor(actores);
        }
        if( pelicula.getDirector()!=null){
            Set<Director> directores= new HashSet<Director>();
            pelicula.getDirector().forEach((e) -> { 
                //System.out.println(e.getId()); 
                directores.add(directorService.buscarPorId(e.getId()));
            });
            pelicula.setDirector(directores);
        }
        var pais=pelicula.getIdPais();
        pelicula.setIdPais(paisService.buscarPorId(pais.getId()));
        return peliculaService.guardarPelicula(pelicula);
    }
    @PutMapping("/update")
    public Pelicula editarPelicula(@RequestBody Pelicula pelicula){
        
      return  peliculaService.actualizarPelicula(pelicula);
        
    }
    
    @DeleteMapping("/delete/{id}")
    public String eliminarPelicula(@PathVariable("id") Integer id) {
    return String.valueOf(peliculaService.eliminarPelicula(id));
 }
    
     @GetMapping("/movie/title/{nombre}")
    public List<Pelicula> PeliculaPortitulo(@PathVariable("nombre") String nombre) {
        //System.out.println(id+"kk");
        return peliculaService.buscarPorTitulo(nombre);
    }
     @GetMapping("/movie/genero/{genero}")
    public Set<Pelicula> PeliculaPorgenero(@PathVariable("genero") Integer genero) {
        //System.out.println(id+"kk");
        
        return generoService.buscarPorId(genero).getPeliculas();
    }
    @GetMapping("/movie/actor/{actor}")
    public Set<Pelicula> PeliculaPoractor(@PathVariable("actor") Integer actor) {
        //System.out.println(id+"kk");
        return actorService.buscarPorId(actor).getPeliculas();
    }
}
