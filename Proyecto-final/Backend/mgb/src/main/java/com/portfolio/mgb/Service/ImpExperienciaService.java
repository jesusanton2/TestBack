/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.mgb.Service;

import com.portfolio.mgb.Entity.Experiencia;
import com.portfolio.mgb.Repository.IExperienciaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ImpExperienciaService {
    
    @Autowired IExperienciaRepository expRepo;
    
    
    public List<Experiencia> list(){
        return expRepo.findAll();
    }
    
    public Optional<Experiencia> getOne(int id){
        return expRepo.findById(id);
    }
    
   public Optional<Experiencia> getByNombreE(String nombreE){
       return expRepo.findByNombreE(nombreE);
   }
   
   public void save(Experiencia expe){
       expRepo.save(expe);
   }
   
   public void delete(int id){
       expRepo.deleteById(id);
   }
   
   public boolean existsById(int id){
   return    expRepo.existsById(id);
   }
  
   public boolean existsByNombreE(String nombreE){
       return expRepo.existsByNombreE(nombreE);
   }
  
}
    
