package com.example.diseno.CU17.Entities;

import java.time.LocalDate;
import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class Encuesta {
    private String descripcion;
    private LocalDate fechaFinVigencia;
    private ArrayList<Pregunta> pregunta;
}
