package assignment_02;

import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int [] id = new int[5];
        String[] empName = new String[5];
        double[] salary = new double[5];


        Scanner sc = new Scanner(System.in);
        System.out.println("Please Type 5 Emp ID number , emp Name and Salary ");
        for(int i = 0; i < 2; i++){
            System.out.println("Enter emp id number : " );
            id[i]= sc.nextInt();
            System.out.println("Enter emp name : ");
            empName[i]= sc.next();
            System.out.println("Enter emp salary : " );
            salary[i]= sc.nextInt();
        }

        System.out.println("------------|Question Statement 1|------");
        display(id, empName, salary);
        System.out.println("------------|Question Statement 2 Overloading method|------");
        display(id, empName);
        System.out.println("------------|Question Statement 3 function will search by name |------");

        System.out.println("Search with employee name : ");
        String name = sc.next();
        display(name, id, empName , salary);
        }
        static void display(int[] id, String[] name, double[] salary){
            System.out.println( "\t ID" +" | " + "\t\t Name" + " | " +  "\tSalary");

            for (int i = 0; i < 5; i ++){

                System.out.println("\t" + id[i] + "\t\t | " + name[i] + " \t\t| " + salary[i]);
            }
        }

        // Overloading display method
    static void display(int[] id, String[] name){
        System.out.println( "\t ID" +" | " + "\t\t Name" );

        for (int i = 0; i < 2; i ++){
            System.out.println();
            System.out.println("\t" + id[i] + "\t\t | " + name[i] );
        }
    }
    static void display ( String name, int[] id, String[] empName, double[] salary) {
        for (int i = 0; i < 2; i ++){
            if(Objects.equals(name, empName[i])){

            System.out.println("Found the user you search: id number " + id[i] + "  |  Name : " + empName[i]+ " | Salary : " + salary[i] );
            }
        }

    }

    }

