package Inheritance;
// Inheritance refers to the adoption of all non-private properties and methods of one class (superclass) by another class (subclass)
// Overriding - Process of replacing the original code with a new code to suit the current purpose
// Inheritance promotes code reuse and the concept of generic-to-specific implementation
public class Child extends Parent { // The "extends" keyword used to tell java that Child inherits the functionality of Parent.
    public static void main(String[] args) {
        String childLastName = "John";
        String parentName = getParentName(childLastName);
        System.out.println(childLastName +"'s" + " parent name is " + parentName);
    }
}
