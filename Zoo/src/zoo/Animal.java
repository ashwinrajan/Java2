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
public abstract class Animal {

    private String type;

    public Animal(String aType) {
        type = new String(aType);
    }

    public String toString() {
        return "This is a " + type;
    }

    abstract public void sound();

    abstract public void layEgg();
}
// private void test(){}
// public final void test2(){}
// Dummy method to be implemented in the derived classes
// public abstract void sound();

