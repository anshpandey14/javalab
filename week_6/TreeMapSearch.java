package week_6;

import java.util.TreeMap;

public class TreeMapSearch {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("X", 100);
        map.put("Y", 200);

        if (map.containsValue(100)) {
            System.out.println("Value 100 found in TreeMap");
        } else {
            System.out.println("Value not found");
        }
    }
}
