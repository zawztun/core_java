package assignment_01;

import java.util.Scanner;

//        Write a program to print 10 even numbers and 10 odd numbers.
//        Write a program to find factorial of a number.
//        Write a program to generate tables of 10.
//        Write a program to add the digits of a number.
//        Write a program to reverse the digits of a number.
//        Write a program to generate 10 Fibonacci numbers.

public class While_loop {
    public static void main(String[] args) {
        System.out.println("\t\t  Write a program to print 10 even numbers and 10 odd numbers. \t\t");
        System.out.println("\t\t-----------------------------------\t\t");
        int num = 0;
        while( num < 20 ){
            num ++;
           if(num % 2 == 0){
               System.out.println(num + ": is Event Number. " );
           }else{
               System.out.println( num + ": is Odd Number. ");
           }
        }
        System.out.println("--------------------- || ----------------");
        System.out.println("-----------------------------------------");


        System.out.println("\t\t  Write a program to find factorial of a number. \t\t");
        System.out.println("\t-----------------------------------\t");
        System.out.println("Find factorial Number of : ");
        Scanner sc = new Scanner(System.in);
        int factorialNum = sc.nextInt();
        int res = 1;
        while(factorialNum > 1){
           res = res * factorialNum;
           factorialNum = factorialNum - 1;
        }
        System.out.println(res);

        System.out.println("--------------------- || ----------------");
        System.out.println("-----------------------------------------");

        System.out.println("\t\t Write a program to generate tables of 10. \t\t");
        System.out.println("\t-----------------------------------\t");
        System.out.println("Enter a Number : ");
        int generateNum = sc.nextInt();
        int initialNum = 0;
        while (initialNum < 10){
            initialNum++;
            int res1 = generateNum * initialNum;
            System.out.println( generateNum + " * " + initialNum + " = " + res1);
        }
        System.out.println("--------------------- || ----------------");
        System.out.println("-----------------------------------------");


        System.out.println("\t\t  Write a program to add the digits of a number. \t\t ");
        System.out.println("\t-----------------------------------\t");
        System.out.print("Enter a Number : ");
        int addNum = sc.nextInt();
        if(addNum < 0){
            System.out.println("Positive Number needed, try again. ");
        }else {
            int sum = 0;
            while (addNum > 0){
                int digit = addNum % 10;
                System.out.print( "+" + digit );
                sum = sum + digit;
                addNum = addNum / 10;
            }
            System.out.println( " = Result is " + sum);
        }
        System.out.println("--------------------||-------------------");
        System.out.println("----------------------------------------");

        System.out.println("\t\t Write a program to reverse the digits of a number. \t\t");
        System.out.println("\t-----------------------------------\t");
        System.out.println("Enter a Number :");
        int typeNum = sc.nextInt();
        int rvNumber = 0;
        while (typeNum != 0) {
            int digit = typeNum % 10;
            rvNumber = rvNumber * 10 + digit;
            typeNum /= 10;
        }
        System.out.println(rvNumber);

        System.out.println("--------------------- || ----------------");
        System.out.println("-----------------------------------------");


        System.out.println("\t\t Write a program to generate 10 Fibonacci numbers.\t\t ");
        System.out.println("\t-----------------------------------\t");
        int fibNum = 10;
        int a = 0;
        int b = 1;
        System.out.println("10 Fibonacci numbers :");
        while (fibNum !=0) {
            int c = a+b;
             a = b;
             b = c;
             fibNum--;
            System.out.print(  a + ", " );
        }
    }
}
