package Generics;

// Generics provide a way of creating classes, methods and interfaces that can work with different types while maintaining type safety at compile time.
// Generics allow you to write reusable code that can be used with different types without sacrificing type checking.
// To define a generic class or interface, you use the angle brackets ("<>") notation followed by the type parameter(s)

// T is the type parameter. It can be replaced with any other type when instatiating class Box.
public class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
