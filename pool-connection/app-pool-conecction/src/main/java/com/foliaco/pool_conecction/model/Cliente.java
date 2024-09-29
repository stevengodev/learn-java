package com.foliaco.pool_conecction.model;

import java.time.LocalDateTime;

public class Cliente {
    
    private Long id;

    private String nombre;

    private String apellido;

    private String email;

    private LocalDateTime dateTime;

    

    public Cliente() {
    }

    

    public Cliente(String nombre, String apellido, String email, LocalDateTime dateTime) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.dateTime = dateTime;
    }



    public Cliente(Long id, String nombre, String apellido, String email, LocalDateTime dateTime) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.dateTime = dateTime;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }



    @Override
    public String toString() {
        return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email
                + ", dateTime=" + dateTime + "]";
    }

    

}
