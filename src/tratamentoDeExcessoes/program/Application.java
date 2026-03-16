package tratamentoDeExcessoes.program;

import tratamentoDeExcessoes.entities.Reservation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter the room number: ");
        int roomNumber = sc.nextInt();
        System.out.print("Check-in date: ");
        LocalDate checkIn = LocalDate.parse(sc.nextLine());
        System.out.print("Check-out date: ");
        LocalDate checkOut = LocalDate.parse(sc.nextLine());

        Reservation reserve = new Reservation(roomNumber,checkIn,checkOut);

        System.out.println(reserve);
        System.out.println("---------------");

        System.out.println("Enter data to update reservation: ");
        System.out.println("");
        checkIn = LocalDate.parse(sc.nextLine());


    }
}
