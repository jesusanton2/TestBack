
package com.portfolio.mgb.Repositorio;

import com.portfolio.mgb.Entidad.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepositorio extends JpaRepository<Persona,Long>  {
    
}
