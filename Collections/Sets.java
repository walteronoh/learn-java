package Collections;

import java.util.HashSet;
import java.util.Set;

// Set - A collection that does not allow duplicate elements.
// Some commonly used implementations are HashSet, TreeSet, and LinkedHashSet.

public class Sets {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        // Add elements to the set
        set.add("Mitsubishi");
        set.add("Hyundai");

        Set<String> set1 = new HashSet<>();
        set1.add("Renault");
        set1.add("BMW");

        // Adding another set to the existing set
        set.addAll(set1);

        System.out.println(set);

        // Display the length of set
        System.out.println(set.size());
    }
}
