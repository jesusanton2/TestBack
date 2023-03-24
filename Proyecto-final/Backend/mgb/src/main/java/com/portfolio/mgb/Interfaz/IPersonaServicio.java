
package com.portfolio.mgb.Interfaz;

import com.portfolio.mgb.Entidad.Persona;
import java.util.List;



public interface IPersonaServicio {
    
    //Traer lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo Persona
    
    public void savePersona(Persona persona);
    
    //Eliminar un usuario
    
    public void deletePersona(Long Id);
    
    //Buscar una persona
    
    public Persona findPersona(Long Id);
    
    
}
