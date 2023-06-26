package com.example.diseno.CU17.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Estado {
    private String nombre;

    public boolean esEnCurso() {
        if (this.getNombre() == "En curso") {
            return true;
        }
        return false;
    }

    public boolean esFinalizada() {
        if (this.nombre == "Finalizada") {
            return true;
        }
        return false;
    }

    public boolean esIniciada() {
        if (this.nombre == "Iniciada") {
            return true;
        }
        return false;
    }
}
