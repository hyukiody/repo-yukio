/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package application;

import model.entities.Reservation;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author nomosa
 */
public class ExceptionProjectBadSolution {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd//MM/yyyy");

        System.out.println("Room Number: ");
        int number = sc.nextInt();
        System.out.println("Check-in date (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(sc.next());
        System.out.println("Check-out date (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(sc.next());

        if (checkIn.after(checkOut)) {
            System.out.println("Error in reservation: Check-out date must be after check-in date");

        }
        else{
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
        }
        sc.close();
    }
}
