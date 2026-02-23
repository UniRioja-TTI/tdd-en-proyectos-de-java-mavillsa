package com.tt1.test;

import java.util.List;

public class Repositorio {
    private DBStub db;

    public Repositorio(DBStub db) {
        this.db = db;
    }

    public ToDo encontrarToDo(String nombre) {
        return db.leerTarea(nombre);
    }

    public void marcarCompletado(String nombre) {
        ToDo t = db.leerTarea(nombre);
        if (t != null) {
            t.setCompletado(true);
            db.actualizarTarea(t);
        }
    }

    public void guardarToDo(ToDo tarea) {
        db.crearTarea(tarea);
    }

    public void guardarEmail(String email) {
        db.guardarEmail(email);
    }

    public List<String> obtenerEmails() {
        return db.obtenerEmails();
    }

    public List<ToDo> obtenerTodasLasTareas() {
        return db.obtenerTodasLasTareas();
    }
}