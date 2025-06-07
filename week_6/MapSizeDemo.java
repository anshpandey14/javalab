package week_6;

import java.util.HashMap;

public class MapSizeDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        System.out.println("Size: " + map.size());
    }
}

