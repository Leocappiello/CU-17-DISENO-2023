package com.example.diseno.CU17.Entities;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class CategoriaLlamada {
    private String audioMensajeOpciones;
    private String mensajeOpciones;
    private String nombre;
    private int nroOrden;
    private List<OpcionLlamada> opciones;

    public CategoriaLlamada(String audio, String mensaje, String nombre, int nroOrden) {
        this.audioMensajeOpciones = audio;
        this.mensajeOpciones = mensaje;
        this.nombre = nombre;
        this.nroOrden = nroOrden;
    }

    public String getDescripcionCompletaCategoriaYOpcion(SubOpcionLlamada subopcionSeleccionada, OpcionLlamada opcionSeleccionada) {
        List<OpcionLlamada> opcionesCatSeleccionada = this.getOpciones();
        
        for (OpcionLlamada opcion : opcionesCatSeleccionada) {
            if (opcion.getNombre() == opcionSeleccionada.getNombre()) {
                String subopcion= opcion.getDescripcionConSubopcion(subopcionSeleccionada);
                return opcion.getNombre() + " - "+ subopcion;
            }
        }

        return "";
    }

    public List<String> buscarValidaciones(OpcionLlamada opcionLlamada, SubOpcionLlamada subopcion) {
        List<String> opciones = opcionLlamada.buscarValidaciones(subopcion);
        return opciones;
    }
}
