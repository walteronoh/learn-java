package Encapsulation;

// Encapsulation is the process of wrapping code and data together in a single unit

// Advantages
// - By providing the getter and setter methods, you can make the class read-only or a write-only
// - It provides you the control over data i.e, you can set some logics in the setter method to accept certain kind of data
// - It is a way of achieving data hiding because other classes will not be able to access the private members

public class Main {
    public static void main(String[] args) {
        String name = "John Doe";

        // Initialize Student
        Student student = new Student();
        // set student name
        student.setName(name);
        // display student name
        System.out.println(student.getName());

        // Read Only class
        ReadOnly readOnly = new ReadOnly();
        // get name
        System.out.println(readOnly.getName());

        // Write Only class
        WriteOnly writeOnly = new WriteOnly();
        writeOnly.setName(name);
    }
}
