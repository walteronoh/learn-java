package Generics;

public class Main {
    public static void main(String[] args) {
        // Passing string
        Box<String> box = new Box<>();
        box.setItem("Hello using Type 'String' ");
        System.out.println(box.getItem());
    }
}
