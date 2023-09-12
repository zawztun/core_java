package assignment_05.collection;

import java.util.*;

public class Hash_Table {
    public static void main(String[] args) {

        Hashtable<String, Integer> table = new Hashtable<>();

        Scanner sc = new Scanner(System.in);
        while (table.size() < 3) {
            System.out.println("Enter Student name : ");
            String name = sc.next();
            System.out.println("Enter Student Mark : ");
            int mark = sc.nextInt();
            table.put(name, mark);
        }
        System.out.println(table);
        int maxValue = Collections.max(table.values());

        for (Map.Entry<String, Integer> entry : table.entrySet()) {
            if (entry.getValue() == maxValue) {
                String name = entry.getKey();
                System.out.println("Highest mark Student Name is " + name + " | Marks : " + maxValue);
            }
        }
    }
}
