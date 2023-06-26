package com.example.diseno.CU17.Entities;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OpcionValidacion {
    private boolean correcta;
    private String descripcion;
    private List<Validacion> validacion;

    public OpcionValidacion(boolean correcta, String descripcion) {
        this.correcta = correcta;
        this.descripcion = descripcion;
    }
}
