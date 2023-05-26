public class Functions {
    private String name;
    // all function definitions must be inside a class
    // we also call functions methods.
    public static void main(String[] args) {
        String fullNames = getFullNames("John", "Doe");
        System.out.println("FullNames: " + fullNames);
    }

    // method/function with arguments
    public static String getFullNames(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    // non-static methods: can only be run on objects
    // can access and alter the field of the object
    // These methods can only be called on class instance
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Summary
    // Every Java method has to be within a class
    // Static methods belong to a class while non-static methods belong to objects
    // All parameters to functions are passed by value, primitives content is copied, while objects are not copied and some would say 'passed by reference'
}
