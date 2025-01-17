package com.brunoblanco.actividadpolimorfismo.Models;

import java.util.ArrayList;

public class Base2 implements DataBase{
    ArrayList <Student> students = new ArrayList<>();
    @Override
    public void agregarStudent(Student alumno) {
        students.add(alumno);
    }
    @Override
    public void actualizarStudent(String editar, String nombre, String id) {
        for (Student i: students){
            if (editar.equals(i.getId())){
                i.setId(id);
                i.setNombre(nombre);
            }
        }
    }
}
