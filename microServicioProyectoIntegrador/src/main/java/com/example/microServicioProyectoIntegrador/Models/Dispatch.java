package com.example.microServicioProyectoIntegrador.Models;

public class Dispatch {
    private int cedulaClient;
    private String cityOrigin;
    private String cityDestination;
    private String addressDestination;
    private String nameRecive;
    private long phone;
    private int insuredvalue;
    private int weight;

    public Dispatch (){

    }

    public Dispatch(int cedulaClient, String cityOrigin, String cityDestination, String addressDestination, String nameRecive, long phone, int insuredvalue, int weight) {
        this.cedulaClient = cedulaClient;
        this.cityOrigin = cityOrigin;
        this.cityDestination = cityDestination;
        this.addressDestination = addressDestination;
        this.nameRecive = nameRecive;
        this.phone = phone;
        this.insuredvalue = insuredvalue;
        this.weight = weight;
    }

    public int getCedulaClient() {
        return cedulaClient;
    }

    public String getCityOrigin() {
        return cityOrigin;
    }

    public String getCityDestination() {
        return cityDestination;
    }

    public String getAddressDestination() {
        return addressDestination;
    }

    public String getNameRecive() {
        return nameRecive;
    }

    public long getPhone() {
        return phone;
    }

    public int getInsuredvalue() {
        return insuredvalue;
    }

    public int getWeight() {
        return weight;
    }
}
