package com.example.microServicioProyectoIntegrador.Controllers;

import com.example.microServicioProyectoIntegrador.Models.Customer;
import com.example.microServicioProyectoIntegrador.Services.ServiceCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class controllerCustomer {

    @Autowired
    private ServiceCustomer serviceCustomer;


    @PostMapping("/customer")
    public void addCustomer(@RequestBody Customer customer){
        this.serviceCustomer.addCustomer(customer);
    }

    @PutMapping("/customer")
    public void updateCustomer(@RequestBody Customer customer){
        this.serviceCustomer.updateCustomer(customer);
    }

    @DeleteMapping("/customer/{cedula}")
    public void deleteCustomer(@PathVariable("cedula") int cedula ){
        this.serviceCustomer.deleteCustomer(cedula);
    }

    @GetMapping("/customer/{cedula}")
    public Customer getCustomerCedula(@PathVariable ("cedula") int cedula){
        return this.serviceCustomer.getCustomerCedula(cedula);
    }

}
