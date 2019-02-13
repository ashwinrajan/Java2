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
public class Duck extends Animal {

    private String name;     // Duck name
    private String breed;    // Duck breed

    public Duck(String aName) {
        super("Duck");        // Call the base constructor
        name = aName;         // Supplied name
        breed = "Unknown";    // Default breed value
    }

    public Duck(String aName, String aBreed) {
        super("Duck");        // Call the base constructor
        name = aName;         // Supplied name
        breed = aBreed;       // Supplied breed
    }

    // Return a String full of a duck's details
    public String toString() {
        return super.toString() + "\nIt's " + name + " the " + breed;
    }

    // A quacking method
    public void sound() {
        System.out.println("Quack quackquack");
    }

    public void layEgg() {
        System.out.println("Egg laid");
    }
}
