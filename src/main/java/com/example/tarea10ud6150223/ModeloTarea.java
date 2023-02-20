package com.example.tarea10ud6150223;

import java.util.Properties;

public class ModeloTarea {
    Properties GuardarTarea = new Properties();
    // vamos a crear el método para poder crear la tarea.
    public void CrearTarea(String TituloTareaNuevo,String DescTareaNuevo){
        // creamos el objeto de properties para poder guardar la Tarea

        GuardarTarea.setProperty(TituloTareaNuevo,DescTareaNuevo);
    }

    public void BorrarTarea(String TituloTarea){
        GuardarTarea.remove(TituloTarea);
    }
    public void ModificarTarea(String TituloTareaEditar,String DescTareaEditar){
        BorrarTarea(TituloTareaEditar);
        CrearTarea(TituloTareaEditar,DescTareaEditar);
    }



  /*
    // metemos los datos de la Tarea
        GuardarTarea.setProperty(TituloTareaNuevo.getText(),DescTareaNuevo.getText());*/

}
