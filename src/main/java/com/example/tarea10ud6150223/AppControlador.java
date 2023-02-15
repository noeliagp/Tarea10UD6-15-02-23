package com.example.tarea10ud6150223;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AppControlador {
    @FXML
    public VBox CuadroCrear;

    public TextField nombreTareaCrear;
    public TextArea descTareaCrear;

    public Button CREAR;
    public VBox CuadroModificar;
    public TextField nombreTareaEditar;
    public TextArea descTareaEditar;
    public Button EDITAR;

    public HBox TareasMostradas;


    @FXML
     public void CREAR() throws IOException {
        // Creamos la variable donde guardamos el textField
        var nombreTareaNuevo = new String (nombreTareaCrear.getText());

    }

}