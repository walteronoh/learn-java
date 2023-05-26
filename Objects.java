public class Objects {
    // Java objects hold a state, state are variables which are saved together within an object, we call them fields or member variables.
    int x;
    int y;

    // Adding constructors

    // 1. Adding constructor for ensuring the class is called with parameters
    Objects(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // 2. A constructor where the class will not be called with parameters
    Objects() {
        this(0, 0);
    }

    // The class can now be called in several ways

    // Adding methods
    Objects obj() {
        return new Objects(); 
        // or
        // return new Objects(x, y);
    }

    protected String s;
}

// Above class can now be called with parameters as follows
//var obj = new Objects(x, y)

// private and public keywords
// private - the class itself can access the variable or method
// public - can be accessed anywhere
// protected - can be accessed by the class itself of the extended classes (through inheritance)
