package com.example.diseno.CU17.Entities;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CambioEstado {
    private LocalDateTime fechaHoraInicio;
    private Estado estado;

    public boolean esEstadoInicial() {
        return true;
    }

    public boolean esUltimoEstado() {
        return true;
    }
}
