package com.example.diseno.CU17.Entities;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Cliente {
    private int dni;
    private String  nombreCompleto;
    private int nroCelular;
    private List<InformacionCliente> info;
    
    public boolean esCliente(Cliente cliente) {
        if (cliente.toString() == cliente.nombreCompleto) {
            return true;
        }
        return false;
    }

    public void esValidacion() {
        for (InformacionCliente informacionCliente : info) {
            informacionCliente.esValidacion(informacionCliente.getOpcionCorrecta());
        }
    }

    public Boolean esInformacionCorrecta(boolean validacion) {
        if (validacion) {
            return true;
        }
        return false;
    }

}
