package com.tt1.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MailerStubTest {

    private MailerStub mailer;

    @BeforeEach
    void setUp() {
        // Arrange
        mailer = new MailerStub();
    }

    @Test
    void testEnviarCorreo() {
        // Act
        boolean resultado = mailer.enviarCorreo("profesor@unirioja.es", "Práctica terminada");

        // Assert
        assertTrue(resultado, "El método debería devolver true al enviar el correo");
    }
}