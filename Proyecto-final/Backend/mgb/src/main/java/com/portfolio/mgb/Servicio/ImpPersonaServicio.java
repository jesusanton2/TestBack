
package com.portfolio.mgb.Servicio;

import com.portfolio.mgb.Entidad.Persona;
import com.portfolio.mgb.Interfaz.IPersonaServicio;
import com.portfolio.mgb.Repositorio.IPersonaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaServicio implements IPersonaServicio {

    @Autowired IPersonaRepositorio ipersonaRepository;
    
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonaRepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        ipersonaRepository.save(persona);
    
    }
    
    @Override
    public void deletePersona(Long Id) {
        ipersonaRepository.deleteById(Id);
    }

    @Override
    public Persona findPersona(Long Id) {
        Persona persona= ipersonaRepository.findById(Id).orElse(null);
        return persona;
    }
    
    
    
}
