package CallBy;

// In case of call by reference, the original value is changed
// If we pass Object in place of primitive value, the original value will be changed

public class CallByReference {
    String a = "Hello there, ";
    int b = 100;

    public void change(CallByReference callByReference) {
       callByReference.a = "Good morning";
       System.out.println(a);
    }
}
