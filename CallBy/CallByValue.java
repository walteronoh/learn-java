package CallBy;

// If we call a method passing a value, it is known as call by value
// In case of a call by value, the original value is not changed

public class CallByValue {
    int a = 100;

    // If we use this.a, the value of a will change
    public void change(int a) {
        a = this.a + a;
        System.out.println("The value of a is : " + a);
    }
}
