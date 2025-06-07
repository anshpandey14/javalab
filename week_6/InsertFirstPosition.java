package week_6;

import java.util.ArrayList;

public class InsertFirstPosition {
     public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("B");
        list.add("C");
        list.add(0, "A"); // Insert at first position
        System.out.println(list); // [A, B, C]
    }
}
