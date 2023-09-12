package assignment_05.collection;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_01 {
    public static void main(String[] args) {
        HashMap<String,Integer > emp = new HashMap<>();
        while(emp.size() < 5){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Emp Name: ");
            String name = sc.next();
            System.out.println("Enter Emp ID: ");
            int id = sc.nextInt();
            emp.put(name, id);
        }
        System.out.println("---\t 5 employee records using HashMap ---\t");
        System.out.println(emp);
    }

}
