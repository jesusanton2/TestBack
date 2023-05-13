/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.mgb.Controller;

import com.portfolio.mgb.Dto.dtoEducacion;

import com.portfolio.mgb.Entity.Educacion;

import com.portfolio.mgb.Security.Controller.Mensaje;
import com.portfolio.mgb.Service.ImpEducacionService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/educacion")
@CrossOrigin(origins = "http://localhost:4200")
public class ControllerEducacion {

    @Autowired
    ImpEducacionService eduServ;

    @GetMapping("/lista")
    public ResponseEntity<List<Educacion>> List() {
        List<Educacion> list = eduServ.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Educacion> getById(@PathVariable("id") int id) {
        if (!eduServ.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Educacion educacion = eduServ.getOne(id).get();
        return new ResponseEntity(educacion, HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<?> create(@RequestBody dtoEducacion dtoedu) {
        if (StringUtils.isBlank(dtoedu.getNombreEd())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if (eduServ.existsByNombreEd(dtoedu.getNombreEd())) {
            return new ResponseEntity(new Mensaje("Esa educacion ya existe"), HttpStatus.BAD_REQUEST);
        }

        Educacion educacion = new Educacion(dtoedu.getNombreEd(), dtoedu.getContenidoEd());
        eduServ.save(educacion);

        return new ResponseEntity(new Mensaje("Educacion agregada"), HttpStatus.OK);

    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoEducacion dtoedu) {

        if (!eduServ.existsById(id)) {
            return new ResponseEntity(new Mensaje("Este ID no existe"), HttpStatus.BAD_REQUEST);
        }

        if (eduServ.existsByNombreEd(dtoedu.getNombreEd()) && eduServ.getByNombreEd(dtoedu.getNombreEd()).get().getId() != id) {
            return new ResponseEntity(new Mensaje("Esa Educaion ya existe"), HttpStatus.BAD_REQUEST);
        }

        if (StringUtils.isBlank(dtoedu.getNombreEd())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }

        Educacion educacion = eduServ.getOne(id).get();
        educacion.setNombreEd(dtoedu.getNombreEd());
        educacion.setContenidoEd(dtoedu.getContenidoEd());

        eduServ.save(educacion);
        return new ResponseEntity(new Mensaje("Educacion actualizada"), HttpStatus.OK);
    }

    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!eduServ.existsById(id)) {
            return new ResponseEntity(new Mensaje("Este ID no existe"), HttpStatus.BAD_REQUEST);
        }

        eduServ.delete(id);

        return new ResponseEntity(new Mensaje("Educacion eliminada"), HttpStatus.OK);
    }
}
