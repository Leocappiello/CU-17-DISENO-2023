package com.example.diseno.CU17.Entities;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Perfil {
    private String descripcion;
    private String nombre;
    private List<Permiso> permisos;
}
