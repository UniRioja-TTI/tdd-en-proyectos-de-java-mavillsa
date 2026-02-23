package com.tt1.test;

import java.util.ArrayList;
import java.util.List;

public class DBStub {
    private List<ToDo> tareas = new ArrayList<>();
    private List<String> emails = new ArrayList<>();

    public void crearTarea(ToDo tarea) {
        tareas.add(tarea);
    }

    public ToDo leerTarea(String nombre) {
        for (ToDo t : tareas) {
            if (t.getNombre().equals(nombre)) return t;
        }
        return null;
    }

    public void actualizarTarea(ToDo tarea) {
        ToDo t = leerTarea(tarea.getNombre());
        if (t != null) {
            t.setDescripcion(tarea.getDescripcion());
            t.setFechaLimite(tarea.getFechaLimite());
            t.setCompletado(tarea.isCompletado());
        }
    }

    public void borrarTarea(String nombre) {
        tareas.removeIf(t -> t.getNombre().equals(nombre));
    }

    public void guardarEmail(String email) {
        emails.add(email);
    }

    public List<String> obtenerEmails() {
        return emails;
    }

    public List<ToDo> obtenerTodasLasTareas() {
        return tareas;
    }
}