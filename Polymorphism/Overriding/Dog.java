package Polymorphism.Overriding;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("A dog barks.");
    }
}
