package Abstract;
// An Abstract class is a class which has abstract keyword prefixed to it
// A class must be prefixed with abstract if it has one or more methods with abstract keyword
// An Abstract class serves as a blueprint for other classes and provides a common interface or behavior that its subclasses can inherit and implement.
// Instantiation: You cannot create objects of an abstract class using the new keyword. 
// Instead, you must create a subclass that extends the abstract class and instantiate the subclass.
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

     // An abstract method is only declared but not implemented
    //  abstract method sound() must be implemented by other subclasses
    public abstract void sound();

    // Concrete method
    // (non-abstract) methods with an implementation
    // These methods can be used directly by the concrete subclasses without overriding.
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}
