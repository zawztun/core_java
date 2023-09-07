package assignment_04.secondary;
import assignment_04.primary.Primary;
public class Secondary {
    public static void main(String[] args) {

        Primary obj = new Primary();
        System.out.println("\t|-----Use method from primary package ------|\t" );
        System.out.println("|\t-----------subtract , multiply , divide, factorial , reverse -------------|\t");

        obj.subtract(50,10);
        obj.multiply(2,8);
        obj.divide(20,4);
        obj.factorial(4);
        obj.reverse(123);

        System.out.println("|\t------------------------|\t");
    }
}
