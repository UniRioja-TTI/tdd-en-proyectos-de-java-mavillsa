package com.tt1.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Servicio {
    private Repositorio repositorio;
    private MailerStub mailer;

    public Servicio(Repositorio repositorio, MailerStub mailer) {
        this.repositorio = repositorio;
        this.mailer = mailer;
    }

    public void verificarYAlertarCaducados() {
        List<ToDo> todas = repositorio.obtenerTodasLasTareas();
        List<String> emails = repositorio.obtenerEmails();
        
        for (ToDo t : todas) {
            // Si no está completada y la fecha ya pasó
            if (!t.isCompletado() && t.getFechaLimite().isBefore(LocalDate.now())) {
                for (String email : emails) {
                    mailer.enviarCorreo(email, "¡Alerta! Tarea caducada: " + t.getNombre());
                }
            }
        }
    }

    public void crearToDo(String nombre, LocalDate fechaLimite) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        repositorio.guardarToDo(new ToDo(nombre, "", fechaLimite));
        verificarYAlertarCaducados();
    }

    public void agregarEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Email inválido");
        }
        repositorio.guardarEmail(email);
        verificarYAlertarCaducados();
    }

    public void finalizarTarea(String nombre) {
        repositorio.marcarCompletado(nombre);
        verificarYAlertarCaducados();
    }

    public List<ToDo> consultarPendientes() {
        verificarYAlertarCaducados();
        List<ToDo> pendientes = new ArrayList<>();
        for (ToDo t : repositorio.obtenerTodasLasTareas()) {
            if (!t.isCompletado()) {
                pendientes.add(t);
            }
        }
        return pendientes;
    }
}