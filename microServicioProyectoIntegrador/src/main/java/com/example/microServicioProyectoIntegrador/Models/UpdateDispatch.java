package com.example.microServicioProyectoIntegrador.Models;

public class UpdateDispatch {

    private long numeroGuia;
    private String estadoEnvio;
    private int cedulaEmpleado;

    public UpdateDispatch(long numeroGuia, String estadoEnvio, int cedulaEmpleado) {
        this.numeroGuia = numeroGuia;
        this.estadoEnvio = estadoEnvio;
        this.cedulaEmpleado = cedulaEmpleado;
    }

    public long getNumeroGuia() {
        return numeroGuia;
    }

    public String getEstadoEnvio() {
        return estadoEnvio;
    }

    public int getCedulaEmpleado() {
        return cedulaEmpleado;
    }
}
