package com.foliaco.models;

import java.time.LocalDate;
import java.util.List;

public class Empleado {
    
    private String nombre;
    private LocalDate fechaNacimiento;
    private int numeroHijos;
    private List<String> telefonos;
    private Sexo sexo;
    private List<Tarea> tareas;

    public Empleado() {
    }

    public Empleado(String nombre, LocalDate fechaNacimiento, int numeroHijos, List<String> telefonos, Sexo sexo, List<Tarea> tareas) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroHijos = numeroHijos;
        this.telefonos = telefonos;
        this.sexo = sexo;
        this.tareas = tareas;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public int getNumeroHijos() {
        return numeroHijos;
    }
    public void setNumeroHijos(int numeroHijos) {
        this.numeroHijos = numeroHijos;
    }
    public List<String> getTelefonos() {
        return telefonos;
    }
    public void setTelefonos(List<String> telefonos) {
        this.telefonos = telefonos;
    }
    public Sexo getSexo() {
        return sexo;
    }
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public List<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(List<Tarea> tareas) {
        this.tareas = tareas;
    }

    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", numeroHijos=" + numeroHijos
                + ", telefonos=" + telefonos + ", sexo=" + sexo + ", tareas=" + tareas + "]";
    }

    
}
