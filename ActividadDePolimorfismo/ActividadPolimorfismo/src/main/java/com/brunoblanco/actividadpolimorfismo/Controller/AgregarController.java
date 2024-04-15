package com.brunoblanco.actividadpolimorfismo.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import com.brunoblanco.actividadpolimorfismo.HelloApplication;
import com.brunoblanco.actividadpolimorfismo.Models.DataBase;
import com.brunoblanco.actividadpolimorfismo.Models.Instituto;
import com.brunoblanco.actividadpolimorfismo.Models.Student;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class AgregarController {
    @FXML
    private TextField IdTextField;

    @FXML
    private Text NameText;

    @FXML
    private Label Title;

    @FXML
    private Button hechoButton;

    @FXML
    private TextField nombreTextField;

    @FXML
    void agregarAlumnoButton() {
        Instituto instituto = HelloApplication.getInstituto();

        String nombre = nombreTextField.getText();
        String id = IdTextField.getText();

        Student student = new Student(nombre,id);

        DataBase dataBase = instituto.getDataBase();
        DataBase dataBaseCopy = instituto.getDataBaseCopy();
        DataBase dataBaseCopy2 = instituto.getDataBaseCopy2();

        dataBase.agregarStudent(student);
        dataBaseCopy.agregarStudent(student);
        dataBaseCopy2.agregarStudent(student);

        ObservableList<Student> students = Student.getStudents();
        students.add(student);
    }
    @FXML
    void volverClick(MouseEvent event){
        HelloApplication.nuevaVentana(event,"Vista","Instituto Descartes");
    }
}
