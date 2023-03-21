package com.example.microServicioProyectoIntegrador.Controllers;


import com.example.microServicioProyectoIntegrador.Models.Employee;
import com.example.microServicioProyectoIntegrador.Services.ServiceEmployees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class controllerEmployees {

    @Autowired
    private ServiceEmployees serviceEmployess;


    @PostMapping("/employees")
    public void addEmployee(@RequestBody Employee employee){
        this.serviceEmployess.addEmployee(employee);
    }

    @PutMapping("/employees")
    public void updateEmployee(@RequestBody Employee employee){
        this.serviceEmployess.updateEmployee(employee);
    }

    @DeleteMapping("/employees/{cedula}")
    public void deleteEmployee(@PathVariable("cedula") int cedula){
        this.serviceEmployess.deleteEmployee(cedula);
    }

    @GetMapping("/employees/{cedula}")
    public Employee getEmployeeCedula(@PathVariable("cedula") int cedula){
        return serviceEmployess.getEmployeeCedula(cedula);
    }
}
