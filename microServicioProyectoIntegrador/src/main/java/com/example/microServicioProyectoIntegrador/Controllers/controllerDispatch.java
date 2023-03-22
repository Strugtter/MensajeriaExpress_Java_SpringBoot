package com.example.microServicioProyectoIntegrador.Controllers;

import com.example.microServicioProyectoIntegrador.Models.Customer;
import com.example.microServicioProyectoIntegrador.Models.Dispatch;
import com.example.microServicioProyectoIntegrador.Models.ResponseDispatch;
import com.example.microServicioProyectoIntegrador.Models.UpdateDispatch;
import com.example.microServicioProyectoIntegrador.Services.ServiceDispatch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

public class controllerDispatch {



    @Autowired
    private ServiceDispatch serviceDispatch;


    @PostMapping("/dispatch")
    public ResponseDispatch addDispatchCedula(@RequestBody Dispatch dispatch){
        return this.serviceDispatch.addDispatch(dispatch);
    }

    @GetMapping("/dispatch/{numberGuia}")
    public Dispatch getDispatchGuia(@PathVariable ("numberGuia") int numeroGuia){
        return this.serviceDispatch.getDispatchGuia(numeroGuia);
    }

    @PutMapping("/dispatch")
    public ResponseDispatch updateDispatch(@RequestBody UpdateDispatch updateDispatch){
        return this.serviceDispatch.updateDispatch(updateDispatch);
    }

    @GetMapping("/dispatch")
    public Dispatch getDispatchGuiaState(@RequestParam String stateEnvio, @RequestParam int cedula){
        return this.serviceDispatch.getDispatch(stateEnvio, cedula);
    }
}
