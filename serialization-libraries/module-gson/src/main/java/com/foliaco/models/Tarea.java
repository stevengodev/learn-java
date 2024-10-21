package com.foliaco.models;

import java.time.LocalTime;

public class Tarea {
    private int id;
    private String nombre;
    private LocalTime horaEntrega;
    private boolean completada;

    public Tarea() {
    }

    
    public Tarea(int id, String nombre, LocalTime horaEntrega, boolean completada) {
        this.id = id;
        this.nombre = nombre;
        this.horaEntrega = horaEntrega;
        this.completada = completada;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LocalTime gethoraEntrega() {
        return horaEntrega;
    }
    public void sethoraEntrega(LocalTime horaEntrega) {
        this.horaEntrega = horaEntrega;
    }
    public boolean isCompletada() {
        return completada;
    }
    public void setCompletada(boolean completada) {
        this.completada = completada;
    }


    @Override
    public String toString() {
        return "Tarea [id=" + id + ", nombre=" + nombre + ", horaEntrega=" + horaEntrega + ", completada=" + completada
                + "]";
    }
    
    
    
    
}
