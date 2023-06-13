package Polymorphism.Overriding;

// runtime polymorphism (Method Overriding)
// Occurs when a subclass provides its own implementation of an already existing method in the superclass
// The method in the subclass must have the same name, return type and parameter list as the method in the superclass

public class Main {
    public static void main(String[] args) {
        // Animal class
        Animal animal = new Animal();
        animal.makeSound();
        // Override with Dog class
        Dog dog = new Dog();
        dog.makeSound();
        // Override with Cow class
        Cow cow = new Cow();
        cow.makeSound();
    }
}
