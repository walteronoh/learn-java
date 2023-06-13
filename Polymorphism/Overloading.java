package Polymorphism;

// compile-time polymorphism (Method Overloading)
// Allows you to define multiple methods with same names but different parameter list in the same class

public class Overloading {
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(Double a, Double b) {
        return a + b;
    }

    public static String add(String a, String b) {
        return a + " " + b;
    }
}
