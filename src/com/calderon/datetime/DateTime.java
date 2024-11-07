package com.calderon.datetime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {

	public void init() {
		System.out.println();
		System.out.println("Metodo variado de fecha");
		
		System.out.println("La fecha actual es: " + LocalDate.now());
		System.out.println( "La hora actual es: " + LocalTime.now() );
		System.out.println( "La fecha y hora actuales son: " + LocalDateTime.now() );
		System.out.println( "El instante actual es: " + Instant.now() );
		System.out.println( "La fecha y hora actuales con zona horaria son: " + ZonedDateTime.now() );
		System.out.println();
		System.out.println("metodo para seleccion de fecha");
		
		System.out.println( "Fecha de mi cumpleaños: " + LocalDate.of(1972, Month.MAY, 23) );
		System.out.println( "Fecha de mi cumpleaños: " + LocalDate.of(1975, 5, 22) );
		System.out.println();
		
		System.out.println("Metodo de hora exacta");
		
		System.out.println( "Con la hora exacta: " + LocalDateTime.of(1972, Month.MAY, 23, 20, 01, 15, 0023) );
		
		LocalDate fechaActual = LocalDate.now();
		System.out.println("\n partes de una fecha");
		System.out.println("Hoy es: " +fechaActual.getDayOfWeek());
		System.out.println("mañana sera: " +fechaActual.plusDays(1).getDayOfWeek());
		
		System.out.println();
		System.out.println("Validación cuando caera el cumpleaños");
		LocalDate miCumple2024 = LocalDate.of(1979, 8, 9);
		System.out.println("en 2024 mi cumple cayo en: " + miCumple2024.getDayOfWeek());
		System.out.println("en 2025 mi cumple caerá en: " + miCumple2024.plusYears(1).getDayOfWeek());
		System.out.println("en 2023 mi cumple fue el: " + miCumple2024.minusYears(1).getDayOfWeek());
		
		
		System.out.println();
		System.out.println("construir fecha a partir de un string");
		LocalDate hoy = LocalDate.parse("2020-07-06");
		LocalDate seisNow = LocalDate.parse("6/11/2020", DateTimeFormatter.ofPattern("d/M/yyyy") );
		System.out.println("hoy: " + hoy );
		System.out.println("SeisNow: " + seisNow);
		
		System.out.println();
		System.out.println("construir fecha ISO por defecto");
		LocalDateTime fechaConHora = LocalDateTime.now();
		System.out.println("construir fecha a partir de un string");
		System.out.println("Formato por defecto: " + fechaConHora);
		System.out.println("Formato ISO 8601 (explícito): " + fechaConHora.format(DateTimeFormatter.ISO_DATE_TIME));
		DateTimeFormatter esDateFormat = DateTimeFormatter.ofPattern("W  dd/MM/yyyy hh:mm:ss a");
		System.out.println("Formato español (manual): " + fechaConHora.format(esDateFormat));
		
		System.out.println();
		System.out.println("muestra un periodo");
		LocalDate myDate = LocalDate.now();
		Period semestre = Period.ofMonths(6);
		System.out.println("hoy es: " + myDate);
		System.out.println("dentro de: " +  semestre + " sera el: " + myDate.plus(semestre));
		
		System.out.println();
		System.out.println("Hacer un periodo de tiempo");
		LocalTime myTime = LocalTime.now();
		Duration seisHoras = Duration.ofHours(6);
		System.out.println("Dentro de: " +seisHoras + " Será las: " + myTime.plus(seisHoras));
		
	}

}
