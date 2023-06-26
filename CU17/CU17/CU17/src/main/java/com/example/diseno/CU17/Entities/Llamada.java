package com.example.diseno.CU17.Entities;

import java.time.Duration;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor @Getter @Setter
public class Llamada {
    private String descripcionOperador;
    private String detalleAccionRequerida;
    private String duracion;
    private String encuestaEnviada;
    private String observacionAuditor;
    private OpcionLlamada opcionSeleccionada;
    private SubOpcionLlamada subOpcionLlamada;
    private CambioEstado cambioEstado;
    private Estado estadoActual;
    private Cliente cliente;
    private RespuestaDeCliente respuestasDeEncuesta;
    private Usuario auditor;
    private Usuario operador;
    private Accion accionRequerida;

    public Llamada(String descripcionOperador, String detalleAccionRequerida, String duracion, String encuestaEnviada, String observacionAuditor, Cliente cliente, Estado estadoActual, CambioEstado cambioEstado) {
        this.descripcionOperador = descripcionOperador;
        this.detalleAccionRequerida = detalleAccionRequerida;
        this.duracion = duracion;
        this.encuestaEnviada = encuestaEnviada;
        this.observacionAuditor = observacionAuditor;
        this.cliente = cliente;
        this.estadoActual = estadoActual;
        this.cambioEstado = cambioEstado;
    }

    public CambioEstado tomadaPorOperador(Estado nuevoEstado) {
        return new CambioEstado(LocalDateTime.now(), nuevoEstado);
    }

    public int calcularDuracion(LocalDateTime fechaYHoraInicial, LocalDateTime fechaYHoraActual) {
        Duration duration = Duration.between(fechaYHoraInicial, fechaYHoraActual);
        long segundos = duration.toSeconds();
        return (int) segundos;
    }

    public boolean esDePeriodo() {
        return true;
    }

    public String getNombreClienteDeLLamada() {
        return this.cliente.getNombreCompleto(); // 9.
    }

    public void finalizarLlamada(LocalDateTime fechaYHora) {
        Estado estado = new Estado("Finalizada");
        CambioEstado cambioEstado = new CambioEstado(fechaYHora, estado);
        int segundos = this.calcularDuracion(fechaYHora, fechaYHora);
    }

}
