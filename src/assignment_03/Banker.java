package assignment_03;

import java.util.Scanner;

public class Banker {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        long accNum;
        String name;
        float amt;


        Accounts newAccount = null;

        while (true) {
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check the Balance");
            System.out.println("5. Exit");

            int opt = sc.nextInt();
            System.out.println();

            switch (opt) {
                case 1:
                    if (newAccount == null) {
                        System.out.println("Enter an Account Option: 1 for Checking 2 for Saving");
                        int opt2 = sc.nextInt();
                        switch (opt2) {
                            case 1:
                                System.out.print("Enter acc Number: ");
                                accNum = sc.nextLong();
                                System.out.print("Enter Name : ");
                                 name = sc.next();

                                System.out.println("Enter initial Amount deposit : ");
                                amt = sc.nextFloat();
                                newAccount = new Checking_Acc(accNum, name, amt);
                                break;
                            case 2:
                                System.out.println("Enter acc Number: ");
                                accNum = sc.nextLong();
                                System.out.println("Enter Name : ");
                                     name = sc.next();
                                System.out.println("Enter initial Deposit Amount: ");
                                 amt = sc.nextFloat();
                                newAccount = new Saving_Acc(accNum, name, amt);
                                break;
                        }
                    }
                    break;
                case 2:
                    if (newAccount != null) {
                        System.out.println(" Enter Your deposit Amount");
                         amt = sc.nextFloat();
                        newAccount.deposit(amt);
                    }
                    break;
                case 3:
                    if (newAccount != null) {
                        System.out.println(" Enter Your withdraw Amount : ");
                        amt = sc.nextFloat();
                        newAccount.withdraw(amt);
                    }
                    break;
                case 4:
                    if (newAccount != null) {
                        System.out.print("Your account balance is : ");
                        newAccount.checkBalance();

                    }
                    break;
                case 5:
                    System.exit(0);
                    System.out.println("Bye Bye");
            }
        }
    }
}
