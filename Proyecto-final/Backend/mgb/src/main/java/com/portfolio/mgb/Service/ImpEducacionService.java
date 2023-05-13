/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.mgb.Service;

import com.portfolio.mgb.Entity.Educacion;
import com.portfolio.mgb.Repository.IEducacionRepo;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
@Transactional

public class ImpEducacionService {

@Autowired IEducacionRepo eduRepo;

    
public List<Educacion> list(){
    return eduRepo.findAll();
}

public Optional<Educacion> getOne(int id){
    return eduRepo.findById(id);
}

public boolean existsById(int id){
    return eduRepo.existsById(id);
}

public boolean existsByNombreEd(String nombreEd){
    return eduRepo.existsByNombreEd(nombreEd);
}

public void save(Educacion educ){
    eduRepo.save(educ);
}

public void delete(int id){
    eduRepo.deleteById(id);
}

public Optional<Educacion> getByNombreEd(String nombreEd){
    return eduRepo.findByNombreEd(nombreEd);
}
}
