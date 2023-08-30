package assignment_01;

//        Write programs to use all the data types and given arithmetic operations.
//        Write program to perform all the arithmetic operations given in the table.

public class Data_type_operations {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int add = a + b;
        int sub = b - a;
        int mt = a * b;
        int div = b / a;

        int x = 5;
        int y = 5;
        int inc = ++y;
        int dec = --x;


        System.out.println(a + " + " + b + " = " + add);
        System.out.println(b + " - " + a + " = " + sub);
        System.out.println(a + " * " + b + " = " + mt);
        System.out.println(b + " / " + a + " = " + div);
        System.out.println(inc);
        System.out.println(dec);
    }
}
