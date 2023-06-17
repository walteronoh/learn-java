package CallBy;

public class Main {
    public static void main(String[] args) {
        // Call by value
        CallByValue callByValue = new CallByValue();
        // The value of a before calling change method
        System.out.println("Value of a before calling a : " + callByValue.a);
        callByValue.change(200);
          // The value of a after calling change method
          System.out.println("Value of a after calling a : " + callByValue.a);

        // Call by reference
        CallByReference callByReference = new CallByReference();
        // Before calling change
        System.out.println("Before calling change : " + callByReference.a);
        callByReference.change(callByReference);
        // After calling change
        System.out.println("After calling change : " + callByReference.a);
    }
}
