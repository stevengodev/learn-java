package com.foliaco;

import com.foliaco.models.Avion;
import com.foliaco.models.Pista;

public class App {

    public static void main(String[] args) throws InterruptedException {

        Pista pista = new Pista();

        Thread[] aviones = new Thread[4];
        aviones[0] = new Thread(new Avion("1101-x", 3000, pista));
        aviones[1] = new Thread(new Avion("2101-x", 7000, pista));
        aviones[2] = new Thread(new Avion("3101-x", 3000, pista));
        aviones[3] = new Thread(new Avion("4101-x", 4000, pista));

        // Asignamos prioridad a los hilos (10 es la más alta)
        aviones[0].setPriority(Thread.NORM_PRIORITY); // Prioridad normal
        aviones[1].setPriority(Thread.NORM_PRIORITY); // Prioridad normal
        aviones[2].setPriority(Thread.MAX_PRIORITY); // Emergencia (máxima prioridad)
        aviones[3].setPriority(Thread.NORM_PRIORITY); // Prioridad normal

        for (int i = 0; i < aviones.length; i++) {
            aviones[i].start();
        }

        try {
            for (int i = 0; i < aviones.length; i++) {
                aviones[i].join();
            }
        } catch (Exception e) {
            System.out.println("El proceso fue interrumpido.");
        }

        System.out.println("Todos los aviones han aterrizado o han sido desviados.");

    }
}
