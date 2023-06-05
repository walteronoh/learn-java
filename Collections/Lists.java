package Collections;

import java.util.ArrayList;
import java.util.List;

// List - An ordered collection that allows duplicate elements. 
// Some commonly used implementations are ArrayList, LinkedList, and Vector.

public class Lists {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // Adding element to the list
        list.add("Blue");

        List<String> list1 = new ArrayList<>();
        list1.add("Yellow");
        list1.add("Green");

        // Adding another list to the existing list
        list.addAll(list1);

        System.out.println(list);

        // Displaying the list length
        int length = list.size();
        System.out.println("The list's length is:" + length);
    }
}
