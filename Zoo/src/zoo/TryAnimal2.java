/*
 Name: Ashwin Rajan
 Program: Computer Engineering
 Course: PROG 24178 Winter 2012
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

/**
 *
 * @author Ashwin Rajan
 */
public class TryAnimal2 {

    public static void main(String[] args) {

        Animal petChoice;                           // Choice of pet
        while (true) {
            int i = (int) (Math.random() * 3);
            switch (i) {
                case 1:
                    petChoice = new Cat("kitty");
                    break;
                case 2:
                    petChoice = new Dog("Rover", "Unknown bread");
                    break;
                default:
                    petChoice = new Duck("Micky", "Aylesbury");
                    break;
            }
            System.out.println("\nYour choice:\n" + petChoice);
            petChoice.sound();
            petChoice.layEgg();// Get the pet's reaction
        }
    }
}
