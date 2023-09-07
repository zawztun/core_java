package assignment_04.interface_implement;
public class SimpleQueue implements Queue {
    int[] data;
    int length;
    int top = 0;
    public SimpleQueue() {
        length = 5;
        data = new int[length];
    }

    @Override
    public void insert(int num) {
        if (top <= length) {
            data[top] = num;
            top += 1;
        } else {
            throw new IndexOutOfBoundsException("Array index is full");
        }
    }
    @Override
    public int delete() {
        int tmp = data[0];
        for (int i = 0; i < top; i++) {
            data[i] = data[i] + 1;
        }
        top -= 1;
        return tmp;
    }

    public void printAll() {
        for (int i = 0; i < top; i++) {
            System.out.println(data[i]);
        }
    }
    @Override
    public String toString() {
        System.out.println(" top : " + top + " length :  " + length);
        return super.toString();
    }
}

