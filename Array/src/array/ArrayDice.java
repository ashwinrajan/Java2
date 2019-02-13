/*
 Name: Ashwin Rajan
 Program: Computer Engineering
 Course: PROG 24178 Winter 2012
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author Ashwin Rajan
 */
public class ArrayDice {

    public static void main(String[] args) {
        int[] dice = {0, 0, 0, 0, 0, 0, 0};
        int i, num;
        for (i = 0; i < 100; i++) {
            num = (int) (Math.random() * 6) + 1;

            switch (num) {
                case 1:
                    dice[num]++;
                    break;
                case 2:
                    dice[num]++;
                    break;

                case 3:
                    dice[num]++;
                    break;

                case 4:
                    dice[num]++;
                    break;


                case 5:
                    dice[num]++;
                    break;

                case 6:
                    dice[num]++;
                    break;
            }
        }
        System.out.println(7 / 5);
        for (i = 1; i < 7; i++) {
            System.out.println("The frequency of occurance of" + i + " is " + dice[i]);
        }



    }
}

