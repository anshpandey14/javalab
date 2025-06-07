package week_6;

import java.util.HashSet;

public class HashSetAppend {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("One");
        set.add("Two");
        // HashSet doesn't guarantee order but adding element appends logically
        set.add("Three");
        System.out.println(set);
    }
}
