/*
 Name: Ashwin Rajan
 Program: Computer Engineering
 Course: PROG 24178 Winter 2012
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package geometery;

/**
 *
 * @author Ashwin Rajan
 */

public class McmLength {

    private int meters = 0, centimeters = 0, milimeters = 0;

    McmLength(int m, int cm, int mm) {
        meters = m;
        centimeters = cm;
        milimeters = mm;
        System.out.println(meters + "m " + centimeters + "cm " + milimeters + "mm");
    }

    McmLength(int mm) {
        milimeters = mm;
    }

    McmLength() {
    }

    //add two lengths
    McmLength add(McmLength l2) {
        int mSum = 0, cmSum = 0, mmSum = 0;

        //add milimeters
        mmSum = this.milimeters + l2.milimeters;
        while (mmSum > 10) {
            mmSum -= 10;
            cmSum++;
        }

        //add centimeters
        cmSum = cmSum + this.centimeters + l2.centimeters;
        while (cmSum > 100) {
            cmSum = cmSum - 100;
            mSum++;
        }

        //add meters
        mSum = mSum + meters + l2.meters;

        return new McmLength(mSum, cmSum, mmSum);
    }

    //subtract 2 lengths
    McmLength subtract(McmLength l2) {
        int mSum = 0, cmSum = 0, mmSum = 0, mmSum2 = 0;

        //converts everything to milimeters
        mmSum = (meters * 1000) + (centimeters * 10) + (milimeters);
        mmSum2 = (l2.meters * 1000) + (l2.centimeters * 10) + (l2.milimeters);

        //checks the larger measurement
        if (mmSum > mmSum2) {
            //use length 1 as the larger number
            mmSum = mmSum - mmSum2;
            while (mmSum > 10) {
                mmSum -= 10;
                cmSum++;
            }
            while (cmSum > 100) {
                cmSum -= 100;
                mSum++;
            }
        } else {//use length 2 as the larger number
            mmSum = mmSum2 - mmSum;
            while (mmSum > 10) {
                mmSum -= 10;
                cmSum++;
            }
            while (cmSum > 100) {
                cmSum -= 100;
                mSum++;
            }
        }

        return new McmLength(mSum, cmSum, mmSum);
    }

    //multiplies 2 lengths
    McmLength multiply(McmLength l2) {
        int mSum = 0, cmSum = 0, mmSum = 0;

        //multiplies milimeters
        mmSum = this.milimeters * l2.milimeters;
        while (mmSum > 10) {
            mmSum -= 10;
            cmSum++;
        }

        //multiplies centimeters
        cmSum = cmSum + this.centimeters * l2.centimeters;
        while (cmSum > 100) {
            cmSum = cmSum - 100;
            mSum++;
        }

        //multiplies milimeters
        mSum = mSum + this.meters * l2.meters;

        return new McmLength(mSum, cmSum, mmSum);
    }

    int divide(McmLength l2) {
        int mmSum = 0, mmSum2 = 0, sum = 0;

        //converts everything to milimeters
        mmSum = (meters * 1000) + (centimeters * 10) + (milimeters);
        mmSum2 = (l2.meters * 1000) + (l2.centimeters * 10) + (l2.milimeters);

        //checks the larger measurement
        if (mmSum > mmSum2) {
            sum = mmSum / mmSum2;
        } else {
            sum = mmSum2 / mmSum;
        }

        return sum;
    }
}
