/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.mgb.Security.Service;

import com.portfolio.mgb.Security.Entity.Rol;
import com.portfolio.mgb.Security.Enums.RolNombre;
import com.portfolio.mgb.Security.Repository.IRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired IRolRepository iRol;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return iRol.findByRolNombre(rolNombre);
    }
    public void save(Rol rol){
        iRol.save(rol);
    }
    
}
