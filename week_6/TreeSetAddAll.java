package week_6;

import java.util.TreeSet;

public class TreeSetAddAll {
    public static void main(String[] args) {
        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(10); set1.add(20);

        TreeSet<Integer> set2 = new TreeSet<>();
        set2.add(30); set2.add(40);

        set1.addAll(set2);
        System.out.println(set1); // [10, 20, 30, 40]
    }
}

