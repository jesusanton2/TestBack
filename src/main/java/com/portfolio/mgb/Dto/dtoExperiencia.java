
package com.portfolio.mgb.Dto;

import javax.validation.constraints.NotBlank;


public class dtoExperiencia {
    
    @NotBlank
    private String nombreE;
    @NotBlank
    private String contenidoE;

    public dtoExperiencia() {
    }

    
    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getContenidoE() {
        return contenidoE;
    }

    public void setContenidoE(String contenidoE) {
        this.contenidoE = contenidoE;
    }
    
    
}
