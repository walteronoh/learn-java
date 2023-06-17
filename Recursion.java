// Recursion in Java is where a method calls itself continuously

public class Recursion {
    static int count = 0;

    public static void main(String[] args) {
        // Infinite times
        // infiniteTimes();

        // Finite times
        // finiteTimes();

        // Factorial
        int n = 5;
        int factorial = factorial(n);
        // How the factorial will execute
        // factorial(5) 
        //     factorial(4) 
        //         factorial(3) 
        //             factorial(2) 
        //                 factorial(1) 
        //                 return 1 
        //                 return 2*1 = 2 
        //             return 3*2 = 6 
        //         return 4*6 = 24 
        //     return 5*24 = 120
        System.out.println("The factorial of " + n + " is " + factorial);

        // Fibonacci
        int l = 5;
        String fibonacci = "";
        for(int i = 0; i <= l; i++) {
            fibonacci += fibonacci(i);
            fibonacci += i == l ? "" : ",";
        };
        System.out.println("The fibonacci series of " + l + " is " + fibonacci);
    }

    // Infinite times
    public static void infiniteTimes() {
        System.out.println("Recursion in progress for infinite times");
        infiniteTimes();
    }

    // Finite times
    public static void finiteTimes() {
        count++;
        System.out.println("This is count " + count);
        if (count < 6) {
            finiteTimes();
        }
    }

    // Factorial
    // Factorial represents the multiplication of all numbers between 1 and n.
    public static int factorial(int n) {
        if (n == 1)
            return n;
        return n * factorial(n - 1);
    }

    // Fibonacci
    // The Fibonacci sequence is a mathematical sequence in which each number is the sum of the two preceding ones, starting from 0 and 1
    public static int fibonacci(int f) {
        if(f <= 1) return f;
        return fibonacci(f - 1) + fibonacci(f - 2);
    }
}
