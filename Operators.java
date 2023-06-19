// Operators are symbols that are used to perform operations

public class Operators {
    public static void main(String[] args) {
        relational();
        
        unary();

        arithmetic();

        shift();

        logical();

        ternary();
        
        assignment();
    }

    public static void relational() {
        // Relational operators are used to compare two values

        // Comparison
        int a = 10;
        int b = 20;

        System.out.println(a>b); // false

        // Equality
        System.out.println(a==b); // false
        System.out.println(a!=b); // true
    }

    public static void unary() {
        // Unary operators are used for:
        // 1. Incrementing/Decrementing a value by one
        // 2. Negating an expression
        // 3. Inverting the value of a boolean

        // Prefix operators - appear before a value i.e., --a, ++b, !b
        Boolean a = false;
        System.out.println(!a); // true

        int b = 10;
        System.out.println(--b); // 9

        System.out.println(++b); // 10

        int c = 11;
        System.out.println(~c); // -12 -> Minus of total positive value

        int d = -11;
        System.out.println(~d); // 10 -> Positive of total minus value

        // Postfix operators - appear after a value i.e., c++,c--
        int e = 15;
        System.out.println(e++); // 15

        System.out.println(e--); // 16
    }

    public static void arithmetic() {
        // Arithmetic operators act as basic mathematic operations
        int a = 15;
        int b = 10;

        // Addition
        System.out.println(a + b); // 25

        // Subtraction
        System.out.println(a - b); // 5

        // Multiplication
        System.out.println(a * b); // 150

        // Division
        System.out.println(a/b); // 1

        // Modulus
        System.out.println(15%10); // 5
    }

    public static void shift() {
        // Shift operators are used to shift all the bits of a value to either left/right side

        // Left shift operator
        // Shifts all the bits in a value to the left side in a specified number of times
        int a = 10;
        System.out.println(a<<2); // 40 -> 10 * 2 ^ 2

        System.out.println(a<<3); // 80 -> 10 * 2 ^ 3

        // Right shift operator
        // Shifts all the bits in a value to the right side in a specified number of times
        int b = 10;
        System.out.println(b>>2); // 2 -> 10 / 2 ^ 2

        System.out.println(b>>3); // 1 -> 10 / 2 ^ 3

        // >> vs >>>
        // For positive values, they act the same. But for negative number >>> changes parity bit (MSB) to 0
        int c = -20;

        System.out.println(c>>2); // -5 -> -20 / 2 ^ 2

        System.out.println(c>>>2); // 1073741819 -> -20 / 2 ^ 2
    }

    public static void logical() {
        // Checks if conditions matches

        int a = 10;
        int b = 15;
        int c = 20;

        // Logical operators - Operate on boolean expressions
        // bitwise operators - perform operations at the bit level

        // Logical && (AND)
        // checks the second condition if the first condition is true
        System.out.println(a<b && b<c); // true -> true && true

        // Bitwise &
        System.out.println(a>b & a<b); // false -> false & true

        // Logical || (OR)
        // checks the second condition whether the first condition is true or false
        System.out.println(a>b || c>b); // true -> false || true

        // Bitwise |
        System.out.println(a>b | c>b); // true -> false || true
    }

    public static void ternary() {
        // one line operator that replaces if...else statement
        // Takes three operands
        
        Boolean isColored = false;

        String b = isColored ? "The string is colored" : "The string is not colored";

        System.out.println(b);
    }

    public static void assignment() {
        // Assignment operators are used to assign value to a variable i.e., a = 10, b += 20
        int a = 20;
        System.out.println(a); // 20

        a += 10;
        System.out.println(a); // 30

        a -= 10;
        System.out.println(a); // 20
    }
}
