package dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //Usado para alterar o formato de como a data/Hora pode ser passada
        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate ld01 = LocalDate.now(); // Instanciando uma data no formato local
        LocalDateTime ldt01 = LocalDateTime.now(); // Instanciando no formato data hora local

        Instant ist01 = Instant.now(); //Instanciando no formato data hora com horario UTC

        LocalDate ld02 = LocalDate.parse("2026-01-19");
        LocalDateTime ldt02 = LocalDateTime.parse("2026-01-19T19:48");

        Instant ist02 = Instant.parse("2026-01-19T19:50:26-03:00"); // instanciando um horario global 
        Instant ist03 = Instant.parse("2026-01-19T19:51:26Z");// instanciando horario global usando o meridiano de greenwich

        LocalDate ld03 = LocalDate.parse("19/01/2026",fmt);
        LocalDateTime ldt03 = LocalDateTime.parse("19/01/2026 20:10",fmt01);

        System.out.println("LD01 = " + ld01);
        System.out.println("LD02 = " + ld02);
        System.out.println("LD03 = " + ld03);

        System.out.println("LDT01 = " + ldt01);
        System.out.println("LDT02 = " + ldt02);
        System.out.println("LDT03 = " + ldt03);

        System.out.println("IST01 = " + ist01);
        System.out.println("IST02 = " + ist02);
        System.out.println("IST03 = " + ist03);

    }
}
