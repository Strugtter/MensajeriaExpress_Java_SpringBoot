package com.example.microServicioProyectoIntegrador.Models;

public class Customer {

    private int cedula;
    private String nombre;
    private String Apellido;
    private long celular;
    private String correoElectronico;
    private String direccionResidencia;
    private String ciudad;


    public Customer(){

    }
    public Customer(int cedula, String nombre, String apellido, long celular, String correoElectronico, String direccionResidencia, String ciudad) {

        this.cedula = cedula;
        this.nombre = nombre;
        this.Apellido = apellido;
        this.celular = celular;
        this.correoElectronico = correoElectronico;
        this.direccionResidencia = direccionResidencia;
        this.ciudad = ciudad;
    }

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public long getCelular() {
        return celular;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public String getCiudad() {
        return ciudad;
    }
}
