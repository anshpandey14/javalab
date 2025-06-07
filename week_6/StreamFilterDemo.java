package week_6;

import java.util.*;
import java.util.stream.*;

public class StreamFilterDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "avocado", "blueberry");
        List<String> filtered = list.stream()
                                    .filter(s -> s.startsWith("a"))
                                    .collect(Collectors.toList());
        System.out.println(filtered); // [apple, avocado]
    }
}

