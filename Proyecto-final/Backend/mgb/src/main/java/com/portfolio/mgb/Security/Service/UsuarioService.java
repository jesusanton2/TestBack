/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.mgb.Security.Service;

import com.portfolio.mgb.Security.Entity.Usuario;
import com.portfolio.mgb.Security.Repository.IUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
    @Autowired IUsuarioRepository iUsuario;
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return iUsuario.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean existByNombreUsuario(String nombreUsuario){
        return iUsuario.existsByNombreUsuario(nombreUsuario);
    }
    public boolean existByEmail(String email){
        return iUsuario.existsByEmail(email);
    }
    
    public void save(Usuario usuario){
        iUsuario.save(usuario);
    }

    
}
