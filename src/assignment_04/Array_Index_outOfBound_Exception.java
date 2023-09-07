package assignment_04;

import java.util.Scanner;
public class Array_Index_outOfBound_Exception {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Array Size ");
        int size = sc.nextInt();
        int [] arr = new int[size];

        for(int i = 0; i < arr.length; i++){
            arr[i] = 10 * i;
            System.out.println(arr[i]);
        }

        System.out.println("Enter Array index access: ");
        int idx = sc.nextInt();
        try {
            int value = arr[idx];
            System.out.println("Value at index " + idx + " is: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }
}


