public class Loops {
    public static void main(String[] args) {
        // There are two kinds of loops in java i.e., for loop and while loop
        for(int i = 0; i < 2; i++) {}
        // Above for loop is divided into three sections
        // for(section 1; section 2; section 3) {}
        // section 1 - Runs once when we enter the loop
        // section 2 - gate keeper: it it returns true, we execute the statements in the loop. If it returns false, we exit the loop.
        // section 3 - the final statement that will run every time the loop runs
        // Every time the loop is finished, section 3 is run
        
        // We can omit section 1 and section 2 and the loop will still run though forever
        // for(;0<3;) {
        //     System.out.println("Runs");
        // }

        // While loop
        //while(condition) {}
        int i = 0;
        while(i < 5) {
            System.out.println("While loop value: " + i);
            i++;
        }

        // do while loop
        // do{}while(condtion);
        // This loop will run atleast one
        boolean b = false;
        do{
           System.out.println("Do While loop executed without checking condition");
        }while(b);

        // Foreach loop, a for loop version
        String[] arr = {"Mango","Apple","Banana"};
        // Variable j from below loop will change type according to the Array type e.g. int j, String j, ...
        for (String j : arr) {
            System.out.println("Value from foreach loop: " + j);
        }
        // The disadvantage of the foreach loop is, you wont be able to access the element index

        // break and continue
        // These two keywords help us control the loop from within it.
        
        // break - will cause the loop to stop and will go immediately to the next statement after the loop
        for(int k = 0; k < 3; k++) {
            if(k >= 2) {
                break;
            }
            System.out.println("Outside the break keyword with index: " + k);
        }

        // continue - will stop the current iteration and move to the next one.
        for(int k = 0; k < 3; k++) {
            if(k >= 2) {
                continue;
            }
            System.out.println("Outside the continue keyword with index: " + k);
        }
    }
}
