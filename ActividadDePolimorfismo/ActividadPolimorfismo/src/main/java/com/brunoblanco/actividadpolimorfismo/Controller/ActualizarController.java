package com.brunoblanco.actividadpolimorfismo.Controller;

import com.brunoblanco.actividadpolimorfismo.HelloApplication;
import com.brunoblanco.actividadpolimorfismo.Models.Instituto;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class ActualizarController {

    @FXML
    private Text ActualizarText;

    @FXML
    private Text IdText;

    @FXML
    private TextField update;

    @FXML
    private TextField IdTextField;

    @FXML
    private Text NameText1;

    @FXML
    private Label Title;
    @FXML
    private Button VolverButton;
    @FXML
    private Button hechoButton1;

    @FXML
    private TextField nombreTextField;

    @FXML
    void editarClick() {
        Instituto instituto = HelloApplication.getInstituto();

        String buscar = update.getText();
        String id = IdTextField.getText();
        String nombre = nombreTextField.getText();

        instituto.getDataBase().actualizarStudent(buscar,nombre,id);
        instituto.getDataBaseCopy().actualizarStudent(buscar,nombre,id);
        instituto.getDataBaseCopy2().actualizarStudent(buscar,nombre,id);


    }
    @FXML
    void volverClick(MouseEvent event) {
        HelloApplication.nuevaVentana(event,"Vista","Descartes");
    }

}
