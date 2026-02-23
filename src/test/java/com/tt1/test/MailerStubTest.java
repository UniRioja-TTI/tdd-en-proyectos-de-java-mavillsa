package com.tt1.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MailerStubTest {

    private MailerStub mailer;

    @BeforeEach
    void setUp() {
        mailer = new MailerStub();
    }

    @Test
    void testEnviarCorreo() {
        boolean resultado = mailer.enviarCorreo("profesor@unirioja.es", "Práctica terminada");
        assertTrue(resultado, "El método debería devolver true al enviar el correo");
    }
}