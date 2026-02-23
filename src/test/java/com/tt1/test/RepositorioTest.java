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
class RepositorioTest {
	private Repositorio repo;
    private DBStub dbStub;
	
	@BeforeEach
	void setUp(){
		dbStub = new DBStub(); 
        repo = new Repositorio(dbStub); 
	}

	@Test
	void test() {
		ToDo tarea = new ToDo("Comprar leche", "Desnatada", LocalDate.now());
        repo.guardarToDo(tarea);
        assertNotNull(repo.encontrarToDo("Comprar leche"));
	}

}
