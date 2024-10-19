package com.foliaco;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class App 
{
    public static void main( String[] args )
    {
        //fechas();
        //horas();
        //zonas_horarias();
        //periodos();
        duracion();
    }

    static void fechas(){

        // obtiene la fecha local actual 
        LocalDate localDate = LocalDate.now();

        //fecha a partir del año, mes y dia
        LocalDate localDate2 = LocalDate.of(2024, 10, 19);
        LocalDate localDate3 = LocalDate.of(2024, Month.OCTOBER, 10);
        
        //fecha a partir de un texto
        LocalDate localDate4 = LocalDate.parse("2024-12-31");

        //Combina la fecha con la hora definida
        System.out.println( localDate3.atTime(10, 10) );

        //Combina la fecha con el inicio del dia
        System.out.println(localDate.atStartOfDay());

        //Verifica si dos fechas son iguales
        System.out.println(localDate.equals(localDate2));

        //Obtener dia del mes
        System.out.println(localDate.get(ChronoField.DAY_OF_MONTH));
        System.out.println(localDate.getDayOfMonth());
    
        //Comprueba si es año bisiesto
        System.out.println(localDate.isLeapYear());

        //Obtiene los meses de la fecha de inicio hasta la fecha fin
        System.out.println(localDate.until(localDate4).getMonths());

        //Resta un periodo de dias a una fecha
        System.out.println(localDate4.minus(Period.ofDays(2)));

        //Obtiene el dia del año
        System.out.println(localDate4.getDayOfYear());

        //Resta un mes a la fecha
        System.out.println(localDate.minus(1, ChronoUnit.MONTHS));

        //Establece el primer dia del mes en la fecha
        System.out.println(localDate.with(TemporalAdjusters.firstDayOfMonth()));



    }

    static void horas(){

        LocalTime hora = LocalTime.now();

        System.out.println(hora.isBefore(LocalTime.parse("10:15")));
        System.out.println(hora.getMinute());
        System.out.println(LocalTime.MAX);
        System.out.println( hora.plus(1, ChronoUnit.HOURS) );
        System.out.println( hora.minusMinutes(10) );
        System.out.println(hora.minus(10, ChronoUnit.MINUTES));
    }

    static void zonas_horarias(){

        ZoneId zoneId = ZoneId.of("Brazil/Acre");

        //ZoneId.getAvailableZoneIds().forEach( z -> System.out.println(z) );

        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(), zoneId);
        System.out.println(zonedDateTime);

    }

    static void periodos(){
        //Usado para trabajar con tiempos en años, meses y días

        LocalDate fechaInicial = LocalDate.parse("2007-05-10");
        LocalDate fechaFinal = fechaInicial.plus(Period.ofDays(10));

        //Ambos traen el numero de dias entre dos fechas
        System.out.println(Period.between(fechaInicial, fechaFinal).getDays());
        System.out.println(ChronoUnit.DAYS.between(fechaInicial, fechaFinal));

    }

    static void duracion(){
        //Usado para trabajar con tiempos en segundos y nanosegundos
        LocalTime fechaInicial = LocalTime.of(2, 30, 0);
        LocalTime fechaFinal = fechaInicial.plus(Duration.ofHours(1));

        //Ambos traen el numero de segundos entre dos fechas
        System.out.println(Duration.between(fechaInicial, fechaFinal).getSeconds());

    }

}
