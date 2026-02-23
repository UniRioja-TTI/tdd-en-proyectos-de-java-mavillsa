package com.tt1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
class DBStubTest {
	private DBStub db;

	@BeforeEach
	void setUp(){
		db = new DBStub();
	}

	@Test
	void test() {
		ToDo tarea = new ToDo("Test", "Desc", LocalDate.now());   
        db.crearTarea(tarea); 
        assertNotNull(db.leerTarea("Test"));
	}

}
