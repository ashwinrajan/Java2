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
public class TryAnimalArray {

    public static void main(String[] args) {
        // Create an array of three different animals

        Animal[] theAnimal = new Animal[20];
        theAnimal[0] = new Dog("Rover", "Poodle");
        theAnimal[1] = new Cat("Max", "Abyssinian");
        theAnimal[2] = new Duck("Daffy", "Aylesbury");
        for (int i = 0; i < 3; i++) {
            System.out.println(theAnimal[i]);
            theAnimal[i].sound();
        }






    }
}
