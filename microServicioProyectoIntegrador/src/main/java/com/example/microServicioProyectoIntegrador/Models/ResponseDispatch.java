package com.example.microServicioProyectoIntegrador.Models;

public class ResponseDispatch {

    private String numberGuia;
    private String estadoEnvio;

    public ResponseDispatch(String numberGuia, String estadoEnvio) {
        this.numberGuia = numberGuia;
        this.estadoEnvio = estadoEnvio;
    }

    public String getNumberGuia() {
        return numberGuia;
    }

    public String getEstadoEnvio() {
        return estadoEnvio;
    }
}
