package com.foliaco;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.foliaco.models.Empleado;
import com.foliaco.models.LocalDateTypeAdapter;
import com.foliaco.models.LocalTimeTypeAdapter;
import com.foliaco.models.Sexo;
import com.foliaco.models.Tarea;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class App 
{
    public static void main( String[] args )
    {
        Tarea tarea = new Tarea(1, 
                        "Generar reporte", 
                        LocalTime.of(10, 0), 
                        true
        );

        Empleado empleado = new Empleado("Steven", 
                                        LocalDate.of(2004, 4, 24), 
                                        0, 
                                        List.of("1111111111", "2222222222", "3333333333", "44444444444"), 
                                        Sexo.HOMBRE, 
                                        List.of(tarea)
        );

        Gson gson = new GsonBuilder()
                    .registerTypeAdapter(LocalDate.class, new LocalDateTypeAdapter())
                    .registerTypeAdapter(LocalTime.class, new LocalTimeTypeAdapter())
                    .create();
        
        String empleadoSerializado = gson.toJson(empleado);
        System.out.println("Objeto serializado: "+ empleadoSerializado);

        Empleado empleadoDeserializado = gson.fromJson(empleadoSerializado, Empleado.class);
        System.out.println("\nObjeto deserializado: " + empleadoDeserializado);

    }
}
