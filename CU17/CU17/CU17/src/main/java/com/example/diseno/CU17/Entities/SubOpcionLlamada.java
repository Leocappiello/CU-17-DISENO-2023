package com.example.diseno.CU17.Entities;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor @Getter @Setter
public class SubOpcionLlamada {
    private String nombre;
    private int nroOrden;
    private OpcionLlamada opcionLlamada;
    private List<Validacion> validacionRequerida;

    public boolean esNro(int nro) {
        if (nro == this.nroOrden) {
            return true;
        }
        return false;
    }

    public List<String> buscarValidaciones() {
        List<String> mensajeValidaciones = new ArrayList<String>();

        for (Validacion validacion : validacionRequerida) {
            mensajeValidaciones.add(validacion.getAudioMensajeValidacion());
        }

        return mensajeValidaciones;
    }
}
