package com.example.microServicioProyectoIntegrador.Models;

public class Employee {

    private int cedula;
    private String nombre;
    private String Apellido;
    private long celular;
    private String correoElectronico;
    private String direccionResidencia;
    private String ciudad;
    private int AntiguedadEmpresa;
    private String rh;
    private String tipoEmpleado;


    public Employee (){

    }
    public Employee(int cedula, String nombre, String apellido, long celular, String correoElectronico, String direccionResidencia, String ciudad, int antiguedadEmpresa, String rh, String tipoEmpleado) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.Apellido = apellido;
        this.celular = celular;
        this.correoElectronico = correoElectronico;
        this.direccionResidencia = direccionResidencia;
        this.ciudad = ciudad;
        this.AntiguedadEmpresa = antiguedadEmpresa;
        this.rh = rh;
        this.tipoEmpleado = tipoEmpleado;
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

    public int getAntiguedadEmpresa() {
        return AntiguedadEmpresa;
    }

    public String getRh() {
        return rh;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }
}
