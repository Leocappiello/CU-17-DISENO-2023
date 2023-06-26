package com.example.diseno.CU17.Entities;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor @Getter @Setter
public class Pregunta {
    private String pregunta;
    private ArrayList<RespuestaPosible> respuesta;
}
