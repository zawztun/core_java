package assignment_01;

import java.util.Scanner;


//        Write a program to print 10 even numbers and 10 odd numbers.
//        Write a program to find factorial of a number.
//        Write a program to generate tables of 10.
//        Write a program to add the digits of a number.
//        Write a program to reverse the digits of a number.
//        Write a program to generate 10 Fibonacci numbers.


public class For_loop {
    public static void main(String[] args) {
        System.out.println("\t\t  Write a program to print 10 even numbers and 10 odd numbers. \t\t");
        System.out.println("\t-----------------------------------\t");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is Event Number.");
            } else {
                System.out.println(i + " is Odd Number.");
            }
        }
        System.out.println("--------------------- || ----------------");
        System.out.println("-----------------------------------------");


        System.out.println("\t\t Write a program to find factorial of a number. \t\t ");
        System.out.println("\t-----------------------------------\t");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int factorialNum = sc.nextInt();

        int fn = 1;
        for (int i = 2; i <= factorialNum; i++) {
            fn = fn * i;
        }
        System.out.println(fn);

        System.out.println("--------------------- || ----------------");
        System.out.println("-----------------------------------------");


        System.out.println("\t\t Write a program to generate tables of 10. \t\t ");
        System.out.println("\t-----------------------------------\t");

        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        for (int i = 1; i < 10; i++) {
            int res = i * n;
            System.out.println(n + " * " + i + " = " + res);
        }

        System.out.println("--------------------- || ----------------");
        System.out.println("-----------------------------------------");


        System.out.println("\t\t  Write a program to add the digits of a number. \t\t ");
        System.out.println("\t\t-----------------------------------\t\t");

        System.out.println("Enter a Number you want to add :  ");
        int addNum = sc.nextInt();
        int sum = 0;
        for (int temp = addNum; temp > 0; temp /= 10) {
            int digit = temp % 10;
            System.out.print(" + " + digit);
            sum += digit;
        }
        ;
        System.out.println(" =  " + sum);

        System.out.println("--------------------- || ----------------");
        System.out.println("-----------------------------------------");


        System.out.println("\t\t  Write a program to reverse the digits of a number. \t\t ");
        System.out.println("\t-----------------------------------\t");

        System.out.println("Enter a Number you want to Reverse:  ");
        int reverseNumber = sc.nextInt();
        int reverseNum = 0;
        for (int i = reverseNumber; i > 0; i /= 10) {
            int digit = i % 10;
            reverseNum = reverseNum * 10 + digit;
        }

        System.out.println(reverseNum);
        System.out.println("--------------------- || ----------------");
        System.out.println("-----------------------------------------");


        System.out.println("\t\t Write a program to generate 10 Fibonacci numbers. \t\t ");
        System.out.println("\t-----------------------------------\t");


        int fibNum = 10;

        int a = 0;
        int b = 1;

        for (int i = 0; i < fibNum; i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.print(a + ", ");
        }

    }
}
