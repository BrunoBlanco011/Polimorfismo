package com.brunoblanco.actividadpolimorfismo.Models;

public class Instituto {
    DataBase dataBase = new Base1();
    DataBase dataBaseCopy = new Base2();
    DataBase dataBaseCopy2 = new Base3();

    public DataBase getDataBase() {
        return dataBase;
    }

    public DataBase getDataBaseCopy() {
        return dataBaseCopy;
    }

    public DataBase getDataBaseCopy2() {
        return dataBaseCopy2;
    }
}
