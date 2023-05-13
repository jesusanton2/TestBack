/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.mgb.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
   @NotBlank
   private String nombreEd;
   
   @NotBlank
   private String contenidoEd;

    public Educacion() {
    }

    public Educacion(String nombreEd, String contenidoEd) {
        this.nombreEd = nombreEd;
        this.contenidoEd = contenidoEd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreEd() {
        return nombreEd;
    }

    public void setNombreEd(String nombreEd) {
        this.nombreEd = nombreEd;
    }

    public String getContenidoEd() {
        return contenidoEd;
    }

    public void setContenidoEd(String contenidoEd) {
        this.contenidoEd = contenidoEd;
    }
   
   
    
}
