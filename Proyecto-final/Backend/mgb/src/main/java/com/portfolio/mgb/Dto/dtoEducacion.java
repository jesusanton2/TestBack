/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.mgb.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author ANTON
 */
public class dtoEducacion {
    
    
    @NotBlank
    private String nombreEd;
    @NotBlank
    private String contenidoEd;

    public dtoEducacion() {
    }
    
    public String getNombreEd() {
        return nombreEd;
    }

    public void setNombreEd(String nombreE) {
        this.nombreEd = nombreE;
    }

    public String getContenidoEd() {
        return contenidoEd;
    }

    public void setContenidoEd(String contenidoE) {
        this.contenidoEd = contenidoE;
    }
    
}
