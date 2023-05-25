public class Variables {
    public static void main(String[] args) {
        // java is strongly typed hence types must be defined in variables/methods
        // primitive variables -> Hold simple data values and are not objects.
        // byte(number, 1 byte)
        byte a = 100;
        System.out.println(a);
        // short(number, 2 bytes)
        short b = 100;
        System.out.println(b);
        // int(number, 4 bytes)
        int c = 100;
        System.out.println(c);
        // long(number, 8 bytes)
        long d = 100;
        System.out.println(d);
        // float(float number, 4 bytes). - If you want to use float, you will have to cast
        float e = (float)100.1; // or shorter way = 100.1f
        System.out.println(e);
        // double(float number, 8 bytes)
        double f = 100.0;
        System.out.println(f);
        // char(a character, 2 bytes)
        char g = 'g';
        System.out.println(g);
        // boolean(true or false, 1 byte)
        boolean h = true;
        System.out.println(h);

        // non-primitive variables / reference types -> Store reference (memory addresses) to objects rather than the objects themselves
        // Include Classes, Interfaces, Arrays and Enumerations
        String i = "Sample String";
        System.out.println(i);
        String i1 = new String("Sample String 2");
        System.out.println(i1);
        int[] j = {1, 3, 5, 5};
        System.out.println(j);
    }
}
