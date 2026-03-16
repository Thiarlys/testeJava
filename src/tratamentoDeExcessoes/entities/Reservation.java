package tratamentoDeExcessoes.entities;

import tratamentoDeExcessoes.exceptions.DomainException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reservation {
    protected Integer roomNumber;
    protected LocalDate checkIn;
    protected LocalDate checkOut;

    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Reservation() {
    }
    public Reservation(Integer roomNumber, LocalDate checkin, LocalDate checkout) {
        this.roomNumber = roomNumber;
        this.checkIn = checkin;
        this.checkOut = checkout;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public long duration() {
        long diff = ChronoUnit.DAYS.between(checkIn,checkOut);
        return diff;
    }

    public void updateDates(LocalDate checkIn, LocalDate checkOut) throws DomainException{
        LocalDate date = LocalDate.now();
        if (checkIn.isBefore(date) || checkOut.isBefore(date) ) {
            throw new DomainException("Reservation date for update must be future dates");
        }
        if (!checkOut.isAfter(checkIn)) {
            throw new DomainException("Check-out date must be after check-in date");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Room: " + roomNumber +
                ", checkIn: " + dtf.format(checkIn) +
                ", checkOut: " + dtf.format(checkOut) +
                ", nights: " + duration();
    }
}
