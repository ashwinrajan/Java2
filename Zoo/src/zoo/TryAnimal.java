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
public class TryAnimal {

    public static void main(String[] args) {
        // Create an array of three different animals
        //Dog d1=new Dog("","");
        Animal theAnimal1 = new Dog("Rover", "Poodle");
        Animal theAnimal2 = new Cat("Max", "Abyssinian");
        Animal theAnimal3 = new Duck("Daffy", "Aylesbury");

        Cat c1, c2;
        if (theAnimal1 instanceof Cat) {
            c1 = (Cat) theAnimal1;
        }

        c2 = (Cat) theAnimal2;

        theAnimal1.sound();
        theAnimal2.sound();
        theAnimal3.layEgg();
        System.out.println(theAnimal1);

        //  theAnimal2.sound();

        //WorkingDog sheepHerder=new WorkingDog("SheepHeader");
        // sheepHerder.setHoursOfTraining(72);
        //sheepHerder.work();

        // Animal theAnimaltry=new Animal();

        /*
         * Cat c; c=(Cat)theAnimal2; Dog d; if(theAnimal1 instanceof Dog) {
         * d=(Dog)theAnimal1;
         *
         * }
         *
         *
         *
         *
         * }
         * }
         *
         *     *
         */
    }
}
