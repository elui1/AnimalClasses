/*
 * All Cats are Animals but all Animals are not Cats
 */

// Inheritance - Cat is a subclass of Animal
public class Cat extends Animal {

    public Cat() {
        super();
        System.out.println("Now I am a Cat!");
    }

    // Polymorphism - Cat has its unique sleep method
    @Override
    public String sleep() {
        return "A cat sleeps...";
    }

    // Polymorphism
    @Override
    public String eat() {
        return "A cat eats...";
    }

    public String purr() {
        return "purrr...";
    }

}
