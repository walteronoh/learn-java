package Inheritance;

public class Parent {
    public static String getParentName(String childLastName) {
        String parentName;
        switch (childLastName) {
            case "John":
                parentName = "John Doe Sr";
                break;

            case "Monica":
                parentName = "Elvis Pasley";
                break;

            default:
                parentName = "It seems like the parent name cannot be found!";
                break;
        }
        return parentName;
    }
}
