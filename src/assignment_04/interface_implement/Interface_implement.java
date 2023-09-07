package assignment_04.interface_implement;

public class Interface_implement {
    public static void main(String[] args) {
        SimpleQueue queue = new SimpleQueue();
        System.out.println("|\t-------------Queue interface implement ---------------|\t");
        for (int j = 0; j < 5; j++) {
            queue.insert(j);
        }

        System.out.println();
        int res = queue.delete();
        System.out.println("delete first queue : " + res);
        System.out.println();

        System.out.println("|\t------------- Queues left inside the array ---------------|\t");
        queue.printAll();
    }
}
