/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.mgb.Service;

import com.portfolio.mgb.Entity.Persona;
import com.portfolio.mgb.Repository.IPersonaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ImpPersonaService {

    @Autowired IPersonaRepository iPers;
    
    
    public List<Persona> list() {
       return iPers.findAll();
    }
    
    public Optional<Persona> getOne(int id){
        return iPers.findById(id);
    }
    
    public Optional<Persona> getByNombre(String nombre){
        return iPers.findByNombre(nombre);
    }

    
    public void savePersona(Persona persona) {
       iPers.save(persona);
    }

    
    public void delete(int id) {
       iPers.deleteById(id);
    }
    
    public boolean existsById(int id){
        return iPers.existsById(id);
    }
    public boolean existsByNombre(String nombre){
        return iPers.existsByNombre(nombre);
    }

    
    public Persona findPersona(int id) {
       Persona persona = iPers.findById(id).orElse(null);
       return persona;
    }
    
}
