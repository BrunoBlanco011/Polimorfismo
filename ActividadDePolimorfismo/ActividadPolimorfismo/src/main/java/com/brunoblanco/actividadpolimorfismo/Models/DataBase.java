package com.brunoblanco.actividadpolimorfismo.Models;

public interface DataBase {

    void agregarStudent(Student alumno);
    void actualizarStudent(String editar, String nombre, String id);

}
