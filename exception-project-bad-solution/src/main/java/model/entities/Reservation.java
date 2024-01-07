/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.entities;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

public class Reservation {

    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public long duration() {
        /*
        Date newCheckIn = new Date();
        Date newCheckOut = new Date();

        LocalDate localDate1 = newCheckIn.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        LocalDate localDate2 = newCheckOut.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        Long daysDifference = ChronoUnit.DAYS.between(localDate1, localDate2);

        return Math.toIntExact(daysDifference); 
         */

        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date newCheckIn, Date newCheckOut) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
//diferenca do dia da data de checkin e checkout
    }

    @Override
    public String toString() {
        return "Room"
                + roomNumber
                + ". check-in: "
                + sdf.format(checkIn)
                + ", check-out: "
                + sdf.format(checkOut)
                + ", "
                + duration()
                + " nights";
    }

}
