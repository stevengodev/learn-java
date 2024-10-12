package com.foliaco;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
    
    // Logger para la consola
    private static final Logger consoleLogger = LogManager.getLogger(App.class);

    // Logger para el archivo
    private static final Logger fileLogger = LogManager.getLogger("com.foliaco.fileLogger");

    public static void main(String[] args) {

        consoleLogger.info("Este es un mensaje de info en la consola.");
        consoleLogger.error("Este es un mensaje de error en la consola.");
        consoleLogger.debug("Este es un mensaje de debug en la consola.");
        consoleLogger.trace("Este es un mensaje de trace en la consola.");
        consoleLogger.fatal("Este es un mensaje de fatal en la consola.");
        consoleLogger.warn("Este es un mensaje de warn en la consola.");

        fileLogger.info("Este es un mensaje de info en el archivo.");
        fileLogger.error("Este es un mensaje de error en el archivo");
        fileLogger.debug("Este es un mensaje de debug en el archivo");
        fileLogger.trace("Este es un mensaje de trace en el archivo");
        fileLogger.fatal("Este es un mensaje de fatal en el archivo.");
        fileLogger.warn("Este es un mensaje de warn en la consola.");

    }
}
