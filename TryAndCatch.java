public class TryAndCatch {
    // try/catch statement is used in the handling of Exceptions if you're unsure if an error will occur
    public static void main(String[] args) {
        // Below code will throw an error because Index 4 is out of bounds
        int index = 4;
        try {
            String value = getValueOfIndex(index);
            System.out.println("The value of index " + index + " is " + value);
        } catch(Exception exception) {
            System.out.println(exception);
        }
    }

    public static String getValueOfIndex(int index) {
        String[] arr = {"Reg", "Green", "Blue", "Yellow"};
        return arr[index];
    }
}
