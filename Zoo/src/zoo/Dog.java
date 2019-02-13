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
public class Dog extends Animal {

    private String name;                           // Name of a Dog
    private String breed;

    public Dog(String aName) {
        super("Dog");                                // Call the base constructor
        name = aName;                                // Supplied name
        breed = "Unknown";                           // Default breed value
    }

    public Dog(String aName, String aBreed) {
        super("Dog");                                // Call the base constructor
        name = aName;                                // Supplied name
        breed = aBreed;                              // Supplied breed
    }

    // Present a dog's details as a string
    public String toString() {
        return super.toString() + "\nIt's " + name + " the " + breed;
    }

    // A barking method
    public void sound() {
        System.out.println("Woof    Woof");
    }

    public void layEgg() {               // Cat breed
    }
    // Dog breed
}
