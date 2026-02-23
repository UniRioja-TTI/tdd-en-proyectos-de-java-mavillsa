package com.tt1.test;
import java.time.LocalDate;

public class ToDo {
    private String nombre;
    private String descripcion;
    private LocalDate fechaLimite;
    private boolean completado;

    // Constructor
    public ToDo(String nombre, String descripcion, LocalDate fechaLimite) {
    	this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaLimite = fechaLimite;
        this.completado = false;
    }

    public String getNombre() { return nombre; }
    public boolean isCompletado() { return completado; }
    public void setCompletado(boolean completado) { this.completado = completado;}
    public LocalDate getFechaLimite() { return fechaLimite; }
    public void setFechaLimite(LocalDate fechaLimite) { this.fechaLimite = fechaLimite; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    
}