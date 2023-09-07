package assignment_04.threads;

public class Main_Thread extends Thread {
    public static void main(String[] args) {
        // Table_of_five task = new Table_of_five(); // task
        Thread table = new Thread(new Table_of_five());
        table.start();
        int count = 0;
        int num = 2;
        while( count < 20){
            if(num % 2 == 0){
                System.out.println("Even Number : " + num);
                count++;
            }
            num += 2;
        }
    }
}

