package com.example.diseno.CU17.Entities;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Usuario {
    private boolean activo;
    private LocalDate fechaAlta;
    private String nombreUsuario;
    private String password;
    private Perfil perfil;
}
