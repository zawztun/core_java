package assignment_01;

import java.util.Scanner;

public class If_Condition {

    public static void main(String[] args) {

        System.out.println("\t\t Write a program to check if a candidate is eligible for voting or not. (Hint: Check age) \t ");
        System.out.println("\t\t --------------------------||--------------------- \t\t");
        System.out.print("Enter Your Age :");
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        if (age < 18) {
            System.out.println("Your age is " + age + " years old. You are not eligible to vote.");
        } else {
            System.out.println("Your age is " + age + " year old. You are eligible to vote.");
        }

        System.out.println("\t\t --------------------------||---------------------\t\t");
        System.out.println("\t\t --------------------------------------------------\t\t ");


        // Check Number Zero or Positive or Negative
        System.out.println("\t\t Write a program to check if the number is positive or negative \t\t ");
        System.out.println(" --------------------------||--------------------- ");
        System.out.println("Enter number a number : ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("It is positive Number ");
        } else {
            System.out.println("it is negative number");
        }
        System.out.println(" --------------------------||--------------------- ");
        System.out.println(" -------------------------------------------------- ");

        System.out.println("\t\t Write a program to check if the number is positive or negative \t\t ");
        System.out.println(" --------------------------||--------------------- ");
        System.out.println("Enter number a number : ");
        int num1 = sc.nextInt();
        if (num1 == 0) {
            System.out.println(" It is Zero Number");
        } else if (num1 > 0) {
            System.out.println("It is positive Number ");
        } else {
            System.out.println("it is negative number");
        }
        System.out.println(" --------------------------||--------------------- ");
        System.out.println(" -------------------------------------------------- ");


        System.out.println("\t\t Find Largest of Two Number \t\t ");
        System.out.println(" --------------------------||--------------------- ");
        System.out.print("Enter your first number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter your second number : ");
        int num3 = sc.nextInt();
        if (num2 > num3) {
            System.out.println(num2 + " is greater than " + num3);
        } else if (num1 < num2) {
            System.out.println(num3 + " is greater than " + num2);
        } else {
            System.out.println(num2 + "and " + num3 + " are Same .");
        }

        System.out.println(" --------------------------||--------------------- ");
        System.out.println(" -------------------------------------------------- ");


        System.out.println("Write a program to Check given Number is Event or Odd.(Hint : use % Operator ");
        System.out.print("Enter a number : ");
        int choiceNum = sc.nextInt();
        if (choiceNum % 2 == 0) {
            System.out.println(choiceNum + " is Even Number .");
        } else {
            System.out.println(choiceNum + " is Odd Number. ");
        }
    }

}
