/*
 Name: Ashwin Rajan
 Program: Computer Engineering
 Course: PROG 24178 Winter 2012
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Ashwin Rajan
 */
public class Reservation {

    public Room newroom;
    protected int reservationId;
    protected Date checkIn;
    protected Date checkOut;
    private int totalDaysStay;

    public Reservation() {
    }

    public Reservation(Date checkIn, Date checkOut, String roomType, String roomNum) {

        this.checkIn = checkIn;
        this.checkOut = checkOut;

        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(checkIn);
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(checkOut);
        this.daysBetween(cal1, cal2);

        this.generateReservationID();
        newroom = new Room(roomType, roomNum, totalDaysStay);

    }

    public void daysBetween(Calendar startDate, Calendar endDate) {
        Calendar date = (Calendar) startDate.clone();
        int daysBetween = 0;
        while (date.before(endDate)) {
            date.add(Calendar.DAY_OF_MONTH, 1);
            daysBetween++;
        }
        this.totalDaysStay = daysBetween;
    }

    public void generateReservationID() {

        this.reservationId = 1000000 + (int) (Math.random() * ((9999999 - 1000000) + 1));

    }

    public String toString() {

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String checkIn=format.format(this.checkIn);
        String checkOut=format.format(this.checkOut);

        return "\r\nCheck In: " + checkIn + "\r\nCheck Out: " + checkOut + "\r\nReservation Id: " + reservationId + newroom.toString();

    }
}
