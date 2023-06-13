package Polymorphism;

// Polymorphism allows objects of different classes to be treated as objects of a common superclass
// It enables you to write code that can work with objects of different types, providing flexibility and reusable codebase

public class Main {
    public static void main(String[] args) {
        // OverLoading
        // Using int
        int sumInt = Overloading.add(1, 2);
        System.out.println("The OverLoad Value Of type int is: " + sumInt);
        // Using Double
        Double sumDouble = Overloading.add(1.3, 1.2);
        System.out.println("The OverLoad Value Of type Double is: " + sumDouble);
        // Using string
        String str = Overloading.add("John", "Bosco");
        System.out.println("The OverLoad Value Of type String is: " + str);
    }
}
