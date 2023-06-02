package Interface;

// Implement the Vehicle interface
public class Car implements Vehicle {
    public void transmission(String str) {
        System.out.println("The Car's transmission is: " + str);
    }

    public void model(String str) {
        System.out.println("The Car's model is: " + str);
    }

    public void color(String str) {
        System.out.println("The Car's color is: " + str);
    }
}
