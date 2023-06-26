package com.example.diseno.CU17.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class InformacionCliente {
    private String datoAValidar;
    private OpcionValidacion opcionCorrecta;
    private TipoInformacion tipoInformacion;
    private Validacion validacion;

    public boolean esInformacionCorrecta(String validacion) {
        if (validacion == opcionCorrecta.toString()) {
            return true;
        }
        return false;
    }

    public boolean esValidacion(OpcionValidacion validacion) {
        return true;
    }
}
