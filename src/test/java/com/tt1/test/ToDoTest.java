package com.tt1.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

class ToDoTest {

    private ToDo tarea;

    @BeforeEach
    void setUp() {
        // Arrange
        tarea = new ToDo("Hacer práctica", "Práctica de TDD", LocalDate.now().plusDays(2));
    }

    @Test
    void testGetNombre() {
        // Act & Assert
        assertEquals("Hacer práctica", tarea.getNombre(), "El nombre no coincide");
    }
}