package com.example.diseno.CU17.Entities;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Validacion {
    private String audioMensajeValidacion;
    private String nombre;
    private TipoInformacion tipo;
    private List<OpcionValidacion> opcionesValidacion;

    public List<OpcionValidacion> mostrarDatosLlamadaYValidacionesRequeridas(){
        return this.opcionesValidacion;
    }
}
