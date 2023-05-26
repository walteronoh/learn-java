public class Arrays {
    public static void main(String[] args) {
        // Arrays in java are also objects.
        // They need to be declared and then created.
        int arr[];
        arr = new int[4];
        // Add element to array
        arr[0] = 4;
        System.out.println("The element at index 0 is: " + arr[0]);
        // Checking the arrays length
        System.out.println("The length of the array is: " + arr.length);
        // Assigning multiple values in an array in one line
        int[] arr1 = { 3, 4, 6, 8};
        // To print out the elements in an array, you loop through the array
        for(int i = 0; i < arr1.length; i++) {
            System.out.println("The value at index: " + i + " is " + arr1[i]);
        }
    }
}
