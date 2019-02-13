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
public class Cat extends Animal {

    private String name;                 // Name of a cat
    private String breed;

    public Cat(String aName) {
        super("Cat");                      // Call the base constructor
        name = aName;                      // Supplied name
        breed = "Unknown";                 // Default breed value
    }

    public Cat(String aName, String aBreed) {
        super("Cat");                      // Call the base constructor
        name = aName;                      // Supplied name
        breed = aBreed;                    // Supplied breed
    }

    // Return a String full of a cat's details
    public String toString() {
        return super.toString() + "\nIt's " + name + " the " + breed;
    }

    // A miaowing method
    public void sound() {
        System.out.println("Miiaooww");
    }

    public void layEgg() {            // Cat breed
    }
}
