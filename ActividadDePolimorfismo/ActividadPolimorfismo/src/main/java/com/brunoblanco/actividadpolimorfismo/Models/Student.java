package com.brunoblanco.actividadpolimorfismo.Models;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class Student {

public String nombre;
public String id;
    public ArrayList<Student> students = new ArrayList<>();

    public Student(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static ObservableList<Student> getStudents() {
        ObservableList<Student> students = FXCollections.observableArrayList();
        return students;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " | ID: " + id;
    }
}
