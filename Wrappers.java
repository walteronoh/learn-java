// Wrapper classes provide the mechanism for converting primitive into object and vice-versa
// Autoboxing - primitive into object
// Unboxing - object into primitive

// Scenarios of using Wrappers
// Change the value in method - Java only accepts call by value hence if we pass primitive value, the original value will not be changed unless we pass an object
// Serialization - We need to convert objects into streams in order to perform serialization
// Synchronization - Works with objects in multithreading

// The eight classes of the java.lang package are known as wrapper classes in Java
// Primitive Type   Wrapper Class
// 1. boolean       Boolean
// 2. char          Character
// 3. byte          Byte
// 4. short         Short
// 5. int           Integer
// 6. long          Long
// 7. float         Float
// 8. double        Double

public class Wrappers {
    public static void main(String[] args) {
        // int to Integer
        int a = 30;
        // Converting int into Integer explicitly
        Integer b = Integer.valueOf(a);
        // Autoboxing - The Integer.valueOf() will be written internally
        Integer c = a;
        System.out.println(a + " " + b + " " + c);

        // Integer to int
        Integer j = 40;
        // Converting Integer to int explicitly  
        int k = j.intValue();
        // Unboxing - The intValue() will be written internally
        int l = j;
        System.out.println(j + " " + k + " " + l);
    }
}
