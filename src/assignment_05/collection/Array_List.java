package assignment_05.collection;

import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            nums.add(i);
        }
        nums.forEach(System.out::println);
    }
}
