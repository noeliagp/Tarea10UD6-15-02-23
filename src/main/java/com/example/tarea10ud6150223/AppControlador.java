package com.example.tarea10ud6150223;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.io.IOException;
import java.util.Properties;

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

    public VBox TareasMostradas;

    public HBox filaEditar;
    @FXML
     public void onClickButtonCREAR() throws IOException {
        // un nuevo nodo quee hace un HBox
        var fila = new HBox();
        fila.setSpacing(120);
        // esto es una variable intermedia para no tener que pone fila.getChildren.add...
        var elementosFila = fila.getChildren();
        // creamos la variables para guardar el texto que viene del TextField y el TextArea
        var TituloTareaNuevo = new Text (nombreTareaCrear.getText());
        elementosFila.add(TituloTareaNuevo);
        var DescTareaNuevo = new Text(descTareaCrear.getText());
        elementosFila.add(DescTareaNuevo);


        // Creamos el botón de borrar
        var BotonBorrar = new Button("Borrar");
        // lo añadimos
        elementosFila.add(BotonBorrar);
        // Esto es la parte del código que se ejecuta cuando se pulsa el botón
        BotonBorrar.setOnAction(e->{
            Parent hbox = BotonBorrar.getParent();
            Parent vbox = BotonBorrar.getParent().getParent();
            ((VBox) vbox).getChildren().remove(hbox);
        });

        // Añadimos en el botón de modificar
        var BotonModificar = new Button("Modificar");
        elementosFila.add(BotonModificar);
        // Aqui vamos a poner el código que hará en tiempo de ejecución para el botón de ejecucción
        BotonModificar.setOnAction(e->{
            // Guardamos la referencia del padre del botón para poder utilizar para modificar los paramétros
            filaEditar = (HBox) BotonModificar.getParent();


            CuadroModificar.setVisible(true);
            CuadroCrear.setVisible(false);
            TareasMostradas.setVisible(false);
            //obtenemos las referencias de los controles Text con el titulo y la descripcion

            var tituloAModificar = (Text) ((HBox) filaEditar).getChildren().get(0);
            var DescAModificar = (TextArea) ((HBox) filaEditar).getChildren().get(1);

            // asignamos el texto de los controles TExt a los campos editables del formulario
            nombreTareaEditar.setText(tituloAModificar.getText());
            descTareaEditar.setText(DescAModificar.getText());

        });
        // vamos a añadir el titulo y la descripción
        var ContenedorTareasMostradas = TareasMostradas.getChildren();
        ContenedorTareasMostradas.add(fila);




    }



    public void onClickButtonEDITAR() throws IOException {

        CuadroModificar.setVisible(true);
        CuadroCrear.setVisible(false);
        TareasMostradas.setVisible(false);

        filaEditar.getChildren().set(0,new Text((nombreTareaEditar.getText())));
        filaEditar.getChildren().set(1,new Text((descTareaEditar.getText())));

        CuadroModificar.setVisible(false);
        CuadroCrear.setVisible(true);
        TareasMostradas.setVisible(true);

    }

}