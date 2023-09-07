package assignment_04.primary;
//Interfaces
// Write a program to define a queue interface
//and have insert and delete methods in the
//interface. Implement these methods in a class.
//        Packages
//        Write a program to define functions for subtract,
//        multiply, divide, factorial and reversing the digits of a number
//        in a package, import this class in another package and use all the methods
//        defined in the primary package.
//        Exception
//        Write a program to demonstrate
//        ArrayIndexOutOfBoundsException.Thread
//        Write a program to print tables of 5 by creating
//        a new thread and display 20 even numbers as a task of main thread.

public class Primary{
    public void subtract(int x , int y){
        System.out.println( " subtract :" + x+ "-" + y + " = " + ( x - y));
    }
    public void multiply (int x , int y){
        System.out.println(" Multiply :"  + x  + "*" + y + " = " + x * y);
    }
    public void divide (int x , int y){
        System.out.println(" Divide :"  + x  + "/" + y + " = " + x / y);
    }
    public void  factorial (int fto) {
        int fn = 1;
        for (int i = 2; i <= fto; i++) {
            fn = fn * i;
        }
        System.out.println("Factorial : " + fto + " = " + fn);
    }
    public void reverse(int revs){
        int reverseNum = 0;
        for (int i = revs; i > 0; i /= 10) {
            int digit = i % 10;
            reverseNum = reverseNum * 10 + digit;
        }
        System.out.println("Reverse :"+  revs + "=" +reverseNum);
    }
}

