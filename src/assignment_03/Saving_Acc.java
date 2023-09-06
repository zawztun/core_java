package assignment_03;

public class Saving_Acc extends Accounts{
    final float minBalance = 100;
    public Saving_Acc(long accNum, String name, float balance ) {
        super(accNum, name, balance);
    }
    @Override
    void deposit(float amt) {
        this.balance += amt;
        this.balance += this.balance * 0.04F;
        System.out.println("hell");
        System.out.println( amt + "Credited  | Balance " + this.balance + " $ "  );
    }

    @Override
    void checkBalance() {
        System.out.println(this.balance + " $ " );
    }

    @Override
    void withdraw(float amt) {
        if(this.balance > amt && (this.balance - amt ) > minBalance){
        this.balance -= amt;
        System.out.println( amt + " Credited  | Balance " + this.balance + " $ " );
        }else{
        System.err.println(" Error Insufficient Balance ");
        }
    }
}
