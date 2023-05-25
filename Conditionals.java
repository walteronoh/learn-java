public class Conditionals {
    // boolean variables are used to evaluate conditions
    public static void main(String[] args) {
        boolean a = true;
        if (a) {
            System.out.println("The condition is true");
        }

        int b = 3;
        if (b == 3) {
            System.out.println("The condition is true");
        }

        // Shorter ways of using if else statement
        if (a)
            System.out.println("The condition is true");
        else
            System.out.println("The condition is false");
        
        // Using ternary operator
        // variable c has to be declared first before assigning a value
        String c;
        c = a ? "The condition is true" : "The condition is false";
        System.out.println(c);

        // == and equals
        // The == operator will show if objects are same while equals will show if objects are logically equal
        String d = new String("Text");
        String e = new String("Text");
        String f = d;

        boolean g = d == e; // This is false since d and e are not the same object
        System.out.println(g);
        
        boolean g1 = d.equals(e); // This is true since d and e are logically equal
        System.out.println(g1);

        boolean g2 = f == d; // This is true since d and f are same objects
        System.out.println(g2);
    }

    public static void booleanOperators(String[] args) {
        int a = 4;
        int b = 5;
        boolean result;
        result = a < b; // true
        result = a > b; // false
        result = a <= 4; // a smaller or equal to 4 - true
        result = b >= 6; // b bigger or equal to 6 - false
        result = a == b; // a equal to b - false
        result = a != b; // a is not equal to b - true
        result = a > b || a < b; // Logical or - true
        result = 3 < a && a < 6; // Logical and - true
        result = !result; // Logical not - false
    }
}
