package com.foliaco.models;

public class Pista {
    
    public synchronized boolean usarPista(String idAvion) {
        System.out.println("El avión " + idAvion + " está aterrizando...");
        try {
            Thread.sleep(3000); // Simula el tiempo de aterrizaje
            System.out.println("El avión " + idAvion + " ha aterrizado.");
            return true;
        } catch (InterruptedException e) {
            System.out.println("El avión " + idAvion + " fue interrumpido durante el aterrizaje.");
            return false;
        }
    }


}
