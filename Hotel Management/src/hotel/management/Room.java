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

/**
 *
 * @author Ashwin Rajan
 */
public class Room {

    private String roomType;
    private String roomNum;
    private double totalroomPrice;
    private final double kingSuiteRate = 139.99;
    private final double queenSuiteRate = 119.99;
    private final double singleSuiteRate = 99.99;

    public Room() {
    }

    public Room(String roomType, String roomNum, int totalDaysStay) {

        this.roomType = roomType;
        this.roomNum = roomNum;

        this.totalPriceCalculation(roomType, totalDaysStay);
    }

    public void totalPriceCalculation(String roomType, int totalDaysStay) {
        
        if ("KingSuite".equals(roomType)) {
            this.totalroomPrice = (kingSuiteRate * totalDaysStay);
        } else if ("QueenSuite".equals(roomType)) {
            this.totalroomPrice = (queenSuiteRate * totalDaysStay);
        } else if ("SingleSuite".equals(roomType)) {
            this.totalroomPrice = (singleSuiteRate * totalDaysStay);
        }

    }
    
    public String toString() {

        return "\r\nRoom Type: " + roomType + "\r\nRoom Num: " + roomNum + "\r\nTotal Room Price: " + totalroomPrice;

    }


}
