package com.example.microServicioProyectoIntegrador.Services;


import com.example.microServicioProyectoIntegrador.Models.Dispatch;
import com.example.microServicioProyectoIntegrador.Models.ResponseDispatch;
import com.example.microServicioProyectoIntegrador.Models.UpdateDispatch;

public class ServiceDispatch {


    public ResponseDispatch addDispatch(Dispatch dispatch){
       return  new ResponseDispatch("numeroGuia","estadoEnvio");
    }



    public ResponseDispatch updateDispatch(UpdateDispatch dispatch){
        return new ResponseDispatch("numeroGuia","estadoEnvio");
    }

    public void deleteDispatch(int cedula){

    }

    public Dispatch getDispatchGuia(int numberGuia){
        return new Dispatch();
    }

    public Dispatch getDispatch(String stateEnvio, int cedula){
        return new Dispatch();
    }
}

