package com.tt1.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

class ServicioTest {
    private Servicio servicio;

    @BeforeEach
    void setUp() {
        DBStub db = new DBStub();
        Repositorio repo = new Repositorio(db);
        MailerStub mailer = new MailerStub();       
        servicio = new Servicio(repo, mailer);
    }

    @Test
    void testCrearYConsultarPendientes() {
        servicio.crearToDo("Llamar al médico", LocalDate.now());
        assertFalse(servicio.consultarPendientes().isEmpty());
    }
}