package com.brunoblanco.actividadpolimorfismo.Controller;

import com.brunoblanco.actividadpolimorfismo.HelloApplication;
import com.brunoblanco.actividadpolimorfismo.Models.Base1;
import com.brunoblanco.actividadpolimorfismo.Models.Student;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

public class VistaController {

    @FXML
    private Button actualizarButton;

    @FXML
    private Button agregarButton;

    @FXML
    private ListView <String> tabla;

    @FXML
    void actualizarAlumnoButton(MouseEvent event) {
        HelloApplication.nuevaVentana(event,"Actualizar","Actualiza un estudiante");
    }

    @FXML
    void agregarAlumnoButton(MouseEvent event) {
        HelloApplication.nuevaVentana(event,"Agregar","Agrega un estudiante");
    }

    @FXML
    void initialize(){
        Base1 db = (Base1) HelloApplication.getInstituto().getDataBase();
        tabla.getItems().clear();
        for (Student i: db.getStudents()){
            tabla.getItems().add(i.toString());
        }
    }
}
