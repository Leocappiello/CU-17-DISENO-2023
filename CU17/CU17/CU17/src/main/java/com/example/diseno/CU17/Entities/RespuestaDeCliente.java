package com.example.diseno.CU17.Entities;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RespuestaDeCliente {
    private LocalDate fechaEncuesta;
    private RespuestaPosible respuestaSeleccionada;
}
