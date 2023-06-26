package com.example.diseno.CU17.Entities;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter @AllArgsConstructor
public class OpcionLlamada {
    private String audioMensajeSubopciones;
    private String mensajeSubopciones;
    private String nombre;
    private int nroOrden;
    private List<Validacion> validacionesRequeridas;
    private CategoriaLlamada categoriaLlamada;
    private List<SubOpcionLlamada> subOpcionLlamada;

    public OpcionLlamada(String audioMensajeSubopciones, String mensajeSubopciones, String nombre, int nroOrden, List<Validacion> validacionesRequeridas, CategoriaLlamada  categoriaLlamada) {
        this.audioMensajeSubopciones = audioMensajeSubopciones;
        this.mensajeSubopciones = mensajeSubopciones;
        this.nombre = nombre;
        this.nroOrden = nroOrden;
        this.validacionesRequeridas = validacionesRequeridas;
        this.categoriaLlamada = categoriaLlamada;
    }

    public List<String> buscarValidaciones(SubOpcionLlamada subOpcionLlamada) {
        return subOpcionLlamada.buscarValidaciones();
    }

    public String getDescripcionConSubopcion(SubOpcionLlamada subopcionSeleccionada) {
        /* return this.nombre; // 12. */
        List<SubOpcionLlamada> subOpciones = this.getSubOpcionLlamada();

        for (SubOpcionLlamada  subopcion: subOpciones) {
            if (subopcion.getNombre() == subopcionSeleccionada.getNombre()) {
                return subopcionSeleccionada.getNombre(); // 12.
            }
        }

        return null;
    }
}
