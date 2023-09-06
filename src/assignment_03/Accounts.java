package assignment_03;

public abstract class Accounts {
    long accNum;
    String name;
 float balance;
    public Accounts(long accNum, String name, float balance) {
        this.accNum = accNum;
        this.name = name;
        this.balance= balance;
    }
    abstract void deposit(float amt);
    abstract void withdraw(float amt);
    abstract  void checkBalance();
}
