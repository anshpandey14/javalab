package week_6;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListReverse {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10); list.add(20); list.add(30);

        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
