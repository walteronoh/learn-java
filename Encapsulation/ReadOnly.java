package Encapsulation;

// This class is read only

public class ReadOnly {
    // The name cannot be changed
    private String name = "James Bond";

    public String getName() {
        return this.name;
    }
}
