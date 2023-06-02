package Abstract;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    // provide your own implementations of the sound() method
    public void sound() {
        System.out.println("woof!");
    }
}
