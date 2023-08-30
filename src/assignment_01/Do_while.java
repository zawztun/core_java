package assignment_01;

//        Write a program to print 10 even numbers and 10 odd numbers.
//        Write a program to find factorial of a number.
//        Write a program to generate tables of 10.
//        Write a program to add the digits of a number.
//        Write a program to reverse the digits of a number.
//        Write a program to generate 10 Fibonacci numbers.

import java.util.Scanner;

public class Do_while {
    public static void main(String[] args) {
        System.out.println("\t\t  Write a program to print 10 even numbers and 10 odd numbers. \t\t");
        System.out.println("\t-----------------------------------\t");
        int i = 0;
        do {
            if (i % 2 == 0) {
                System.out.println(i + " is event number.");
            } else {
                System.out.println(i + " is odd number.");
            }
            i++;
        } while (i <= 20);
        System.out.println("--------------------- || ----------------");
        System.out.println("-----------------------------------------");



        System.out.println("\t\t Write a program to find factorial of a number. \t\t");
        System.out.println("\t-----------------------------------\t");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int factorialNum = sc.nextInt();

        int n = 1;
        do {
            n = n * factorialNum;
            factorialNum--;
        } while (factorialNum > 1);
        System.out.println(n);
        System.out.println("--------------------- || ----------------");
        System.out.println("-----------------------------------------");



        System.out.println("\t\t  Write a program to generate tables of 10. \t\t");
        System.out.println("\t-----------------------------------\t");
        System.out.println("Enter a Number : ");
        int gNum = sc.nextInt();
        int j = 0;
        do {
            ++j;
            int res = gNum * j;
            System.out.println(gNum + " * " + j + " = " + res);
        } while (j < 10);
        System.out.println("--------------------- || ----------------");
        System.out.println("-----------------------------------------");



        System.out.println("\t\t   Write a program to add the digits of a number. \t\t");
        System.out.println("\t-----------------------------------\t");
        System.out.println("Enter a add Number: ");
        int addNum = sc.nextInt();

        int sum = 0;
        do {
            int digit = addNum % 10;
            System.out.print("+" + digit);

            sum = sum + digit;
            addNum = addNum / 10;
        } while (addNum > 0);
        System.out.println(" =  " + sum);
        System.out.println("--------------------- || ----------------");
        System.out.println("-----------------------------------------");



        System.out.println("\t\t Write a program to reverse the digits of a number. \t\t");
        System.out.println("\t-----------------------------------\t");
        System.out.println("Enter a Number to Reverse: ");
        int revNum = sc.nextInt();
            int rvNumber = 0;
        do {
                int digit = revNum % 10;
                rvNumber = rvNumber * 10 + digit;
                revNum /= 10;
        }while(revNum != 0);
            System.out.println(rvNumber);
        System.out.println("--------------------- || ----------------");
        System.out.println("-----------------------------------------");



        System.out.println("\t\t Write a program to generate 10 Fibonacci numbers. \t\t");
        System.out.println("\t-----------------------------------\t");
        int fibNum = 10;
        int a =0;
        int b =1;
        System.out.print("10 Fibonacci Numbers: ");
        do{
            int c = a + b;
            a = b;
            b = c;
            fibNum--;
        System.out.print(a + " , ");
        }
        while(fibNum !=0 );
        System.out.println();
        System.out.println("--------------------- || ----------------");
        System.out.println("-----------------------------------------");
    }
}
