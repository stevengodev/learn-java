package com.foliaco.models;

public class Avion implements Runnable {

    private String id;
    private long tiempoEspera;
    private Pista pista;

    public Avion(String id, long tiempoEspera, Pista pista) {
        this.id = id;
        this.tiempoEspera = tiempoEspera;
        this.pista = pista;
    }

    @Override
    public void run() {

        System.out.println("El avion " + id + " esta en el aire esperando para aterrizar");

        try {
            // Simula el tiempo que el avión espera antes de intentar aterrizar
            Thread.sleep(tiempoEspera); 

            //Si el tiempo es mayor a 5 segundos el avion se desvia por esperar demasiado
            if (tiempoEspera >= 5000) {
                System.out.println("El avión " + id + " ha sido desviado por esperar demasiado.");
                return;
            }

            pista.usarPista(id);

        } catch (InterruptedException e) {
            System.out.println("Avión " + id + " fue interrumpido antes de aterrizar.");
        }
    }

}
